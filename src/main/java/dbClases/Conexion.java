package dbClases;

import com.vamosaturistear.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasena = "root";
    String db = "dbturistear";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + "/" + db;
    
    public Connection conexion(){
        try {
            String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + db + ";encrypt=true;trustServerCertificate=true";
            
            conectar = DriverManager.getConnection(cadena,usuario,contrasena);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos:" + e.toString());
        }
        return conectar;
    }
    
    
}
