/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Marcos
 */
public class Caso_de_uso_04 extends javax.swing.JFrame {

    /**
     * Creates new form CasoDeUso04
     */
    public Caso_de_uso_04() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEstadoActual = new javax.swing.JLabel();
        jLabelNuevoEstado = new javax.swing.JLabel();
        jLabelClasificacionTicket = new javax.swing.JLabel();
        jLabelGrupoResolucion = new javax.swing.JLabel();
        jLabelObservacion = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1Confirmar = new javax.swing.JButton();
        jButton1Cerrar = new javax.swing.JButton();
        jLabel1NroTicket = new javax.swing.JLabel();
        jTextField3NroTicketPorPantalla = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Derivar ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEstadoActual.setBackground(new java.awt.Color(191, 185, 185));
        jLabelEstadoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstadoActual.setText("Estado Actual Del Ticket:");
        getContentPane().add(jLabelEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelNuevoEstado.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNuevoEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNuevoEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevoEstado.setText("Nuevo Estado Del Ticket:");
        getContentPane().add(jLabelNuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabelClasificacionTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelClasificacionTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClasificacionTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClasificacionTicket.setText("Clasificacion Del Ticket:");
        getContentPane().add(jLabelClasificacionTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabelGrupoResolucion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelGrupoResolucion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGrupoResolucion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGrupoResolucion.setText("Grupo De Resolucion:");
        getContentPane().add(jLabelGrupoResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabelObservacion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelObservacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacion.setText("Observaciones:");
        getContentPane().add(jLabelObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabelDescripcion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripcion Del Problema:");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(191, 185, 185));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setText("Estado(Default)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 240, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(191, 185, 185));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setText("Abierto Derivado");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, 30));

        jComboBox1.setBackground(new java.awt.Color(191, 185, 185));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambios de configuración de SO", "Problemas en el funcionamiento del SO", "Mal funcionamiento de HW", "Problemas en la autenticación en los distintos sistemas", "Problemas de acceso a la red", "Solicitud de usuarios de red", "Solicitud de usuarios para sistemas informáticos", "Modificación en los perfiles de usuarios", "Solicitud de cambio de contraseñas", "Problemas en los sistemas", "Problemas con el correo electrónico", "Solicitud de cuentas de correo electrónico", "Solicitud de nuevos puestos de trabajo", "Solicitud soporte en el uso de App", "Otros" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 470, 30));

        jComboBox2.setBackground(new java.awt.Color(191, 185, 185));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa de ayuda", "Unidades de soporte", "Servicio técnico", "Administrador de Base de Datos", "Administrador de SUSE Linux", "Administrador Proxy y correo electrónico", "Administrador DEBIAN", "Redes LAN", "Comunicaciones", "Desarrollo de sistema Comercial", "Desarrollo de sistemas RRHH", "Desarrollo de sistemas de reclamo" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 470, 30));

        jTextArea1.setBackground(new java.awt.Color(245, 245, 245));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 580, 120));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(191, 185, 185));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 360, 100));

        jButton1Confirmar.setBackground(new java.awt.Color(191, 185, 185));
        jButton1Confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1Confirmar.setText("Confirmar");
        getContentPane().add(jButton1Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 120, 40));

        jButton1Cerrar.setBackground(new java.awt.Color(191, 185, 185));
        jButton1Cerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1Cerrar.setText("Cancelar");
        jButton1Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 120, 40));

        jLabel1NroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1NroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1NroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1NroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabel1NroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextField3NroTicketPorPantalla.setEditable(false);
        jTextField3NroTicketPorPantalla.setBackground(new java.awt.Color(191, 185, 185));
        jTextField3NroTicketPorPantalla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField3NroTicketPorPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 240, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CerrarActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Caso_de_uso_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cerrar;
    private javax.swing.JButton jButton1Confirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1NroTicket;
    private javax.swing.JLabel jLabelClasificacionTicket;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstadoActual;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGrupoResolucion;
    private javax.swing.JLabel jLabelNuevoEstado;
    private javax.swing.JLabel jLabelObservacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3NroTicketPorPantalla;
    // End of variables declaration//GEN-END:variables
}