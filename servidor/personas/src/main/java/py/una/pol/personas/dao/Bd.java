package py.una.pol.personas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.inject.Inject;

public class Bd {

    
    private static final String url = "jdbc:postgresql://localhost/personas";
    private static final String user = "postgres";
    private static final String password = "1234";
 
    /**
     * @return objeto Connection 
     */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    

}
