package Connection;

import Entities.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Connect {
    public static Connection connect(User userObj) {
        String urldb = "jdbc:mysql://localhost:3306/taller_mecanico_camilo?zeroDateTimeBehavior=convertToNull";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(urldb, userObj.getUser(), userObj.getPassword());
            System.out.println("Conexión exitosa a la base de datos");
            return cn;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar a la base de datos" + e);
            return null;
        }
    }
}
