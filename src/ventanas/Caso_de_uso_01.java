
package Ventanas;

import clases.Clasificacion;
import clases.Empleado;
import clases.Ticket;
import controllers.GestorClasificacion;
import controllers.GestorEmpleado;
import controllers.GestorSesion;
import controllers.GestorTicket;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.WindowConstants;
import org.hibernate.mapping.Collection;
import ventanas.Caso_de_uso_01_Observaciones;

/**
 *
 * @author Guido D'Antoni
 */
public class Caso_de_uso_01 extends javax.swing.JFrame {

        private static Empleado empleado;
      
    public Caso_de_uso_01() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        cerrar();
        
        jTextAreaDescripcion.setLineWrap(true); // evita expansion en ancho del textArea
        GestorClasificacion gestorClasificacion = new GestorClasificacion();
        List<String> clasificaciones = new ArrayList<String>();
        clasificaciones = gestorClasificacion.obtenerNombresClasificaciones();
        
        
        DefaultComboBoxModel combo= new DefaultComboBoxModel();
        
       for(int i=0; i<clasificaciones.size(); i++){
        
            combo.addElement(clasificaciones.get(i));
        }
       jComboBoxClasificacion.setModel(combo);
       
       
       
    }

 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTicketDefecto = new javax.swing.JTextField();
        jTextFieldLegajo = new javax.swing.JTextField();
        jTextFieldNombreApellido = new javax.swing.JTextField();
        jScrollPaneDescrip = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboBoxClasificacion = new javax.swing.JComboBox<>();
        jTextFieldFechaApertura = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelNroTicket = new javax.swing.JLabel();
        jLabelLegajo = new javax.swing.JLabel();
        jLabelNombreApellido = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        jLabelFechaApertura = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelMsjErrorNombre = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldTicketDefecto.setEditable(false);
        jTextFieldTicketDefecto.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTicketDefecto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTicketDefecto.setFocusable(false);
        jTextFieldTicketDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketDefectoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTicketDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 30));

        jTextFieldLegajo.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLegajoFocusGained(evt);
            }
        });
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
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 160, 30));

        jTextFieldNombreApellido.setEditable(false);
        jTextFieldNombreApellido.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldNombreApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldNombreApellido.setFocusable(false);
        jTextFieldNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 460, 30));

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

        jComboBoxClasificacion.setBackground(new java.awt.Color(191, 185, 185));
        jComboBoxClasificacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxClasificacion.setToolTipText("");
        jComboBoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasificacionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 480, 30));

        jTextFieldFechaApertura.setEditable(false);
        jTextFieldFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFechaApertura.setFocusable(false);
        getContentPane().add(jTextFieldFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 220, 30));

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldHora.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldHora.setFocusable(false);
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
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jButtonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 120, 40));

        jButtonCancelar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 120, 40));

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

        jLabelMsjErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelMsjErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMsjErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 190, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1025, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClasificacionActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
      
        //Caso_de_uso_01_ConfirmacionCancelacion a = new Caso_de_uso_01_ConfirmacionCancelacion(this);
        //a.setVisible(true);
       
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar el registro del ticket?", "Advertencia",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
       
       if(opcion==JOptionPane.YES_OPTION){
           
            PantallaMesaDeAyuda a = new PantallaMesaDeAyuda();
         
            this.setVisible(false);
            a.setVisible(true);
                
       }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidoActionPerformed
  
    }//GEN-LAST:event_jTextFieldNombreApellidoActionPerformed

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

    private void jTextFieldLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLegajoKeyTyped
       
       jTextFieldNombreApellido.setText("");
       char legajo=evt.getKeyChar();
       Integer numeroLegajo;
       
       
       if(legajo<'0' || legajo>'9'){
           evt.consume();
       }
       
       //si presiona enter o tab busco en la bd con el legajo el nombre de dicho empleado
       if(legajo == KeyEvent.VK_ENTER){
         
                      
                    jTextAreaDescripcion.requestFocus();
                    numeroLegajo=Integer.parseInt(jTextFieldLegajo.getText());
                     
                    String nombreApellido;
                     
                     
                    GestorEmpleado gestorEmpleado=new GestorEmpleado();
                    empleado = gestorEmpleado.obtenerEmpleado(numeroLegajo);
                     
                     if(empleado==null){
                         
                         jLabelMsjErrorNombre.setText("*Legajo inexistente");
                         
                                                  
                     }else{
                         nombreApellido= gestorEmpleado.obtenerNombre(numeroLegajo);
                         jTextFieldNombreApellido.setText(nombreApellido);
                         jLabelMsjErrorNombre.setText("");
                         
                         
                     }
                     
            
       }    
    }//GEN-LAST:event_jTextFieldLegajoKeyTyped

    private void jTextAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyTyped

     /*   if(empleado==null){
            jLabelMsjErrorNombre.setText("*Legajo inexistente");
        }
       */     
          //hasta 500 caracteres en el textArea
            if(jTextAreaDescripcion.getText().length()>=500){
                evt.consume();
            }
            
            if(evt.getKeyCode() == KeyEvent.VK_TAB){
                jComboBoxClasificacion.requestFocus();
            }  
    }//GEN-LAST:event_jTextAreaDescripcionKeyTyped

    private void jButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseClicked
       
        
        //Clasificacion clasificacion;
        Date d = new Date();
        Calendar c = new GregorianCalendar(); 
        c.setTime(d);
        
        String dia, mes, anio, hora, minutos, segundos, nombreClasificacion;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        anio = Integer.toString(c.get(Calendar.YEAR));
        hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
        minutos = Integer.toString(c.get(Calendar.MINUTE));
        segundos = Integer.toString(c.get(Calendar.SECOND));
        
             
        if(jTextFieldLegajo.getText().isEmpty() || jTextAreaDescripcion.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Los campos legajo y descripcion no puden ser nulos");
        }else if(empleado==null){
            JOptionPane.showMessageDialog(null, "El legajo es inexistente");
        }else{
        
        jTextFieldFechaApertura.setText(dia + "/" + mes + "/" + anio);
        jTextFieldHora.setText(hora + ":" + minutos + ":" + segundos);
        
           
        nombreClasificacion = (String) jComboBoxClasificacion.getSelectedItem();
        Integer numeroLegajo=Integer.parseInt(jTextFieldLegajo.getText());
        String descripcion = jTextAreaDescripcion.getText();
        
        GestorTicket gestorTicket = new GestorTicket();
        gestorTicket.RegistrarTicket(numeroLegajo,nombreClasificacion,descripcion);
        
        Ticket ticket = gestorTicket.obtenerNroUltimoTiket();
        
        jTextFieldTicketDefecto.setText( String.valueOf((ticket.getNroTicket())) );
        JOptionPane.showMessageDialog(null, ("Se creo exitosamente el ticket con NroTicket: " + ticket.getNroTicket()));
        
                   
            Caso_de_uso_01_Observaciones  cu1 = new Caso_de_uso_01_Observaciones();
            cu1.setVisible(true);
            cu1.cargarObservaciones(ticket.getNroTicket());
            this.setVisible(false);
        
      }  
        
       
        
    }//GEN-LAST:event_jButtonAceptarMouseClicked

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
       
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldTicketDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketDefectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTicketDefectoActionPerformed

    private void jButtonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonAceptar.doClick();
        }  
        
    }//GEN-LAST:event_jButtonAceptarKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCancelar.doClick();
        }           
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jTextFieldLegajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLegajoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegajoFocusGained

    private void jTextFieldLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegajoActionPerformed

    
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
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFechaApertura;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLegajo;
    private javax.swing.JLabel jLabelMsjErrorNombre;
    private javax.swing.JLabel jLabelNombreApellido;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JScrollPane jScrollPaneDescrip;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldFechaApertura;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldNombreApellido;
    private javax.swing.JTextField jTextFieldTicketDefecto;
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
        int valor=JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir? Se perderán los cambios realizados","Advertencia",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
            
            
            this.setVisible(false);
            PantallaMesaDeAyuda pantallaMesaAyuda = new PantallaMesaDeAyuda();
            pantallaMesaAyuda.setVisible(true);
        }
    }
    
}