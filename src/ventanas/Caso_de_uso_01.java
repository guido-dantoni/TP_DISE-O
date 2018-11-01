
package Ventanas;

import javax.swing.ImageIcon;

/**
 *
 * @author Guido D'Antoni
 */
public class Caso_de_uso_01 extends javax.swing.JFrame {

    /**
     * Creates new form CasoDeUso01
     */
    public Caso_de_uso_01() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        jTextAreaDescripcion.setLineWrap(true); // evita expansion en ancho del textArea
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTicketDefecto = new javax.swing.JTextField();
        jTextFieldLegajo = new javax.swing.JTextField();
        jTextFieldNombreApellido = new javax.swing.JTextField();
        jComboBoxClasificacion = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jBottonCancelar = new javax.swing.JButton();
        jScrollPaneDescrip = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelNroTicket = new javax.swing.JLabel();
        jLabelLegajo = new javax.swing.JLabel();
        jLabelNombreApellido = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        jLabelFechaApertura = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldTicketDefecto.setEditable(false);
        jTextFieldTicketDefecto.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTicketDefecto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldTicketDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 30));

        jTextFieldLegajo.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLegajoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 160, 30));

        jTextFieldNombreApellido.setEditable(false);
        jTextFieldNombreApellido.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldNombreApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 460, 30));

        jComboBoxClasificacion.setBackground(new java.awt.Color(191, 185, 185));
        jComboBoxClasificacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambios de configuración de SO", "Problemas en el funcionamiento del SO", "Mal funcionamiento de HW", "Problemas en la autenticación en los distintos sistemas", "Problemas de acceso a la red", "Solicitud de usuarios de red", "Solicitud de usuarios para sistemas informáticos", "Modificación en los perfiles de usuarios", "Solicitud de cambio de contraseñas", "Problemas en los sistemas", "Problemas con el correo electrónico", "Solicitud de cuentas de correo electrónico", "Solicitud de nuevos puestos de trabajo", "Solicitud soporte en el uso de App", "Otros" }));
        jComboBoxClasificacion.setToolTipText("");
        jComboBoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasificacionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 480, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(191, 185, 185));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 220, 30));

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldHora.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 80, 30));

        jButtonAceptar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAceptar.setLabel("Aceptar");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 120, 40));

        jBottonCancelar.setBackground(new java.awt.Color(191, 185, 185));
        jBottonCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBottonCancelar.setText("Cancelar");
        jBottonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBottonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 120, 40));

        jScrollPaneDescrip.setMaximumSize(new java.awt.Dimension(60, 10));

        jTextAreaDescripcion.setBackground(new java.awt.Color(245, 245, 245));
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setMaximumSize(new java.awt.Dimension(10, 61));
        jTextAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPaneDescrip.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPaneDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 630, 150));

        jLabelNroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        jLabelLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLegajo.setText("Nro. Legajo: ");
        getContentPane().add(jLabelLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        jLabelNombreApellido.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNombreApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellido.setText("Nombre y Apellido:");
        getContentPane().add(jLabelNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 30));

        jLabelClasificacion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelClasificacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClasificacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClasificacion.setText("Clasificacion de Ticket: ");
        getContentPane().add(jLabelClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 40));

        jLabelFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jLabelFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaApertura.setText("Fecha Apertura: ");
        getContentPane().add(jLabelFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 140, 40));

        jLabelHora.setBackground(new java.awt.Color(191, 185, 185));
        jLabelHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora:");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 50, 40));

        jLabelDescripcion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripción: ");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClasificacionActionPerformed

    private void jBottonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBottonCancelarActionPerformed
        // TODO add your handling code here:
        Caso_de_uso_01_ConfirmacionCancelacion a = new Caso_de_uso_01_ConfirmacionCancelacion();
        a.setVisible(true);
    }//GEN-LAST:event_jBottonCancelarActionPerformed

    private void jTextFieldNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreApellidoActionPerformed

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

    private void jTextFieldLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLegajoKeyTyped
            
       char legajo=evt.getKeyChar();
       if(legajo<'0' || legajo>'9')
           evt.consume();
    }//GEN-LAST:event_jTextFieldLegajoKeyTyped

    private void jTextAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyTyped

          //hasta 500 caracteres en el textArea
            if(jTextAreaDescripcion.getText().length()>=500){
                evt.consume();
            }
    }//GEN-LAST:event_jTextAreaDescripcionKeyTyped

    private void jButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseClicked
        
    }//GEN-LAST:event_jButtonAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(Caso_de_uso_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBottonCancelar;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFechaApertura;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLegajo;
    private javax.swing.JLabel jLabelNombreApellido;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JScrollPane jScrollPaneDescrip;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldNombreApellido;
    private javax.swing.JTextField jTextFieldTicketDefecto;
    // End of variables declaration//GEN-END:variables
}
