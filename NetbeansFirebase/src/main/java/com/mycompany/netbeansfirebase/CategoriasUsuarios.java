/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.netbeansfirebase;

import com.google.firebase.FirebaseApp;
import javax.swing.JButton;

/**
 *
 * @author T42131
 */
public class CategoriasUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CategoriasUsuarios
     */
    public CategoriasUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        PersonaProvide.cargarTablaPersona(tblG);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblG = new javax.swing.JTable();
        btnCategoria1TEC = new javax.swing.JButton();
        btnCategoria2SALUD = new javax.swing.JButton();
        btnCatgEDUCACION = new javax.swing.JButton();
        btnCategoria2COMIDA = new javax.swing.JButton();
        btnCatgSFINANCIEROS = new javax.swing.JButton();
        btnCatgENTRETENIMIENTO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFormRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblG);

        btnCategoria1TEC.setText("TECNOLOGÍA");
        btnCategoria1TEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoria1TECMouseClicked(evt);
            }
        });
        btnCategoria1TEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoria1TECActionPerformed(evt);
            }
        });

        btnCategoria2SALUD.setText("SALUD");
        btnCategoria2SALUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoria2SALUDMouseClicked(evt);
            }
        });
        btnCategoria2SALUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoria2SALUDActionPerformed(evt);
            }
        });

        btnCatgEDUCACION.setText("EDUCACIÓN");
        btnCatgEDUCACION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatgEDUCACIONMouseClicked(evt);
            }
        });

        btnCategoria2COMIDA.setText("COMIDA");
        btnCategoria2COMIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoria2COMIDAMouseClicked(evt);
            }
        });

        btnCatgSFINANCIEROS.setText("SERVICIOS FINANCIEROS");
        btnCatgSFINANCIEROS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatgSFINANCIEROSMouseClicked(evt);
            }
        });

        btnCatgENTRETENIMIENTO.setText("ENTRETENIMIENTO");
        btnCatgENTRETENIMIENTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatgENTRETENIMIENTOMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuarios\\t42131\\My Documents\\NetBeansProjects\\NetbeansFirebase\\src\\main\\java\\images\\foto-categ_1.png")); // NOI18N

        btnFormRegistro.setText("<< FORMULARIO DE REGISTRO");
        btnFormRegistro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnFormRegistroStateChanged(evt);
            }
        });
        btnFormRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFormRegistroMouseClicked(evt);
            }
        });
        btnFormRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnFormRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnCategoria1TEC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnCatgENTRETENIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCategoria2COMIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCatgEDUCACION, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCategoria2SALUD, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCatgSFINANCIEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormRegistro)
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoria1TEC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatgENTRETENIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCategoria2COMIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCategoria2SALUD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCatgEDUCACION, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatgSFINANCIEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGMouseClicked


    }//GEN-LAST:event_tblGMouseClicked

    private void btnCategoria1TECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoria1TECActionPerformed

    }//GEN-LAST:event_btnCategoria1TECActionPerformed

    private void btnFormRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormRegistroActionPerformed
        /**/

    }//GEN-LAST:event_btnFormRegistroActionPerformed

    private void btnFormRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFormRegistroMouseClicked
         /*metodo para llamar a la ventana de formulario*/
        newForm();
    }//GEN-LAST:event_btnFormRegistroMouseClicked
    public JButton getMiBoton(){
    return btnFormRegistro;
    }
    private void btnCategoria1TECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoria1TECMouseClicked
       PersonaProvide.cargarTablaCatg1(tblG, "1");
    }//GEN-LAST:event_btnCategoria1TECMouseClicked

    private void btnCategoria2COMIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoria2COMIDAMouseClicked
      PersonaProvide.cargarTablaCatg1(tblG, "2");
    }//GEN-LAST:event_btnCategoria2COMIDAMouseClicked

    private void btnCategoria2SALUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoria2SALUDMouseClicked
      PersonaProvide.cargarTablaCatg1(tblG, "3");       
    }//GEN-LAST:event_btnCategoria2SALUDMouseClicked

    private void btnCategoria2SALUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoria2SALUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoria2SALUDActionPerformed

    private void btnFormRegistroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnFormRegistroStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormRegistroStateChanged

    private void btnCatgEDUCACIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatgEDUCACIONMouseClicked
      PersonaProvide.cargarTablaCatg1(tblG, "4");       
    }//GEN-LAST:event_btnCatgEDUCACIONMouseClicked

    private void btnCatgENTRETENIMIENTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatgENTRETENIMIENTOMouseClicked
      PersonaProvide.cargarTablaCatg1(tblG, "5");  
    }//GEN-LAST:event_btnCatgENTRETENIMIENTOMouseClicked

    private void btnCatgSFINANCIEROSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatgSFINANCIEROSMouseClicked
      PersonaProvide.cargarTablaCatg1(tblG, "6");  
    }//GEN-LAST:event_btnCatgSFINANCIEROSMouseClicked

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
            java.util.logging.Logger.getLogger(CategoriasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriasUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria1TEC;
    private javax.swing.JButton btnCategoria2COMIDA;
    private javax.swing.JButton btnCategoria2SALUD;
    private javax.swing.JButton btnCatgEDUCACION;
    private javax.swing.JButton btnCatgENTRETENIMIENTO;
    private javax.swing.JButton btnCatgSFINANCIEROS;
    private javax.swing.JButton btnFormRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblG;
    // End of variables declaration//GEN-END:variables

    private void newForm() {
        /*cerrando la conección para evitar el error de doble llamado a Firebase*/
        FirebaseApp.getInstance().delete();
        System.out.println("Volviendo a otra ventana");
        FormAdm form2 = new FormAdm();
        form2.setVisible(true);
        this.setVisible(false);

    }
}
