
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
 import java.awt.Color;
import java.time.DayOfWeek;
import javax.swing.ImageIcon;
 /**
 *
 * @author Usuario
 */
public class Caso_de_uso_07 extends javax.swing.JFrame {
     /**
     * Creates new form caso_de_uso_7
     */
    public Caso_de_uso_07() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNroTicket = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldLegajo = new javax.swing.JTextField();
        jXDatePickerFechaDesde = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaHasta = new org.jdesktop.swingx.JXDatePicker();
        jLabelEstado = new javax.swing.JLabel();
        jLabelFeschaDesde = new javax.swing.JLabel();
        jLabelFechaHasta = new javax.swing.JLabel();
        jLabelNroTicket = new javax.swing.JLabel();
        jLabelNroLegajo = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonModificarEstado = new javax.swing.JButton();
        jButtonModificarComentarios = new javax.swing.JButton();
        jLabelLogoFondo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar intervenciones asignadas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNroTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNroTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNroTicketActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, 30));

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asiganada", "Abierto sin derivar", "Abierto derivado", "Solucionado a a espera de ok", "cerrado" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 30));

        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegajoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 200, 30));

        jXDatePickerFechaDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXDatePickerFechaDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerFechaDesdeActionPerformed(evt);
            }
        });
        getContentPane().add(jXDatePickerFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        jXDatePickerFechaHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXDatePickerFechaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerFechaHastaActionPerformed(evt);
            }
        });
        getContentPane().add(jXDatePickerFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 140, 30));

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado:");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, -1));

        jLabelFeschaDesde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFeschaDesde.setText("Fecha Desde: ");
        getContentPane().add(jLabelFeschaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, -1));

        jLabelFechaHasta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaHasta.setText("Fecha Hasta:");
        getContentPane().add(jLabelFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabelNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroLegajo.setText("Nro. Legajo:");
        getContentPane().add(jLabelNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAceptar.setText("Buscar");
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 120, 40));

        jButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 170, 40));

        jTableTabla.setBackground(new java.awt.Color(204, 255, 255));
        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro.ticket", "Nro. legajo", "Clasificación actual del ticket", "Estado del ticket", "Fecha apertura", "Fecha asignación intervención", "Grupo resolución"
            }
        ));
        jTableTabla.setGridColor(new java.awt.Color(102, 102, 102));
        jTableTabla.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(jTableTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1000, 170));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1030, 10));

        jLabelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservaciones.setText("Observaciones:");
        getContentPane().add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 396, 730, 130));

        jButtonModificarEstado.setBackground(new java.awt.Color(204, 204, 204));
        jButtonModificarEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificarEstado.setText("Modificar estado");
        getContentPane().add(jButtonModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 170, 40));

        jButtonModificarComentarios.setBackground(new java.awt.Color(204, 204, 204));
        jButtonModificarComentarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificarComentarios.setText("Modificar comentarios");
        getContentPane().add(jButtonModificarComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 170, 40));

        jLabelLogoFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofondo_GrupoResolucion.png"))); // NOI18N
        getContentPane().add(jLabelLogoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 400));

        jLabelTitulo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo.setFont(new java.awt.Font("MS PGothic", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTitulo.setText("La llamita");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 200, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-grupoResolucion.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed
     private void jTextFieldLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegajoActionPerformed
     private void jXDatePickerFechaDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerFechaDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePickerFechaDesdeActionPerformed
     private void jTextFieldNroTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNroTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNroTicketActionPerformed
     private void jXDatePickerFechaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerFechaHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePickerFechaHastaActionPerformed
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
            java.util.logging.Logger.getLogger(Caso_de_uso_07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_07().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificarComentarios;
    private javax.swing.JButton jButtonModificarEstado;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaHasta;
    private javax.swing.JLabel jLabelFeschaDesde;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogoFondo;
    private javax.swing.JLabel jLabelNroLegajo;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabla;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldNroTicket;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaDesde;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaHasta;
    // End of variables declaration//GEN-END:variables
     private void setTextFill(Color GREEN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}