
package Ventanas;

import controllers.GestorSesion;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Marcos
 */
public class PantallaMesaDeAyuda extends javax.swing.JFrame {


    public PantallaMesaDeAyuda() {
        initComponents();
        this.setLocationRelativeTo(null);
        cerrar();
    }
    
    public void cerrar(){
        
        try{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
               
            });
        
        }catch(Exception e){
                e.printStackTrace();
                }
    }
    public void confirmarSalida(){
        int valor=JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir? Se cerrará la sesion actual","Advertencia",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
            GestorSesion gestorSesion=new GestorSesion();
            gestorSesion.setUsuarioLogueado(null);
            //System.exit(0);
            //this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonRegistrarTicket = new javax.swing.JButton();
        jButtonConsultarTicket = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("MESA DE AYUDA");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 380, -1));

        jButtonRegistrarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButtonRegistrarTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarTicket.setText("Registrar Ticket");
        jButtonRegistrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarTicketActionPerformed(evt);
            }
        });
        jButtonRegistrarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistrarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 180, 50));

        jButtonConsultarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButtonConsultarTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConsultarTicket.setText("Consultar Ticket");
        jButtonConsultarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTicketActionPerformed(evt);
            }
        });
        jButtonConsultarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConsultarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonConsultarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 180, 50));

        jButtonSalir.setBackground(new java.awt.Color(191, 185, 185));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jButtonSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalirKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofondo_MesaAyuda.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 370, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
         confirmarSalida();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarTicketActionPerformed
        // TODO add your handling code here:
        Caso_de_uso_01 a = new Caso_de_uso_01();
        a.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButtonRegistrarTicketActionPerformed

    private void jButtonConsultarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTicketActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButtonConsultarTicketActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonRegistrarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistrarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonRegistrarTicket.doClick();
        }
    }//GEN-LAST:event_jButtonRegistrarTicketKeyPressed

    private void jButtonConsultarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConsultarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConsultarTicket.doClick();
        }
    }//GEN-LAST:event_jButtonConsultarTicketKeyPressed

    private void jButtonSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonSalir.doClick();
        }        
    }//GEN-LAST:event_jButtonSalirKeyPressed

  
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
            java.util.logging.Logger.getLogger(PantallaMesaDeAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaMesaDeAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaMesaDeAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaMesaDeAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaMesaDeAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarTicket;
    private javax.swing.JButton jButtonRegistrarTicket;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
