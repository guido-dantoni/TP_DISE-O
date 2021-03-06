
package Ventanas;

import controllers.GestorSesion;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Login extends javax.swing.JFrame {

  
    private String tipoDeUsuario;
    private PantallaInicioTP padre;
     
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //para que me muestre en el centro de la pantalla los menues
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
    }
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLegajo = new javax.swing.JTextField();
        jButtonSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono2.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Legajo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jTextFieldLegajo.setBackground(new java.awt.Color(0, 51, 102));
        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegajoActionPerformed(evt);
            }
        });
        jTextFieldLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLegajoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 180, 30));

        jButtonSesion.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setText("Iniciar Sesion");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        jButtonSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSesionKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegajoActionPerformed
        
               
    }//GEN-LAST:event_jTextFieldLegajoActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        //Lo que hago es crear un objeto de tipo iniciaSesion para que muestre esa ventana
        //Y voy a validar usuario y contraseña aca.
        if(jTextFieldLegajo.getText().isEmpty()){
            
            Toolkit.getDefaultToolkit().beep(); 
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un legajo de usuario");
             
        }else if(jTextFieldLegajo.getText().length()>9){
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Solo 9 caracteres permitidos");
        
        }else if(esNumerico(jTextFieldLegajo.getText())){
            
            int legajoUsuario;
            Boolean existeUsuario;
        
            legajoUsuario = Integer.parseInt(jTextFieldLegajo.getText());
        
            GestorSesion gestorSesion = new GestorSesion();
            existeUsuario = gestorSesion.validarUsuario(legajoUsuario, tipoDeUsuario);
      
                if(tipoDeUsuario.equals("Mesa de Ayuda") && existeUsuario){
           
                    this.setVisible(false);
                   // this.dispose();
                    PantallaMesaDeAyuda pantallaMesaAyuda = new PantallaMesaDeAyuda();
                    
                    pantallaMesaAyuda.setPantallaInicion(this.padre);
                    pantallaMesaAyuda.setVisible(true);
                   // pantallaMesaAyuda.setVisible(true);
                   // pantallaMesaAyuda.setAlwaysOnTop(false);
                                  
                    
                }else if(tipoDeUsuario.equals("Grupo de Resolucion") && existeUsuario){
                        
                            this.setVisible(false);
                            //this.dispose();
                            ventanas.Pantalla_Grupo_de_Resolucion pantallaGrupo = new ventanas.Pantalla_Grupo_de_Resolucion();
                            pantallaGrupo.setPantallaInicion(this.padre);
                            pantallaGrupo.setVisible(true);
                            //pantallaGrupo.setAlwaysOnTop(true);
                            //pantallaGrupo.setAlwaysOnTop(false);
                    
                    }else{
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null, "No existe este usuario como " + tipoDeUsuario);
                         }
        }else{
             
            Toolkit.getDefaultToolkit().beep(); 
            JOptionPane.showMessageDialog(rootPane, "Solo se adimiten valores numericos");
        }

    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jTextFieldLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLegajoKeyTyped
        // TODO add your handling code here:
       char legajo=evt.getKeyChar();
       int caracteres=9;
       
       if(legajo<'0' || legajo>'9'){
           
           evt.consume();
       }
                 
        if(jTextFieldLegajo.getText().length()>=caracteres){ //>= porque parece ser que arranca a contar de 0
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            
        }
        
        if (legajo==KeyEvent.VK_ENTER){
            
            jButtonSesion.doClick();
        }
        
            
    }//GEN-LAST:event_jTextFieldLegajoKeyTyped

    private void jButtonSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSesionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonSesion.doClick();
        }
    }//GEN-LAST:event_jButtonSesionKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.padre.desbloquearControles();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JTextField jTextFieldLegajo;
    // End of variables declaration//GEN-END:variables

    void setTipoUsuario(String tipo) {
        
        
        this.setVisible(true);
        this.tipoDeUsuario=tipo;
        
    }
    
    private Boolean esNumerico(String valor){     
        try{
            if(valor!= null){
                    Integer.parseInt(valor);
            }
        }catch(NumberFormatException nfe){
             return false;
        }
        return true;
    }

    void setPantallaIncio(PantallaInicioTP p) {
        this.padre = p;
                
    }
}
