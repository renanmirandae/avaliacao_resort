let mediaAvaliacao = document.getElementById("media_avaliacao");
let listaAvaliacoes = document.getElementById("lista_avaliacoes");
let url = "/avaliacoes";

let avaliacoes = function()
{
    fetch(url, {
        method: "GET",
        headers:
        {
            "Content-Type": "application/json"
        }
    })
        .then(response => response.json())
        .then(data => {
            data.forEach(element => {
                //Criando elementos na página
                let section = document.createElement("section");
                let h1 = document.createElement("h1");
                let p = document.createElement("p");
                listaAvaliacoes.appendChild(section);
                section.appendChild(h1);
                section.appendChild(p);
                section.className = "comentario";

                h1.innerText = element["nome"];
                p.innerText = element["comentario"];
            });
        })
        .catch(erro => console.log(erro))
}

avaliacoes();