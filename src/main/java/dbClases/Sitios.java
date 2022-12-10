package dbClases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas
 */
public class Sitios {

    public void guardarDatos(JTextField txtNombre, JComboBox cmbCategoria,
            JTextField txtMovil, JTextField txtFijo, JComboBox cmbAcce,
            JComboBox cmbClima, JComboBox cmbParqueo, JComboBox cmbMascotas,
            JComboBox cmbVehiculo, JTextArea txtRecomendaciones, JTextField txtProvincia,
            JTextField txtCanton, JTextField txtDistrito, JTextField txtCPostal, JTextArea txtDireccion,
            JTextField txtSitio, JTextField txtComida, JTextField txtHospedaje, JTextField txtExtras, JTextField txtTotal) {

        ResultSet rs = null;
        PreparedStatement ps = null;
        dbClases.Conexion objConexion = new dbClases.Conexion();

        String categoria = cmbCategoria.getSelectedItem().toString();

        int cuentaDatos = 0;
        String Ficha_Detalles = "DE";
        String Ficha_Catarata = "CA";
        String Ficha_SI = "SI";
        String Ficha_CostoG = "CG";
        String Ficha_Vehiculo = "VEH";
        String Ficha_Recomendaciones = "REC";
        String Ficha_Mascotas = "MAC";
        String Ficha_Telefono = "TEL";
        String Ficha_Parqueo = "PAR";
        String Ficha_Clima = "CLI";
        String Ficha_Accesibilidad = "ACC";
        String Ficha_Direccion = "DIR";
        String Ficha_Rating = "RA";

        if (categoria == "Catarata") {

            String consultaCount = "SELECT COUNT(ID_Catarata) AS catarataCount FROM dbo.Catarata";

            String insSitios = "INSERT INTO dbo.Sitio (Ficha_Sitio, Fecha_Registro) VALUES (?, ?)";
            String insCatarata = "INSERT INTO dbo.Catarata (Ficha_Catarata, ID_Sitio, Nombre_Sitio, ID_Detalles) VALUES (?, ?, ?, ?)";

            String insDetalles = "INSERT INTO dbo.Detalles (Ficha_Detalles, ID_Direccion, ID_Rating, ID_Accesibilidad, ID_Clima, ID_Parqueo, ID_Telefono, ID_Mascotas, "
                    + "ID_Recomendaciones, ID_Vehiculo, ID_Costo) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            String insCostoGeneral = "INSERT INTO dbo.Costo_General (Ficha_CostoG, costo_Sitio, costo_comida, costo_hospedaje, costo_extra, costo_Total) VALUES (?, ?, ?, ?, ?, ?)";
            String insVehiculo = "INSERT INTO dbo.Vehiculo (Ficha_Vehiculo, Tipo_Vehiculo) VALUES (?, ?)";
            String insRecomendaciones = "INSERT INTO dbo.Recomendaciones (Ficha_Recomendaciones, Recomendaciones) VALUES (?, ?)";
            String insMascotas = "INSERT INTO dbo.Mascotas (Ficha_Mascotas, Accesibilidad_Mascotas) VALUES (?, ?)";
            String insTelefono = "INSERT INTO dbo.Telefono (Ficha_Telefono, Numero_Movil, Numero_Fijo) VALUES (?, ?, ?)";
            String insParqueo = "INSERT INTO dbo.Parqueo (Ficha_Parqueo, disponibilidad_Parqueo) VALUES (?, ?)";
            String insClima = "INSERT INTO dbo.Clima (Ficha_Clima, Tipo_Clima) VALUES (?, ?)";
            String insAccesibilidad = "INSERT INTO dbo.Accesibilidad (Ficha_Accesibilidad, Tipo_Accesibilidad) VALUES (?, ?)";
            String insDireccion = "INSERT INTO dbo.Direccion (Ficha_Direccion, Provincia, Canton, Distrito, Codigo_Postal, Direccion_Detallada) VALUES (?, ?, ?, ?, ?, ?)";
            String insRating = "INSERT INTO dbo.Rating (Ficha_Rating, Rating, Cantidad_Rating) VALUES (?, ?, ?)";

            try {
                ps = objConexion.conexion().prepareStatement(consultaCount);
                rs = ps.executeQuery();

                while (rs.next()) {
                    cuentaDatos = rs.getInt("catarataCount");

                    if (10 > cuentaDatos) {

                        if (cuentaDatos == 0) {
                            cuentaDatos = cuentaDatos;
                        } else if (cuentaDatos != 0) {
                            cuentaDatos = cuentaDatos + 1;
                        }

                        Ficha_Catarata = Ficha_Catarata + "000" + cuentaDatos;
                        Ficha_Detalles = Ficha_Detalles + "000" + cuentaDatos;
                        Ficha_SI = Ficha_SI + "000" + cuentaDatos;
                        Ficha_CostoG = Ficha_CostoG + "000" + cuentaDatos;
                        Ficha_Vehiculo = Ficha_Vehiculo + "000" + cuentaDatos;
                        Ficha_Recomendaciones = Ficha_Recomendaciones + "000" + cuentaDatos;
                        Ficha_Mascotas = Ficha_Mascotas + "000" + cuentaDatos;
                        Ficha_Telefono = Ficha_Telefono + "000" + cuentaDatos;
                        Ficha_Parqueo = Ficha_Parqueo + "000" + cuentaDatos;
                        Ficha_Clima = Ficha_Clima + "000" + cuentaDatos;
                        Ficha_Accesibilidad = Ficha_Accesibilidad + "000" + cuentaDatos;
                        Ficha_Direccion = Ficha_Direccion + "000" + cuentaDatos;
                        Ficha_Rating = Ficha_Rating + "000" + cuentaDatos;

                    } else if (10 <= cuentaDatos) {

                        Ficha_Catarata = Ficha_Catarata + "00" + cuentaDatos;
                        Ficha_Detalles = Ficha_Detalles + "00" + cuentaDatos;
                        Ficha_SI = Ficha_SI + "00" + cuentaDatos;
                        Ficha_CostoG = Ficha_CostoG + "00" + cuentaDatos;
                        Ficha_Vehiculo = Ficha_Vehiculo + "00" + cuentaDatos;
                        Ficha_Recomendaciones = Ficha_Recomendaciones + "00" + cuentaDatos;
                        Ficha_Mascotas = Ficha_Mascotas + "00" + cuentaDatos;
                        Ficha_Telefono = Ficha_Telefono + "00" + cuentaDatos;
                        Ficha_Parqueo = Ficha_Parqueo + "00" + cuentaDatos;
                        Ficha_Clima = Ficha_Clima + "00" + cuentaDatos;
                        Ficha_Accesibilidad = Ficha_Accesibilidad + "00" + cuentaDatos;
                        Ficha_Direccion = Ficha_Direccion + "00" + cuentaDatos;
                        Ficha_Rating = Ficha_Rating + "00" + cuentaDatos;

                    }
                }

                CallableStatement csinsCatarata = objConexion.conexion().prepareCall(insCatarata);
                CallableStatement csinsDetalles = objConexion.conexion().prepareCall(insDetalles);
                CallableStatement csinsSitios = objConexion.conexion().prepareCall(insSitios);
                CallableStatement csinsVehiculo = objConexion.conexion().prepareCall(insVehiculo);
                CallableStatement csinsCostoGeneral = objConexion.conexion().prepareCall(insCostoGeneral);
                CallableStatement csinsRecomendaciones = objConexion.conexion().prepareCall(insRecomendaciones);
                CallableStatement csinsMascotas = objConexion.conexion().prepareCall(insMascotas);
                CallableStatement csinsTelefono = objConexion.conexion().prepareCall(insTelefono);
                CallableStatement csinsParqueo = objConexion.conexion().prepareCall(insParqueo);
                CallableStatement csinsClima = objConexion.conexion().prepareCall(insClima);
                CallableStatement csinsAccesibilidad = objConexion.conexion().prepareCall(insAccesibilidad);
                CallableStatement csinsDireccion = objConexion.conexion().prepareCall(insDireccion);
                CallableStatement csinsRating = objConexion.conexion().prepareCall(insRating);

                csinsSitios.setString(1, Ficha_SI);
                csinsSitios.setString(2, LocalDate.now().toString());
                csinsSitios.execute();

                csinsCostoGeneral.setString(1, Ficha_CostoG);
                csinsCostoGeneral.setFloat(2, Float.parseFloat(txtSitio.getText()));
                csinsCostoGeneral.setFloat(3, Float.parseFloat(txtComida.getText()));
                csinsCostoGeneral.setFloat(4, Float.parseFloat(txtHospedaje.getText()));
                csinsCostoGeneral.setFloat(5, Float.parseFloat(txtExtras.getText()));
                csinsCostoGeneral.setFloat(6, Float.parseFloat(txtTotal.getText()));
                csinsCostoGeneral.execute();

                csinsVehiculo.setString(1, Ficha_Vehiculo);
                csinsVehiculo.setString(2, cmbVehiculo.getSelectedItem().toString());
                csinsVehiculo.execute();

                csinsRecomendaciones.setString(1, Ficha_Recomendaciones);
                csinsRecomendaciones.setString(2, txtRecomendaciones.getText());
                csinsRecomendaciones.execute();

                csinsMascotas.setString(1, Ficha_Mascotas);
                csinsMascotas.setString(2, cmbMascotas.getSelectedItem().toString());
                csinsMascotas.execute();

                csinsTelefono.setString(1, Ficha_Telefono);
                csinsTelefono.setInt(2, Integer.parseInt(txtMovil.getText()));
                csinsTelefono.setInt(3, Integer.parseInt(txtFijo.getText()));
                csinsTelefono.execute();

                csinsParqueo.setString(1, Ficha_Parqueo);
                csinsParqueo.setString(2, cmbParqueo.getSelectedItem().toString());
                csinsParqueo.execute();

                csinsClima.setString(1, Ficha_Clima);
                csinsClima.setString(2, cmbClima.getSelectedItem().toString());
                csinsClima.execute();

                csinsAccesibilidad.setString(1, Ficha_Accesibilidad);
                csinsAccesibilidad.setString(2, cmbAcce.getSelectedItem().toString());
                csinsAccesibilidad.execute();

                csinsDireccion.setString(1, Ficha_Direccion);
                csinsDireccion.setString(2, txtProvincia.getText());
                csinsDireccion.setString(3, txtCanton.getText());
                csinsDireccion.setString(4, txtDistrito.getText());
                csinsDireccion.setString(5, txtCPostal.getText());
                csinsDireccion.setString(6, txtDireccion.getText());
                csinsDireccion.execute();

                csinsRating.setString(1, Ficha_Rating);
                csinsRating.setString(2, "0");
                csinsRating.setInt(3, 0);
                csinsRating.execute();

                String SidDireccion = "SELECT ID_Direccion FROM dbo.Direccion WHERE Ficha_Direccion = (?);";
                String SidRating = "SELECT ID_Rating FROM dbo.Rating WHERE Ficha_Rating = (?);";
                String SidAccesibilidad = "SELECT ID_Accesibilidad FROM dbo.Accesibilidad  WHERE Ficha_Accesibilidad = (?);";
                String SidClima = "SELECT ID_Clima FROM dbo.Clima WHERE Ficha_Clima = (?);";
                String SidParqueo = "SELECT ID_Parqueo FROM dbo.Parqueo WHERE Ficha_Parqueo = (?);";
                String SidTelefono = "SELECT ID_Telefono FROM dbo.Telefono WHERE Ficha_Telefono = (?);";
                String SidMascotas = "SELECT ID_Mascotas FROM dbo.Mascotas WHERE Ficha_Mascotas = (?);";
                String SidRecomendaciones = "SELECT ID_Recomendaciones FROM dbo.Recomendaciones WHERE Ficha_Recomendaciones = (?);";
                String SidVehiculo = "SELECT ID_Vehiculo FROM dbo.Vehiculo WHERE Ficha_Vehiculo = (?);";
                String SidCosto = "SELECT ID_Costo FROM dbo.Costo_General WHERE Ficha_CostoG = (?);";

                CallableStatement csselDireccion = objConexion.conexion().prepareCall(SidDireccion);
                csselDireccion.setString(1, Ficha_Direccion);
                csselDireccion.execute();

                CallableStatement csselRating = objConexion.conexion().prepareCall(SidRating);
                csselRating.setString(1, Ficha_Rating);
                csselRating.execute();

                CallableStatement csselAccesibilidad = objConexion.conexion().prepareCall(SidAccesibilidad);
                csselAccesibilidad.setString(1, Ficha_Accesibilidad);
                csselAccesibilidad.execute();

                CallableStatement csselClima = objConexion.conexion().prepareCall(SidClima);
                csselClima.setString(1, Ficha_Clima);
                csselClima.execute();

                CallableStatement csselParqueo = objConexion.conexion().prepareCall(SidParqueo);
                csselParqueo.setString(1, Ficha_Parqueo);
                csselParqueo.execute();

                CallableStatement csselTelefono = objConexion.conexion().prepareCall(SidTelefono);
                csselTelefono.setString(1, Ficha_Telefono);
                csselTelefono.execute();

                CallableStatement csselMascotas = objConexion.conexion().prepareCall(SidMascotas);
                csselMascotas.setString(1, Ficha_Mascotas);
                csselMascotas.execute();

                CallableStatement csselRecomendaciones = objConexion.conexion().prepareCall(SidRecomendaciones);
                csselRecomendaciones.setString(1, Ficha_Recomendaciones);
                csselRecomendaciones.execute();

                CallableStatement csselVehiculo = objConexion.conexion().prepareCall(SidVehiculo);
                csselVehiculo.setString(1, Ficha_Vehiculo);
                csselVehiculo.execute();

                CallableStatement csselCosto = objConexion.conexion().prepareCall(SidCosto);
                csselCosto.setString(1, Ficha_CostoG);
                csselCosto.execute();

                ResultSet rsD = null;
                ResultSet rsRa = null;
                ResultSet rsA = null;
                ResultSet rsCl = null;
                ResultSet rsP = null;
                ResultSet rsT = null;
                ResultSet rsM = null;
                ResultSet rsRe = null;
                ResultSet rsV = null;
                ResultSet rsCo = null;

                rsD = csselDireccion.executeQuery();
                rsRa = csselRating.executeQuery();
                rsA = csselAccesibilidad.executeQuery();
                rsCl = csselClima.executeQuery();
                rsP = csselParqueo.executeQuery();
                rsT = csselTelefono.executeQuery();
                rsM = csselMascotas.executeQuery();
                rsRe = csselRecomendaciones.executeQuery();
                rsV = csselVehiculo.executeQuery();
                rsCo = csselCosto.executeQuery();

                int idDireccion = 0;
                int idRating = 0;
                int idAccesibilidad = 0;
                int idClima = 0;
                int idParqueo = 0;
                int idTelefono = 0;
                int idMascotas = 0;
                int idRecomendaciones = 0;
                int idVehiculo = 0;
                int idCosto = 0;

                if (rsD.next()) {
                    idDireccion = rsD.getInt("ID_Direccion");
                }

                if (rsRa.next()) {
                    idRating = rsRa.getInt("ID_Rating");
                }

                if (rsA.next()) {
                    idAccesibilidad = rsA.getInt("ID_Accesibilidad");
                }

                if (rsCl.next()) {
                    idClima = rsCl.getInt("ID_Clima");
                }

                if (rsP.next()) {
                    idParqueo = rsP.getInt("ID_Parqueo");
                }

                if (rsT.next()) {
                    idTelefono = rsT.getInt("ID_Telefono");
                }

                if (rsM.next()) {
                    idMascotas = rsM.getInt("ID_Mascotas");
                }

                if (rsRe.next()) {
                    idRecomendaciones = rsRe.getInt("ID_Recomendaciones");
                }

                if (rsV.next()) {
                    idVehiculo = rsV.getInt("ID_Vehiculo");
                }

                if (rsCo.next()) {
                    idCosto = rsCo.getInt("ID_Costo");
                }

                csinsDetalles.setString(1, Ficha_Detalles);
                csinsDetalles.setInt(2, idDireccion);
                csinsDetalles.setInt(3, idRating);
                csinsDetalles.setInt(4, idAccesibilidad);
                csinsDetalles.setInt(5, idClima);
                csinsDetalles.setInt(6, idParqueo);
                csinsDetalles.setInt(7, idTelefono);
                csinsDetalles.setInt(8, idMascotas);
                csinsDetalles.setInt(9, idRecomendaciones);
                csinsDetalles.setInt(10, idVehiculo);
                csinsDetalles.setInt(11, idCosto);
                csinsDetalles.execute();

                String selSitio = "SELECT ID_Sitio FROM dbo.Sitio WHERE Ficha_Sitio  = (?);";
                String selDetalles = "SELECT ID_Detalles FROM dbo.Detalles WHERE Ficha_Detalles  = (?);";

                CallableStatement csselSitio = objConexion.conexion().prepareCall(selSitio);
                csselSitio.setString(1, Ficha_SI);
                csselSitio.execute();
                
                CallableStatement csselDetalles = objConexion.conexion().prepareCall(selDetalles);
                csselDetalles.setString(1, Ficha_Detalles);
                csselDetalles.execute();

                ResultSet rsSi = null;
                ResultSet rsDe = null;

                rsSi = csselSitio.executeQuery();
                rsDe = csselDetalles.executeQuery();

                int idSitio = 0;
                int idDetalles = 0;

                if (rsSi.next()) {
                    idSitio = rsSi.getInt("ID_Sitio");
                    JOptionPane.showMessageDialog(null, idSitio);
                }
                
                if (rsDe.next()) {
                    idDetalles = rsDe.getInt("ID_Detalles");
                    JOptionPane.showMessageDialog(null, idDetalles);
                }

                csinsCatarata.setString(1, Ficha_Catarata);
                csinsCatarata.setInt(2, idSitio);
                csinsCatarata.setString(3, txtNombre.getText());
                csinsCatarata.setInt(4, idDetalles);
                csinsCatarata.execute();
                
                JOptionPane.showMessageDialog(null, "Datos Guardados con Exito!");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    
    public void mostrarDatosTable(JTable jTableSitios){
        
        dbClases.Conexion objConexion = new dbClases.Conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String consulta = "SELECT si.Ficha_Sitio, ca.Nombre_Sitio, di.Provincia FROM dbo.Sitio as si JOIN dbo.Catarata ca ON ca.ID_Sitio = si.ID_Sitio JOIN dbo.Detalles de ON de.ID_Detalles = ca.ID_Detalles JOIN dbo.Direccion di ON di.ID_Direccion = de.ID_Direccion";
        
         modelo.addColumn("Ficha_Sitio");
         modelo.addColumn("Nombre_Sitio");
         modelo.addColumn("Provincia");
         
         jTableSitios.setModel(modelo);
         
         String [] datos = new String[3];
         
         Statement st;
         
         try {
             
             st = objConexion.conexion().createStatement();
             ResultSet rs = st.executeQuery(consulta);
             
             while (rs.next()) {         
                 
                 datos[0] = rs.getString(1);
                 datos[1] = rs.getString(2);
                 datos[2] = rs.getString(3);   
                 modelo.addRow(datos);
             }
             
             jTableSitios.setModel(modelo);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error en la tabla: " + e.toString());
        }

        
    
    }
    
}
