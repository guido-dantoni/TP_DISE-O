
package ventanas;
import clases.Intervencion;
import controllers.Enum_EstadoIntervencion;
import controllers.GestorClasificacion;
import controllers.GestorIntervencion;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

 /**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class Caso_de_uso_08 extends javax.swing.JFrame {

    private Intervencion intervecion;
    private Caso_de_uso_07 cu7;
    
    public Caso_de_uso_08() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        
        jTextAreaObservacion.setLineWrap(true); // evita expansion en ancho del textArea
        jTextAreaDescripcion.setLineWrap(true); // evita expansion en ancho del textArea
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNroTicket = new javax.swing.JLabel();
        jLabelEstadoActual = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelNuevoEstado = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        jLabelObservacion = new javax.swing.JLabel();
        jTextFieldNroTicket = new javax.swing.JTextField();
        jTextFieldEstadoActual = new javax.swing.JTextField();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboBoxNuevoEstado = new javax.swing.JComboBox<>();
        jScrollPaneObservacion = new javax.swing.JScrollPane();
        jTextAreaObservacion = new javax.swing.JTextArea();
        jComboBoxClasificacion = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLogoFondo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actualizar estado de intervención");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelEstadoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstadoActual.setText("Estado Actual: ");
        getContentPane().add(jLabelEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescripcion.setText("Descripción: ");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelNuevoEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNuevoEstado.setText("Nuevo estado: ");
        getContentPane().add(jLabelNuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabelClasificacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClasificacion.setText("Clasificacion: ");
        getContentPane().add(jLabelClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabelObservacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservacion.setText("Observacion: ");
        getContentPane().add(jLabelObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextFieldNroTicket.setEditable(false);
        jTextFieldNroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldNroTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNroTicket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNroTicket.setFocusable(false);
        getContentPane().add(jTextFieldNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 30));

        jTextFieldEstadoActual.setEditable(false);
        jTextFieldEstadoActual.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldEstadoActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEstadoActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEstadoActual.setFocusable(false);
        jTextFieldEstadoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActualActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 270, 30));

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setBackground(new java.awt.Color(191, 185, 185));
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextAreaDescripcion.setFocusable(false);
        jScrollPaneDescripcion.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPaneDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 850, 120));

        jComboBoxNuevoEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNuevoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cerrada", "En espera", "Mal asignada", "Solucionada parcialmente", " " }));
        getContentPane().add(jComboBoxNuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 290, 30));

        jTextAreaObservacion.setColumns(20);
        jTextAreaObservacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaObservacion.setRows(5);
        jTextAreaObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextAreaObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaObservacionKeyPressed(evt);
            }
        });
        jScrollPaneObservacion.setViewportView(jTextAreaObservacion);

        getContentPane().add(jScrollPaneObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 850, 180));

        jComboBoxClasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jComboBoxClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 660, 30));

        jButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAceptar.setText("Actualizar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 120, 40));

        jButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, 120, 40));

        jLabelTitulo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo.setFont(new java.awt.Font("MS PGothic", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTitulo.setText("La llamita");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 200, 50));

        jLabelLogoFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofondo_GrupoResolucion.png"))); // NOI18N
        getContentPane().add(jLabelLogoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 350, 400));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-grupoResolucion.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void jTextFieldEstadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActualActionPerformed

    private void jTextAreaObservacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaObservacionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            jButtonAceptar.requestFocus();
        } 
    }//GEN-LAST:event_jTextAreaObservacionKeyPressed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
        if(jTextAreaObservacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo observaciones no puede estar vacío");
        } else {
            
            String nuevoEstado = jComboBoxNuevoEstado.getSelectedItem().toString();
            GestorIntervencion gestorIntervencion = new GestorIntervencion();
            gestorIntervencion.registrarNuevoEstado(intervecion, nuevoEstado);
            
            
        }
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed
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
            java.util.logging.Logger.getLogger(Caso_de_uso_08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_08().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JComboBox<String> jComboBoxNuevoEstado;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstadoActual;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogoFondo;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JLabel jLabelNuevoEstado;
    private javax.swing.JLabel jLabelObservacion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JScrollPane jScrollPaneObservacion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextArea jTextAreaObservacion;
    private javax.swing.JTextField jTextFieldEstadoActual;
    private javax.swing.JTextField jTextFieldNroTicket;
    // End of variables declaration//GEN-END:variables

    void modificarEstado(int idInt, Caso_de_uso_07 c) {
            this.cu7=c;
            GestorIntervencion gestorIntervencion = new GestorIntervencion();
            this.intervecion = gestorIntervencion.obtenerIntervencion(idInt);
            this.cargarCampos();
    }

    private void cargarCampos() {
        
         String estadoActual = intervecion.getEstadoactual();
         GestorClasificacion gestorClasificacion = new GestorClasificacion();
         List<String> clasificaciones = new ArrayList();
         clasificaciones = gestorClasificacion.obtenerNombresClasificaciones();
         GestorIntervencion gestorIntervencion = new GestorIntervencion();
                 
         DefaultComboBoxModel comboClasificacion = new DefaultComboBoxModel();
         
        jTextFieldNroTicket.setText(String.valueOf(intervecion.getTicket().getNroTicket()));
        jTextAreaDescripcion.setText(intervecion.getTicket().getDescripcion());
        jTextFieldEstadoActual.setText("Trabajando");
        
       /* if(estadoActual.equals(Enum_EstadoIntervencion.ASIGNADA.toString())){
            jTextFieldEstadoActual.setText("Asignada");
            }else if(estadoActual.equals(Enum_EstadoIntervencion.CERRADA.toString())){
                 jTextFieldEstadoActual.setText("Cerrada");
                }else if(estadoActual.equals(Enum_EstadoIntervencion.EN_ESPERA.toString())){
                     jTextFieldEstadoActual.setText("En espera");
                    }else{
                         jTextFieldEstadoActual.setText("Trabajando");
                }   
        */
       
        comboClasificacion.addElement(intervecion.getTicket().getClasificacion().getNombreclasificacion());
        for(int i=0; i<clasificaciones.size(); i++){
            if(!clasificaciones.get(i).equals(intervecion.getTicket().getClasificacion().getNombreclasificacion())){
                    comboClasificacion.addElement(clasificaciones.get(i));
            }
        }
     
         
        jComboBoxClasificacion.setModel(comboClasificacion);

        
  }
}