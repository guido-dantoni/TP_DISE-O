
package Ventanas;

import clases.Ticket;
import controllers.GestorTicket;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Caso_de_uso_03 extends javax.swing.JFrame {

    private VerDetalleTicket verDetalle;

    public Caso_de_uso_03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEstadoTicket = new javax.swing.JLabel();
        jTextEstadoTicket = new javax.swing.JTextField();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPaneObservaciones = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonVolverr = new javax.swing.JButton();
        jLabel1NroTicket = new javax.swing.JLabel();
        jTextField1NroTicketPorPantalla = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cerrar ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEstadoTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelEstadoTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstadoTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstadoTicket.setText("Estado actual del ticket: ");
        getContentPane().add(jLabelEstadoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 40));

        jTextEstadoTicket.setEditable(false);
        jTextEstadoTicket.setBackground(new java.awt.Color(191, 185, 185));
        jTextEstadoTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextEstadoTicket.setText("Cerrado");
        jTextEstadoTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEstadoTicketActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEstadoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, 40));

        jLabelObservaciones.setBackground(new java.awt.Color(191, 185, 185));
        jLabelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservaciones.setText("Observaciones:");
        getContentPane().add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 40));

        jTextArea1.setBackground(new java.awt.Color(245, 245, 245));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPaneObservaciones.setViewportView(jTextArea1);

        getContentPane().add(jScrollPaneObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 690, 250));

        jButtonConfirmar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jButtonConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConfirmarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 120, 40));

        jButtonVolverr.setBackground(new java.awt.Color(191, 185, 185));
        jButtonVolverr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVolverr.setText("Volver");
        jButtonVolverr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverrActionPerformed(evt);
            }
        });
        jButtonVolverr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVolverrKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonVolverr, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 120, 40));

        jLabel1NroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1NroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1NroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1NroTicket.setText("Nro. Ticket: ");
        getContentPane().add(jLabel1NroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jTextField1NroTicketPorPantalla.setEditable(false);
        jTextField1NroTicketPorPantalla.setBackground(new java.awt.Color(191, 185, 185));
        jTextField1NroTicketPorPantalla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField1NroTicketPorPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 230, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEstadoTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEstadoTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEstadoTicketActionPerformed

    private void jButtonVolverrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverrActionPerformed
        this.setVisible(false);
        this.verDetalle.setVisible(true);
       
    }//GEN-LAST:event_jButtonVolverrActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        if(jTextArea1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo de observaciones no puede estar vacio");
        }else{
            String observacion = jTextArea1.getText();
            int nroTicket = Integer.parseInt(jTextField1NroTicketPorPantalla.getText());
                      
            GestorTicket gestorTicket = new GestorTicket();
            gestorTicket.cerrarTicket(observacion,nroTicket);
            
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
                                                          
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmar.doClick();
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonVolverrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVolverrKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonVolverr.doClick();
        }
    }//GEN-LAST:event_jButtonVolverrKeyPressed

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
            java.util.logging.Logger.getLogger(Caso_de_uso_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonVolverr;
    private javax.swing.JLabel jLabel1NroTicket;
    private javax.swing.JLabel jLabelEstadoTicket;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JScrollPane jScrollPaneObservaciones;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextEstadoTicket;
    private javax.swing.JTextField jTextField1NroTicketPorPantalla;
    // End of variables declaration//GEN-END:variables

    void cargarCampos(Ticket ticket, VerDetalleTicket v) {
        jTextField1NroTicketPorPantalla.setText(String.valueOf(ticket.getNroTicket()));
        this.verDetalle = v;
        }
}
