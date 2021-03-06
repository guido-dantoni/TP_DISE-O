
package Ventanas;

import controllers.Enum_EstadoTicket;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class PantallaInicioTP extends javax.swing.JFrame {


    public PantallaInicioTP() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        
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
        JButtonMesaDeAyuda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonMesaDeAyudaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonMesaDeAyudaFocusLost(evt);
            }
        });
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
        JButtonGrupoDeResolucion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonGrupoDeResolucionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonGrupoDeResolucionFocusLost(evt);
            }
        });
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
        JButtonGerencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonGerenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonGerenciaFocusLost(evt);
            }
        });
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

        this.bloquearControles();
        Login log= new Login();
        log.setTipoUsuario("Mesa de Ayuda");
        log.setPantallaIncio(this);
    }//GEN-LAST:event_JButtonMesaDeAyudaActionPerformed

    private void JButtonGrupoDeResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGrupoDeResolucionActionPerformed
        this.bloquearControles();  
        Login log = new Login();
        log.setTipoUsuario("Grupo de Resolucion");
        log.setPantallaIncio(this);
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

    private void JButtonMesaDeAyudaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonMesaDeAyudaFocusGained
       JButtonMesaDeAyuda.setBackground(new java.awt.Color(0,153,204));
       JButtonMesaDeAyuda.setForeground(Color.black);
    }//GEN-LAST:event_JButtonMesaDeAyudaFocusGained

    private void JButtonMesaDeAyudaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonMesaDeAyudaFocusLost
        JButtonMesaDeAyuda.setBackground(new java.awt.Color(0,51,204));
        JButtonMesaDeAyuda.setForeground(new java.awt.Color(191, 185, 185));
    }//GEN-LAST:event_JButtonMesaDeAyudaFocusLost

    private void JButtonGrupoDeResolucionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonGrupoDeResolucionFocusGained
                 JButtonGrupoDeResolucion.setBackground(new java.awt.Color(0,153,204));
           JButtonGrupoDeResolucion.setForeground(Color.black);
    }//GEN-LAST:event_JButtonGrupoDeResolucionFocusGained

    private void JButtonGrupoDeResolucionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonGrupoDeResolucionFocusLost
                JButtonGrupoDeResolucion.setBackground(new java.awt.Color(0,51,204));
                JButtonGrupoDeResolucion.setForeground(new java.awt.Color(191, 185, 185));
    }//GEN-LAST:event_JButtonGrupoDeResolucionFocusLost

    private void JButtonGerenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonGerenciaFocusGained
          JButtonGerencia.setBackground(new java.awt.Color(0,153,204));
          JButtonGerencia.setForeground(Color.black);
    }//GEN-LAST:event_JButtonGerenciaFocusGained

    private void JButtonGerenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonGerenciaFocusLost
                JButtonGerencia.setBackground(new java.awt.Color(0,51,204));
                JButtonGerencia.setForeground(new java.awt.Color(191, 185, 185));       
    }//GEN-LAST:event_JButtonGerenciaFocusLost

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

    public void bloquearControles() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.JButtonGerencia.setEnabled(false);
        this.JButtonGrupoDeResolucion.setEnabled(false);
        this.JButtonMesaDeAyuda.setEnabled(false);
    }
    public void desbloquearControles() {
        this.JButtonGerencia.setEnabled(true);
        this.JButtonGrupoDeResolucion.setEnabled(true);
        this.JButtonMesaDeAyuda.setEnabled(true);
        JButtonMesaDeAyuda.requestFocus();
    }
}
