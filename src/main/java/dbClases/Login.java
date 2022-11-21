/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbClases;

import com.vamosaturistear.HomeFrame;
import com.vamosaturistear.LoginFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author Sebas
 */
public class Login {
    
    public void validarUsuario(JTextField jtxtUsuario, JPasswordField jtxtContrasena){
        
        try {
            
            ResultSet rs = null;
            PreparedStatement ps = null;     
            dbClases.Conexion objConexion = new dbClases.Conexion();
            
             //Se hace la consulta con la DB
            String consulta="SELECT * FROM dbo.Usuario where Usuario =(?) and Contrasena=(?);";
            ps = objConexion.conexion().prepareStatement(consulta);
            
            //Se convierte el password en texto
            String contra = String.valueOf(jtxtContrasena.getPassword());
            
            //Se obtiene el texto de los campos que ocupamos
            ps.setString(1, jtxtUsuario.getText());
            ps.setString(2,contra);
            
            //Se ejecuta toda la consulta
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null,"El Usuario es Correcto");
                HomeFrame objHome = new HomeFrame();
                objHome.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El Usuario es INCORRECTO, VUELVA A INTENTAR");
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e.toString());
        }
    
    }
    
    
}
