
package com.vamosaturistear;

import com.vamosaturistear.Sitios.AgregarSitiosFrame;
import com.vamosaturistear.Sitios.SitiosFrame;
import java.awt.Color;


public class HomeFrame extends javax.swing.JFrame {


    public HomeFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpReseñas2 = new com.vamosaturistear.PanelRound();
        jlabel = new javax.swing.JLabel();
        lblResena = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTInicio = new javax.swing.JTable();
        jpUsuarios2 = new com.vamosaturistear.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        lblUsuariosCount = new javax.swing.JLabel();
        jpSitios2 = new com.vamosaturistear.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        lblSitios = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 41, 45));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        jpReseñas2.setBackground(new java.awt.Color(14, 94, 111));
        jpReseñas2.setRoundBottomLeft(25);
        jpReseñas2.setRoundBottomRight(25);
        jpReseñas2.setRoundTopLeft(25);
        jpReseñas2.setRoundTopRight(25);

        jlabel.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Reseñas");

        lblResena.setFont(new java.awt.Font("Montserrat", 1, 64)); // NOI18N
        lblResena.setForeground(new java.awt.Color(255, 255, 255));
        lblResena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResena.setText("10");

        javax.swing.GroupLayout jpReseñas2Layout = new javax.swing.GroupLayout(jpReseñas2);
        jpReseñas2.setLayout(jpReseñas2Layout);
        jpReseñas2Layout.setHorizontalGroup(
            jpReseñas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReseñas2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jlabel)
                .addGap(51, 51, 51))
            .addComponent(lblResena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpReseñas2Layout.setVerticalGroup(
            jpReseñas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReseñas2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblResena)
                .addGap(18, 18, 18)
                .addComponent(jlabel)
                .addGap(15, 15, 15))
        );

        jTInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTInicio);

        jpUsuarios2.setBackground(new java.awt.Color(14, 94, 111));
        jpUsuarios2.setRoundBottomLeft(25);
        jpUsuarios2.setRoundBottomRight(25);
        jpUsuarios2.setRoundTopLeft(25);
        jpUsuarios2.setRoundTopRight(25);

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Usuarios");

        lblUsuariosCount.setFont(new java.awt.Font("Montserrat", 1, 64)); // NOI18N
        lblUsuariosCount.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuariosCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuariosCount.setText("25");
        lblUsuariosCount.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblUsuariosCount.setFocusable(false);
        lblUsuariosCount.setRequestFocusEnabled(false);
        lblUsuariosCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosCountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUsuarios2Layout = new javax.swing.GroupLayout(jpUsuarios2);
        jpUsuarios2.setLayout(jpUsuarios2Layout);
        jpUsuarios2Layout.setHorizontalGroup(
            jpUsuarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarios2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel14)
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(lblUsuariosCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpUsuarios2Layout.setVerticalGroup(
            jpUsuarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuarios2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblUsuariosCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(15, 15, 15))
        );

        jpSitios2.setBackground(new java.awt.Color(14, 94, 111));
        jpSitios2.setRoundBottomLeft(25);
        jpSitios2.setRoundBottomRight(25);
        jpSitios2.setRoundTopLeft(25);
        jpSitios2.setRoundTopRight(25);

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sitios");

        lblSitios.setFont(new java.awt.Font("Montserrat", 1, 64)); // NOI18N
        lblSitios.setForeground(new java.awt.Color(255, 255, 255));
        lblSitios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSitios.setText("15");
        lblSitios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSitiosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpSitios2Layout = new javax.swing.GroupLayout(jpSitios2);
        jpSitios2.setLayout(jpSitios2Layout);
        jpSitios2Layout.setHorizontalGroup(
            jpSitios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSitios2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(64, 64, 64))
            .addComponent(lblSitios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpSitios2Layout.setVerticalGroup(
            jpSitios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSitios2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblSitios)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(15, 15, 15))
        );

        btnSalir.setBackground(new java.awt.Color(49, 53, 57));
        btnSalir.setFont(new java.awt.Font("Montserrat Black", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSalir.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpUsuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jpSitios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jpReseñas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpReseñas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpUsuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpSitios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Se llama a la Clase login y se llaman a los datos de los Jtxt para confirmar el login
        dbClases.Inicio objInicio = new dbClases.Inicio();
        objInicio.usuarioCount(lblUsuariosCount);
        objInicio.sitioCount(lblSitios);
        objInicio.resenaCount(lblResena);
        objInicio.mostrarInicio(jTInicio);
    }//GEN-LAST:event_formWindowActivated

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lblUsuariosCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosCountMouseClicked
        UsuariosFrame objUsuario = new UsuariosFrame();
        objUsuario.setVisible(true);
    }//GEN-LAST:event_lblUsuariosCountMouseClicked

    private void lblSitiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSitiosMouseClicked
        AgregarSitiosFrame objSitios = new AgregarSitiosFrame();
        objSitios.setVisible(true);
    }//GEN-LAST:event_lblSitiosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTInicio;
    private javax.swing.JLabel jlabel;
    private com.vamosaturistear.PanelRound jpReseñas2;
    private com.vamosaturistear.PanelRound jpSitios2;
    private com.vamosaturistear.PanelRound jpUsuarios2;
    private javax.swing.JLabel lblResena;
    private javax.swing.JLabel lblSitios;
    private javax.swing.JLabel lblUsuariosCount;
    // End of variables declaration//GEN-END:variables
}
