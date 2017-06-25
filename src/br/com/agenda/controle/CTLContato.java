
package br.com.agenda.controle;

import br.com.agenda.cf.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class CTLContato {
    private Connection connection;
    
    public CTLContato() throws SQLException{
        connection = new ConnectionFactory().getConnection();
    }
}
