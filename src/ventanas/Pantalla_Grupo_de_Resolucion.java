
package ventanas;

import controllers.GestorSesion;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario
 */
public class Pantalla_Grupo_de_Resolucion extends javax.swing.JFrame {


    public Pantalla_Grupo_de_Resolucion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        cerrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonConsultarIntervencion = new javax.swing.JButton();
        jButtonRegistarClasificacion = new javax.swing.JButton();
        jButtonBuscarClasificacion = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1025, 635));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConsultarIntervencion.setBackground(new java.awt.Color(153, 153, 153));
        jButtonConsultarIntervencion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonConsultarIntervencion.setText("Consultar intervenciones asignadas");
        jButtonConsultarIntervencion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonConsultarIntervencionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonConsultarIntervencionFocusLost(evt);
            }
        });
        jButtonConsultarIntervencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarIntervencionActionPerformed(evt);
            }
        });
        jButtonConsultarIntervencion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConsultarIntervencionKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonConsultarIntervencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 310, 60));

        jButtonRegistarClasificacion.setBackground(new java.awt.Color(153, 153, 153));
        jButtonRegistarClasificacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRegistarClasificacion.setText("Registrar clasificacion de tickets");
        jButtonRegistarClasificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonRegistarClasificacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonRegistarClasificacionFocusLost(evt);
            }
        });
        jButtonRegistarClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarClasificacionActionPerformed(evt);
            }
        });
        jButtonRegistarClasificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistarClasificacionKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonRegistarClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 310, 60));

        jButtonBuscarClasificacion.setBackground(new java.awt.Color(153, 153, 153));
        jButtonBuscarClasificacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonBuscarClasificacion.setText("Buscar clasificacion de tickets");
        jButtonBuscarClasificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonBuscarClasificacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonBuscarClasificacionFocusLost(evt);
            }
        });
        jButtonBuscarClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClasificacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 310, 60));

        jButtonSalir.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonSalirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonSalirFocusLost(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 605, 120, 40));

        jLabelTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Grupo de resolución ");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofondo_GrupoResolucion.png"))); // NOI18N
        jLabelLogo.setToolTipText("");
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 360, 400));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-grupoResolucion.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(350, 388));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(350, 388));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(350, 388));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarIntervencionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConsultarIntervencionKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConsultarIntervencion.doClick();
        }
    }//GEN-LAST:event_jButtonConsultarIntervencionKeyPressed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistarClasificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistarClasificacionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonRegistarClasificacion.doClick();
        }
    }//GEN-LAST:event_jButtonRegistarClasificacionKeyPressed

    private void jButtonConsultarIntervencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarIntervencionActionPerformed
        Caso_de_uso_07 c = new Caso_de_uso_07();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarIntervencionActionPerformed

    private void jButtonConsultarIntervencionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonConsultarIntervencionFocusGained
        jButtonConsultarIntervencion.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_jButtonConsultarIntervencionFocusGained

    private void jButtonRegistarClasificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonRegistarClasificacionFocusGained
        jButtonRegistarClasificacion.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_jButtonRegistarClasificacionFocusGained

    private void jButtonBuscarClasificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonBuscarClasificacionFocusGained
                jButtonBuscarClasificacion.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_jButtonBuscarClasificacionFocusGained

    private void jButtonSalirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonSalirFocusGained
            jButtonSalir.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_jButtonSalirFocusGained

    private void jButtonConsultarIntervencionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonConsultarIntervencionFocusLost
        jButtonConsultarIntervencion.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jButtonConsultarIntervencionFocusLost

    private void jButtonRegistarClasificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonRegistarClasificacionFocusLost
         jButtonRegistarClasificacion.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jButtonRegistarClasificacionFocusLost

    private void jButtonBuscarClasificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonBuscarClasificacionFocusLost
         jButtonBuscarClasificacion.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jButtonBuscarClasificacionFocusLost

    private void jButtonSalirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonSalirFocusLost
         jButtonSalir.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jButtonSalirFocusLost

    private void jButtonRegistarClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarClasificacionActionPerformed
       JOptionPane.showMessageDialog(null, "Funcionalidad en desarrollo");
    }//GEN-LAST:event_jButtonRegistarClasificacionActionPerformed

    private void jButtonBuscarClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClasificacionActionPerformed
        JOptionPane.showMessageDialog(null, "Funcionalidad en desarrollo");
    }//GEN-LAST:event_jButtonBuscarClasificacionActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Grupo_de_Resolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Grupo_de_Resolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Grupo_de_Resolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Grupo_de_Resolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Grupo_de_Resolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscarClasificacion;
    private javax.swing.JButton jButtonConsultarIntervencion;
    private javax.swing.JButton jButtonRegistarClasificacion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

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
            
            this.setVisible(false);
        }
    }




}
