
package Ventanas;

import controllers.Enum_EstadoTicket;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class PantallaInicioTP extends javax.swing.JFrame {


    public PantallaInicioTP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonMesaDeAyuda = new javax.swing.JButton();
        JButtonGrupoDeResolucion = new javax.swing.JButton();
        JButtonGerencia = new javax.swing.JButton();
        jLabelLlamita = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabelTituloSecundario = new javax.swing.JLabel();
        LabelFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonMesaDeAyuda.setBackground(new java.awt.Color(0, 51, 204));
        JButtonMesaDeAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonMesaDeAyuda.setForeground(new java.awt.Color(191, 185, 185));
        JButtonMesaDeAyuda.setText("MESA DE AYUDA");
        JButtonMesaDeAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMesaDeAyudaActionPerformed(evt);
            }
        });
        JButtonMesaDeAyuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JButtonMesaDeAyudaKeyPressed(evt);
            }
        });
        getContentPane().add(JButtonMesaDeAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 210, 70));

        JButtonGrupoDeResolucion.setBackground(new java.awt.Color(0, 51, 204));
        JButtonGrupoDeResolucion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonGrupoDeResolucion.setForeground(new java.awt.Color(191, 185, 185));
        JButtonGrupoDeResolucion.setText("GRUPO DE RESOLUCIÓN");
        JButtonGrupoDeResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGrupoDeResolucionActionPerformed(evt);
            }
        });
        JButtonGrupoDeResolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JButtonGrupoDeResolucionKeyPressed(evt);
            }
        });
        getContentPane().add(JButtonGrupoDeResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 210, 70));

        JButtonGerencia.setBackground(new java.awt.Color(0, 51, 204));
        JButtonGerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonGerencia.setForeground(new java.awt.Color(191, 185, 185));
        JButtonGerencia.setText("GERENCIA");
        JButtonGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGerenciaActionPerformed(evt);
            }
        });
        JButtonGerencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JButtonGerenciaKeyPressed(evt);
            }
        });
        getContentPane().add(JButtonGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 210, 70));

        jLabelLlamita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Llamita2.png"))); // NOI18N
        getContentPane().add(jLabelLlamita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 420));

        jLabelTitulo2.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo2.setFont(new java.awt.Font("MS PGothic", 0, 85)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTitulo2.setText("La llamita");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 350, 110));

        jLabelTituloSecundario.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTituloSecundario.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelTituloSecundario.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTituloSecundario.setText("gas natural");
        getContentPane().add(jLabelTituloSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        LabelFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoNuevo.jpg"))); // NOI18N
        getContentPane().add(LabelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1350, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void JButtonMesaDeAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMesaDeAyudaActionPerformed
               
       Login log= new Login();
       log.setTipoUsuario("Mesa de Ayuda");
    }//GEN-LAST:event_JButtonMesaDeAyudaActionPerformed

    private void JButtonGrupoDeResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGrupoDeResolucionActionPerformed
       
        JOptionPane.showMessageDialog(null, "Funcionalidad en desarrollo.");
        
    }//GEN-LAST:event_JButtonGrupoDeResolucionActionPerformed

    private void JButtonGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGerenciaActionPerformed
       
         JOptionPane.showMessageDialog(null, "Funcionalidad en desarrollo.");
        
    }//GEN-LAST:event_JButtonGerenciaActionPerformed

    private void JButtonMesaDeAyudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButtonMesaDeAyudaKeyPressed
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            JButtonMesaDeAyuda.doClick();
        }
            
    }//GEN-LAST:event_JButtonMesaDeAyudaKeyPressed

    private void JButtonGrupoDeResolucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButtonGrupoDeResolucionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            JButtonGrupoDeResolucion.doClick();
        }
    }//GEN-LAST:event_JButtonGrupoDeResolucionKeyPressed

    private void JButtonGerenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButtonGerenciaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            JButtonGerencia.doClick();
        }
    }//GEN-LAST:event_JButtonGerenciaKeyPressed

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
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioTP().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonGerencia;
    private javax.swing.JButton JButtonGrupoDeResolucion;
    private javax.swing.JButton JButtonMesaDeAyuda;
    private javax.swing.JLabel LabelFondoPantalla;
    private javax.swing.JLabel jLabelLlamita;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTituloSecundario;
    // End of variables declaration//GEN-END:variables
}
