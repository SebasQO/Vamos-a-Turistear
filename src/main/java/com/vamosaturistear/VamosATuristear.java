package com.vamosaturistear;

import dbClases.Conexion;


public class VamosATuristear {
   

    public static void main(String[] args) {
        Conexion objConexion = new Conexion();        
        objConexion.conexion();        
          
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        
    }
}
