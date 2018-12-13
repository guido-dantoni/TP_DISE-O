
package ventanas;
import Dao.GrupoResolucionDao;
import clases.IntervencionDTO;
import clases.Usuario;
import controllers.Enum_EstadoIntervencion;

import controllers.GestorFecha;
import controllers.GestorGrupoResolucion;
import controllers.GestorIntervencion;
import controllers.GestorSesion;

 import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
 /**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class Caso_de_uso_07 extends javax.swing.JFrame {
       private final JButton btnHasta;
       private final JButton btnDesde;
       private List<IntervencionDTO> intervencionesFiltradas = new ArrayList<>();
       private int row;
       private String grupoLogueado;
       
    public Caso_de_uso_07() {
        
       
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        cerrar();
        
        //apago la mitad de la pantalla de abajo
        jButtonModificarComentarios.setEnabled(false);
        jButtonModificarEstado.setEnabled(false);
        
        jTextAreaObservacion.setLineWrap(true); // evita expansion en ancho del textArea
        
        //creo los botones de los datePicker
        this.btnHasta = (JButton) jXDatePickerFechaHasta.getComponent(1);
        this.btnDesde = (JButton) jXDatePickerFechaDesde.getComponent(1);
        
        //Esto es para anular las fechas mayores a la de hoy 
        GestorFecha gestorfecha = new GestorFecha();
        Date fechaActual =gestorfecha.obtenerFecha();
        jXDatePickerFechaHasta.getMonthView().setUpperBound(fechaActual);
        jXDatePickerFechaDesde.getMonthView().setUpperBound(fechaActual);
        
        setGrupoLogueado();

    }

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
        jButtonBuscar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservacion = new javax.swing.JTextArea();
        jButtonModificarEstado = new javax.swing.JButton();
        jButtonModificarComentarios = new javax.swing.JButton();
        jLabelLogoFondo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar intervenciones asignadas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNroTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldNroTicket.setBorder(null);
        jTextFieldNroTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNroTicketKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNroTicketKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 30));

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asiganada", "Cerrada", "En espera", "Mal asignada", "Trabajando", "Solucionada parcialmente", "Todos" }));
        jComboBoxEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEstadoFocusGained(evt);
            }
        });
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        jComboBoxEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxEstadoKeyPressed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 230, 30));

        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldLegajo.setBorder(null);
        jTextFieldLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLegajoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLegajoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 200, 30));

        jXDatePickerFechaDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXDatePickerFechaDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerFechaDesdeActionPerformed(evt);
            }
        });
        jXDatePickerFechaDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jXDatePickerFechaDesdeKeyPressed(evt);
            }
        });
        getContentPane().add(jXDatePickerFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        jXDatePickerFechaHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXDatePickerFechaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerFechaHastaActionPerformed(evt);
            }
        });
        jXDatePickerFechaHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jXDatePickerFechaHastaKeyPressed(evt);
            }
        });
        getContentPane().add(jXDatePickerFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 140, 30));

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado:");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, -1));

        jLabelFeschaDesde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFeschaDesde.setText("Fecha Desde: ");
        getContentPane().add(jLabelFeschaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, -1));

        jLabelFechaHasta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaHasta.setText("Fecha Hasta:");
        getContentPane().add(jLabelFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabelNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroLegajo.setText("Nro. Legajo:");
        getContentPane().add(jLabelNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jButtonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jButtonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonBuscarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 120, 40));

        jButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
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
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 190, 40));

        jTableTabla.setBackground(new java.awt.Color(191, 185, 185));
        jTableTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.ticket", "Nro. legajo", "Clasificación actual del ticket", "Estado del ticket", "Fecha apertura", "Fecha asignación intervención", "Grupo resolución", "Estado intervencion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabla.setFocusable(false);
        jTableTabla.setGridColor(new java.awt.Color(102, 102, 102));
        jTableTabla.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTableTabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTablaMouseClicked(evt);
            }
        });
        jTableTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabla);
        if (jTableTabla.getColumnModel().getColumnCount() > 0) {
            jTableTabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableTabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableTabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableTabla.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTableTabla.getColumnModel().getColumn(7).setPreferredWidth(60);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1130, 170));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1150, 10));

        jLabelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservaciones.setText("Observaciones:");
        getContentPane().add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 40));

        jTextAreaObservacion.setEditable(false);
        jTextAreaObservacion.setBackground(new java.awt.Color(191, 185, 185));
        jTextAreaObservacion.setColumns(20);
        jTextAreaObservacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextAreaObservacion.setRows(5);
        jTextAreaObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextAreaObservacion.setFocusable(false);
        jScrollPane2.setViewportView(jTextAreaObservacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 396, 850, 140));

        jButtonModificarEstado.setBackground(new java.awt.Color(204, 204, 204));
        jButtonModificarEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonModificarEstado.setText("Modificar estado");
        jButtonModificarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarEstadoActionPerformed(evt);
            }
        });
        jButtonModificarEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonModificarEstadoKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 190, 40));

        jButtonModificarComentarios.setBackground(new java.awt.Color(204, 204, 204));
        jButtonModificarComentarios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonModificarComentarios.setText("Modificar comentarios");
        jButtonModificarComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarComentariosActionPerformed(evt);
            }
        });
        jButtonModificarComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonModificarComentariosKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonModificarComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 200, 40));

        jLabelLogoFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofondo_GrupoResolucion.png"))); // NOI18N
        getContentPane().add(jLabelLogoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 400));

        jLabelTitulo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo.setFont(new java.awt.Font("MS PGothic", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTitulo.setText("La llamita");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 200, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-grupoResolucion.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void jXDatePickerFechaDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerFechaDesdeActionPerformed
        btnDesde.setBackground(new java.awt.Color(222,222,222));
         if(jXDatePickerFechaDesde.getDate() != null && jXDatePickerFechaHasta.getDate() != null){
                if(jXDatePickerFechaDesde.getDate().after(jXDatePickerFechaHasta.getDate())){
                    Toolkit.getDefaultToolkit().beep();//ruido beep
                    jXDatePickerFechaDesde.setDate(null);
                    btnDesde.setBackground(Color.RED);
                }
        }
    }//GEN-LAST:event_jXDatePickerFechaDesdeActionPerformed
     private void jXDatePickerFechaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerFechaHastaActionPerformed
         btnHasta.setBackground(new java.awt.Color(222,222,222));
         if(jXDatePickerFechaDesde.getDate() != null && jXDatePickerFechaHasta.getDate() != null){
                if(jXDatePickerFechaDesde.getDate().after(jXDatePickerFechaHasta.getDate())){
                    Toolkit.getDefaultToolkit().beep();//ruido beep
                    jXDatePickerFechaHasta.setDate(null);
                    btnHasta.setBackground(Color.RED);
                   
                }
        }
    }//GEN-LAST:event_jXDatePickerFechaHastaActionPerformed

    private void jComboBoxEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxEstadoKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonBuscar.doClick();
        }
    }//GEN-LAST:event_jComboBoxEstadoKeyPressed

    private void jXDatePickerFechaDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXDatePickerFechaDesdeKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonBuscar.doClick();
        }
    }//GEN-LAST:event_jXDatePickerFechaDesdeKeyPressed

    private void jXDatePickerFechaHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXDatePickerFechaHastaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonBuscar.doClick();
        }
    }//GEN-LAST:event_jXDatePickerFechaHastaKeyPressed

    private void jComboBoxEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEstadoFocusGained
        jComboBoxEstado.showPopup();
    }//GEN-LAST:event_jComboBoxEstadoFocusGained

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCancelar.doClick();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        salir();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBuscarKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCancelar.doClick();
        }
    }//GEN-LAST:event_jButtonBuscarKeyPressed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       //vacio la tabla para una nueva busqueda si es que tiene algo
       DefaultTableModel model = (DefaultTableModel) jTableTabla.getModel();
       model.setRowCount(0);
        
        Integer nroTicket=null, nroLegajoEmpleado=null;
        String estadoIntervencion;
        Date fechaDesde, fechaHasta;
        GestorIntervencion gestorIntervencion = new GestorIntervencion();
        
        if(!jTextFieldNroTicket.getText().isEmpty()){
            nroTicket = Integer.parseInt(jTextFieldNroTicket.getText());
        }
        
        if(!jTextFieldLegajo.getText().isEmpty()){
            nroLegajoEmpleado = Integer.parseInt(jTextFieldLegajo.getText());
        }
        
           switch (jComboBoxEstado.getSelectedItem().toString()) {
               case "Asignada":
                   estadoIntervencion = Enum_EstadoIntervencion.ASIGNADA.toString();
                   break;
               case "En espera":
                   estadoIntervencion = Enum_EstadoIntervencion.EN_ESPERA.toString();
                   break;
               case "Trabajando":
                   estadoIntervencion = Enum_EstadoIntervencion.TRABAJANDO.toString();
                   break;
               case "Cerrada":
                   estadoIntervencion = Enum_EstadoIntervencion.CERRADA.toString();
                   break;
               case "Mal asiganda":
                   estadoIntervencion = Enum_EstadoIntervencion.MAL_ASIGNADA.toString();
                   break;
               case "Solucionada parcialmente":
                    estadoIntervencion = Enum_EstadoIntervencion.SOLUCIONADA_PARCIALMENTE.toString();       
                    break;
                default:
                   estadoIntervencion = "Todos";
                   break;
           }
           
           fechaDesde = jXDatePickerFechaDesde.getDate(); 
           fechaHasta = jXDatePickerFechaHasta.getDate();
           
           this.intervencionesFiltradas = gestorIntervencion.buscarIntervencionesCriterios(nroTicket,nroLegajoEmpleado,estadoIntervencion,fechaDesde,fechaHasta);
           
           if(intervencionesFiltradas.isEmpty()){
                       jButtonModificarComentarios.setEnabled(false);
                       jButtonModificarEstado.setEnabled(false);
                       jTableTabla.setFocusable(false);
                       //AGREGAR EL VACIADO DE LA TABLA
                       
               JOptionPane.showMessageDialog(null, "No existen intervenciones que cumplan con los criterios de busqueda seleccionados");
           }else{
               
               //AGREGAR EL VACIADO DE LA TABLA
               jTableTabla.setFocusable(true);
               jTableTabla.requestFocus();
               jButtonModificarComentarios.setEnabled(true);
               jButtonModificarEstado.setEnabled(true);
               
              DefaultTableModel modelo =  (DefaultTableModel) jTableTabla.getModel();
               for(int i=0; i<intervencionesFiltradas.size(); i++){
                
                modelo.addRow(new Object[8]); // agrega una fila
                
                //Cargo todas las columnas menos la de operador
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getNroTicket(), i, 0);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getLegajoEmpleado(), i, 1);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getClasificacionActualTicket(), i, 2);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getEstadoActualTicket(), i, 3);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getFechaApertura(), i, 4);               
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getFechaAsiganacionIntervencion(), i, 5);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getGrupoResoulucion(), i, 6);
                jTableTabla.setValueAt(intervencionesFiltradas.get(i).getEstadoIntervencion(), i, 7);
               }
           }                      
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldNroTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroTicketKeyTyped
       //me consume las letras y si la cadena es > 9
        char ticket=evt.getKeyChar();

        if(ticket<'0' || ticket>'9' || jTextFieldNroTicket.getText().length()>9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();//ruido beep
        }

    }//GEN-LAST:event_jTextFieldNroTicketKeyTyped

    private void jTextFieldLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLegajoKeyTyped
                //no me deja ingresar letras ni numeros con mas de 6 caracteres
        char legajo=evt.getKeyChar();

        if(legajo<'0' || legajo>'9' || jTextFieldLegajo.getText().length()>6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();//ruido beep
        }

    }//GEN-LAST:event_jTextFieldLegajoKeyTyped

    private void jTextFieldNroTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroTicketKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonBuscar.doClick();
        }
    }//GEN-LAST:event_jTextFieldNroTicketKeyPressed

    private void jTextFieldLegajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLegajoKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonBuscar.doClick();
        }
    }//GEN-LAST:event_jTextFieldLegajoKeyPressed

    private void jTableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaMouseClicked
         row = jTableTabla.getSelectedRow();
                 
        if(row >= 0){   
                jTextAreaObservacion.setText(intervencionesFiltradas.get(row).getObservacionIntervencion());
         }
    }//GEN-LAST:event_jTableTablaMouseClicked

    private void jButtonModificarComentariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonModificarComentariosKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jButtonModificarComentarios.doClick();
            }
    }//GEN-LAST:event_jButtonModificarComentariosKeyPressed

    private void jButtonModificarComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarComentariosActionPerformed
        JOptionPane.showMessageDialog(null, "Funcionalidad en desarrollo");
    }//GEN-LAST:event_jButtonModificarComentariosActionPerformed

    private void jButtonModificarEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonModificarEstadoKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jButtonModificarEstado.doClick();
            }
    }//GEN-LAST:event_jButtonModificarEstadoKeyPressed

    private void jButtonModificarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarEstadoActionPerformed
       if(!intervencionesFiltradas.get(row).getEstadoIntervencion().equals(Enum_EstadoIntervencion.ASIGNADA.toString()) ||
               !intervencionesFiltradas.get(row).getGrupoResoulucion().equals(grupoLogueado)){
           
           JOptionPane.showMessageDialog(null, "El estado de esta intervencion no se puede modificar porque no está asignada a " + grupoLogueado);
                   
       }else{
           
            Caso_de_uso_08 c = new Caso_de_uso_08();
            this.setVisible(false);
            c.setVisible(true);
            c.modificarEstado(intervencionesFiltradas.get(row).getIdIntervencion(), this);
       }
    }//GEN-LAST:event_jButtonModificarEstadoActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTableTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTablaKeyPressed
           row = jTableTabla.getSelectedRow();
                 
           if(row >= 0 && (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)){   
                jTextAreaObservacion.setText(intervencionesFiltradas.get(row).getObservacionIntervencion());
             }
           
            if(evt.getKeyCode() == KeyEvent.VK_TAB){
                jButtonModificarEstado.requestFocus();
            }
    }//GEN-LAST:event_jTableTablaKeyPressed
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
    private javax.swing.JButton jButtonBuscar;
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
    private javax.swing.JTextArea jTextAreaObservacion;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldNroTicket;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaDesde;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaHasta;
    // End of variables declaration//GEN-END:variables

    public void cerrar(){
        
        try{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e){
                    salir();
                }
               
            });
        
        }catch(Exception e){
                e.printStackTrace();
                }
    }
    public void salir(){

            Pantalla_Grupo_de_Resolucion a = new Pantalla_Grupo_de_Resolucion();
            this.setVisible(false);
            a.setVisible(true);
    }

    private void setGrupoLogueado() {

        GestorGrupoResolucion gestorGrupo = new GestorGrupoResolucion();
        this.grupoLogueado = gestorGrupo.obtenerGrupoLogueado();
    }
    
    
}