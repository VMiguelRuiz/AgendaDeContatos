package br.com.agenda.cf;

import java.sql.Connection;

public class ContatoDAO {
    private Connection connection;
    
    public ContatoDAO(Connection connection){
        this.connection = connection;
    }
}
