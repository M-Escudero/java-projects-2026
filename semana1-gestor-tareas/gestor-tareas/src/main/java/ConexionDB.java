import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/bootcamp";
    private static final String NOMBRE = "postgres";
    private static final String PASSWORD = "3778";

    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL,NOMBRE, PASSWORD);
    }
}
