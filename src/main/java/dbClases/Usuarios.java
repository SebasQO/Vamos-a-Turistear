/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbClases;

import com.vamosaturistear.HomeFrame;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sebas
 */
public class Usuarios {

    String Nombre;
    String Correo;
    String Telefono;
    String Contrasena;
    String Usuario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void mostrarUsuarios(JTable jTUsuarios) {

        dbClases.Conexion objConexion = new dbClases.Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        jTUsuarios.setRowSorter(OrdenarTabla);        

        modelo.addColumn("ID_Usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Usuario");

        jTUsuarios.setModel(modelo);
        
        String consulta = "SELECT * FROM dbo.Usuario";

        String[] datos = new String[5];
        Statement st;

        try {
            st = objConexion.conexion().createStatement();

            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }

            jTUsuarios.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }

    }

    public void SeleccionarAlumno(JTable paramTablaAlumnos, JTextField paramId, JTextField paramNombres, JTextField paramApellidos) {

        try {
            int fila = paramTablaAlumnos.getSelectedRow();

            if (fila >= 0) {
                paramId.setText((paramTablaAlumnos.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaAlumnos.getValueAt(fila, 1).toString()));
                paramApellidos.setText((paramTablaAlumnos.getValueAt(fila, 2).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    public void guardarUsuario(JTextField txtNombre, JTextField txtCorreo, JTextField txtTelefono, JTextField txtContrasena, JTextField txtUsuario, JTable jTUsuarios) {

        setNombre(txtNombre.getText());
        setCorreo(txtCorreo.getText());
        setTelefono(txtTelefono.getText());
        setContrasena(txtContrasena.getText());
        setUsuario(txtUsuario.getText());

        dbClases.Conexion objConexion = new dbClases.Conexion();

        String consulta = "INSERT INTO dbo.Usuario (Nombre, Correo, Telefono, Contrasena, Usuario) VALUES (?,?,?,?,?)";

        try {
            CallableStatement cs = objConexion.conexion().prepareCall(consulta);

            cs.setString(1, Nombre);
            cs.setString(2, Correo);
            cs.setString(3, Telefono);
            cs.setString(4, Contrasena);
            cs.setString(5, Usuario);

            cs.execute();
            JOptionPane.showMessageDialog(null, "Datos Guardados con Exito!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Datos Guardados con Exito! \nError: " + e.toString());

        }

    }

}
