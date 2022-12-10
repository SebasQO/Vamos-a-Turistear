/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbClases;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas
 */
public class Inicio {

    public void usuarioCount(JLabel lblUsuariosCount) {

        try {

            ResultSet rs = null;
            PreparedStatement ps = null;
            dbClases.Conexion objConexion = new dbClases.Conexion();

            //Se hace la consulta con la DB
            String consulta = "SELECT COUNT(ID_Usuario) AS customerCount FROM dbo.Usuario";
            ps = objConexion.conexion().prepareStatement(consulta);

            //Se ejecuta toda la consulta
            rs = ps.executeQuery();

            while (rs.next()) {
                int count = rs.getInt("customerCount");
                //  int count = rs.getInt(1);

                if (10 > count) {

                    lblUsuariosCount.setText(String.valueOf("0" + count));

                } else if (10 >= count) {

                    lblUsuariosCount.setText(String.valueOf(count));

                }

            }

        } catch (Exception e) {
        }

    }

    public void sitioCount(JLabel lblSitios) {

        try {

            ResultSet rs = null;
            PreparedStatement ps = null;
            dbClases.Conexion objConexion = new dbClases.Conexion();

            //Se hace la consulta con la DB
            String consulta = "SELECT COUNT(ID_Sitio) AS sitioCount FROM dbo.Sitio";
            ps = objConexion.conexion().prepareStatement(consulta);

            //Se ejecuta toda la consulta
            rs = ps.executeQuery();

            while (rs.next()) {
                int count = rs.getInt("sitioCount");
                //  int count = rs.getInt(1);

                if (10 > count) {

                    lblSitios.setText(String.valueOf("0" + count));

                } else if (10 >= count) {

                    lblSitios.setText(String.valueOf(count));

                }

            }

        } catch (Exception e) {
        }

    }

    public void resenaCount(JLabel lblResena) {

        try {

            ResultSet rs = null;
            PreparedStatement ps = null;
            dbClases.Conexion objConexion = new dbClases.Conexion();

            //Se hace la consulta con la DB
            String consulta = "SELECT COUNT(ID_Sitio) AS resenaCount FROM dbo.Sitio";
            ps = objConexion.conexion().prepareStatement(consulta);

            //Se ejecuta toda la consulta
            rs = ps.executeQuery();

            while (rs.next()) {
                int count = rs.getInt("resenaCount");
                //  int count = rs.getInt(1);

                if (10 > count) {

                    lblResena.setText(String.valueOf("0" + count));

                } else if (10 >= count) {

                    lblResena.setText(String.valueOf(count));

                }

            }

        } catch (Exception e) {
        }

    }

    public void mostrarInicio(JTable jTInicio) {

        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            dbClases.Conexion objConexion = new dbClases.Conexion();

            DefaultTableModel modelo = new DefaultTableModel();
            jTInicio.setModel(modelo);

            //Se hace la consulta con la DB
            String consulta = "SELECT si.ID_Sitio, ca.ID_Catarata, ca.Nombre_Sitio FROM dbo.Sitio AS si JOIN dbo.Catarata AS ca ON si.ID_Sitio = ca.ID_Sitio";
            ps = objConexion.conexion().prepareStatement(consulta);
            rs = ps.executeQuery();

            ResultSetMetaData datos = rs.getMetaData();
            int cantidadColumnas = datos.getColumnCount();

            modelo.addColumn("ID_Sitio");
            modelo.addColumn("ID_Catarata");
            modelo.addColumn("Nombre_Sitio");

            int anchos[] = {90, 90, 90};
            for (int i = 0; i < cantidadColumnas; i++) {
                jTInicio.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
               
               Object arreglo[] = new  Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++){
                    arreglo[i] = rs.getObject(i + 1);
                }
                modelo.addRow(arreglo);
            }
            

        } catch (Exception e) {
        }

    }
}
