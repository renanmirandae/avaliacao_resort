package com.example.sistema_comentarios.service;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@Deprecated
public class ConfigurarJDBC {
    private String driver, url, user, password;
    private Logger logger = Logger.getLogger(ConfigurarJDBC.class);

    public ConfigurarJDBC() {
        setDriver("org.h2.Driver");
        setUrl("jdbc:h2:mem:resort");
        setUser("sa");
        setPassword("");
    }

    public Connection connectDataBase()
    {
        logger.debug("Conectando ao banco de dados, classe ConfigurarJDBC.");
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            logger.debug("Bloco Try connectDataBase, conexao efetuada com sucesso.");

        }catch(SQLException error)
        {
            logger.error("Erro em conexao com database.");
            error.printStackTrace();
        }
        return connection;
    }
}
