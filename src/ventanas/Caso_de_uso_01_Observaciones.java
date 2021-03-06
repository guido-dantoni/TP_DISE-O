
package ventanas;

import javax.swing.ImageIcon;
import clases.Ticket;
import controllers.GestorTicket;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Caso_de_uso_01_Observaciones extends javax.swing.JFrame {

    private static Ticket ticket; //Este Ticket lo usamos en el metodo cerrarTicket()
    
   
    public Caso_de_uso_01_Observaciones() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        jTextAreaObservaciones.setLineWrap(true); // evita expansion en ancho del textArea
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFondo = new javax.swing.JLabel();
        jButtonDerivarTicket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCerrarTicket = new javax.swing.JButton();
        jTextFieldTicket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservaciones = new javax.swing.JTextArea();
        jLabelFondo1 = new javax.swing.JLabel();

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCU1 (2).jpg"))); // NOI18N
        jLabelFondo.setPreferredSize(new java.awt.Dimension(1025, 635));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalle del reclamo");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDerivarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButtonDerivarTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonDerivarTicket.setText("Derivar ticket");
        jButtonDerivarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerivarTicketActionPerformed(evt);
            }
        });
        jButtonDerivarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonDerivarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonDerivarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 130, 40));

        jLabel1.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nro. Ticket:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jLabel2.setBackground(new java.awt.Color(191, 185, 185));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Observaciones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jButtonCerrarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButtonCerrarTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonCerrarTicket.setText("Cerrar ticket");
        jButtonCerrarTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarTicketMouseClicked(evt);
            }
        });
        jButtonCerrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarTicketActionPerformed(evt);
            }
        });
        jButtonCerrarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCerrarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonCerrarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 130, 40));

        jTextFieldTicket.setEditable(false);
        jTextFieldTicket.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTicket.setFocusable(false);
        jTextFieldTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 30));

        jTextAreaObservaciones.setBackground(new java.awt.Color(245, 245, 245));
        jTextAreaObservaciones.setColumns(20);
        jTextAreaObservaciones.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextAreaObservaciones.setRows(5);
        jTextAreaObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaObservacionesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaObservacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaObservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 600, 200));

        jLabelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDerivarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerivarTicketActionPerformed
   
         String observacion = jTextAreaObservaciones.getText();
                 
    if(observacion.length()>=500){
        
            Toolkit.getDefaultToolkit().beep(); //ruidito beep
            JOptionPane.showMessageDialog(null, "El campo de observaciones no puede contentener mas de 500 caracteres");
        
    }else{  
        
       ;
        //verifico que me cargue las observaciones
        
        if(observacion.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "El campo observaciones no puede ser nulo");
            
        }else{
                Ventanas.Caso_de_uso_04 cu4 = new Ventanas.Caso_de_uso_04();
                this.setVisible(false);
                cu4.setVisible(true);
                cu4.derivarTicket(ticket, this, observacion);
        }
   }
    }//GEN-LAST:event_jButtonDerivarTicketActionPerformed

    private void jTextFieldTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketActionPerformed
        
    }//GEN-LAST:event_jTextFieldTicketActionPerformed

    private void jButtonCerrarTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarTicketMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCerrarTicketMouseClicked

    private void jTextAreaObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaObservacionesKeyTyped
        // TODO add your handling code here:
                  //hasta 500 caracteres en el textArea
            if(jTextAreaObservaciones.getText().length()>=500){
                evt.consume();
          }
    }//GEN-LAST:event_jTextAreaObservacionesKeyTyped

    private void jButtonCerrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarTicketActionPerformed
   String observacion = jTextAreaObservaciones.getText();
        
    if(observacion.length()>=500){
        
            Toolkit.getDefaultToolkit().beep(); //ruidito beep
            JOptionPane.showMessageDialog(null, "El campo de observaciones no puede contentener mas de 500 caracteres");
        
    }else{        
        
        //verifico que me cargue las observaciones
        
            if(observacion.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "El campo observaciones no puede ser nulo");
            
            }else{
            
                GestorTicket gestorTicket = new GestorTicket();
                gestorTicket.cerrarTicket(observacion, ticket);
            
                this.setVisible(false);          

             }
        }   
    }//GEN-LAST:event_jButtonCerrarTicketActionPerformed

    private void jButtonCerrarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCerrarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCerrarTicket.doClick();
        }        
    }//GEN-LAST:event_jButtonCerrarTicketKeyPressed

    private void jButtonDerivarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonDerivarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonDerivarTicket.doClick();
        }       
    }//GEN-LAST:event_jButtonDerivarTicketKeyPressed

    private void jTextAreaObservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaObservacionesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            jButtonCerrarTicket.requestFocus();
        }     
    }//GEN-LAST:event_jTextAreaObservacionesKeyPressed

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
            java.util.logging.Logger.getLogger(Caso_de_uso_01_Observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01_Observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01_Observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01_Observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Caso_de_uso_01_Observaciones().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarTicket;
    private javax.swing.JButton jButtonDerivarTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservaciones;
    private javax.swing.JTextField jTextFieldTicket;
    // End of variables declaration//GEN-END:variables

    public void cargarObservaciones(Ticket t){
        //this.setVisible(true);
        
        jTextFieldTicket.setText(String.valueOf(t.getNroTicket()));
        ticket = t;
    }

}
