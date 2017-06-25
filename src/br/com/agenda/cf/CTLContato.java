
package br.com.agenda.cf;

import java.sql.Connection;
import java.sql.SQLException;

public class CTLContato {
    private Connection connection;
    
    public CTLContato() throws SQLException{
        connection = new ConnectionFactory().getConnection();
    }
    
}
