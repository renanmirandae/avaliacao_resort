let urlAvaliar = "/avaliar";
let nomeText = document.getElementById("nome");
let comentarioText = document.getElementById("comentario");
let avaliacaoSelect = document.getElementById("avaliacao");
let botaoAvaliar = document.getElementById("bt_avaliar");

let nome, comentario, avaliacao, body;

botaoAvaliar.addEventListener('click', (event) =>
{
    nome = nomeText.value == "" ? "Anônimo" : nomeText.value
    if(comentarioText.value.length <10 )
    {
        window.alert("Seu comentário deve conter no minimo 10 caracteres");
    }else{
        botaoAvaliar.disabled = true;
        comentario = comentarioText.value;
        avaliacao = avaliacaoSelect.value;
        body = {nome: nome, comentario: comentario, avaliacao: avaliacao};
        postarAvaliacao(body);
    }
    event.preventDefault();
});

//Postar Avaliação
const postarAvaliacao = 
function(body)
{
    fetch(urlAvaliar,
        {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            
            body: JSON.stringify(body)
        })
        .then(response => {
        if(response.status == 200)
        {
            window.location.replace("/avaliacoes.html");
        } 
        })
        .catch(error => {})
};
