/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import controllers.GestorClasificacion;
import controllers.GestorGrupoResolucion;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcos
 */
public class Caso_de_uso_02 extends javax.swing.JFrame {

    /**
     * Creates new form PantallaBuscarCU02
     */
    public Caso_de_uso_02() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
        
        GestorClasificacion gestorClasificacion = new GestorClasificacion();
        GestorGrupoResolucion gestorGrupo = new GestorGrupoResolucion();
        
        List<String> clasificaciones = new ArrayList();
        List<String> grupos = new ArrayList();
        
        //recupero las clasificaciones y los grupos resolucion respectivamente
        clasificaciones = gestorClasificacion.obtenerNombresClasificaciones();
        grupos = gestorGrupo.obtenerNombreGrupos();
        
        DefaultComboBoxModel comboClasificacion= new DefaultComboBoxModel();
        DefaultComboBoxModel comboGrupo= new DefaultComboBoxModel();
        
        //lleno el combo de clasificacion
       for(int i=0; i<clasificaciones.size(); i++){
        
            comboClasificacion.addElement(clasificaciones.get(i));
        }
       //lleno el combo de ultimo grupo de resolucion
       for(int i=0; i<grupos.size(); i++){
        
            comboGrupo.addElement(grupos.get(i));
        }
       
       jComboBox1ClasificacionActual.setModel(comboClasificacion);
       jComboBox1UltimoGpoResolucion.setModel(comboGrupo);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Uno = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jLabelDE = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelC = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNroTicket = new javax.swing.JLabel();
        jLabelNroLegajo = new javax.swing.JLabel();
        jLabelFechaApertura = new javax.swing.JLabel();
        jLabelHoraApertura = new javax.swing.JLabel();
        jLabelOperadorQueAbrioElTicket = new javax.swing.JLabel();
        jLabelClasificacionActual = new javax.swing.JLabel();
        jLabelEstadoActual = new javax.swing.JLabel();
        jLabelFechaUltimoCambioEstado = new javax.swing.JLabel();
        jLabelGpoResolucionActual = new javax.swing.JLabel();
        jTextFieldLegajo2 = new javax.swing.JTextField();
        jTextFieldNroTicket2 = new javax.swing.JTextField();
        jTextFieldHoraApertura = new javax.swing.JTextField();
        jTextFieldOperadorQueAbrio = new javax.swing.JTextField();
        jTextFieldClasificacionActual = new javax.swing.JTextField();
        jTextFieldFechaApertura = new javax.swing.JTextField();
        jTextFieldEstadoActual = new javax.swing.JTextField();
        jTextFieldFechaUltimoCambioEstado = new javax.swing.JTextField();
        jTextFieldGpoResolucionAsignado = new javax.swing.JTextField();
        jButtonConfReporte = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelInfoDeCadaTicket = new javax.swing.JLabel();
        jButtonVerDetalle = new javax.swing.JButton();
        jLabel1NroTicket = new javax.swing.JLabel();
        jLabel2NroLegajo = new javax.swing.JLabel();
        jLabel3ClasificacionActual = new javax.swing.JLabel();
        jLabel4EstadoActual = new javax.swing.JLabel();
        jLabel5FechaApertura = new javax.swing.JLabel();
        jLabel6FechaActualizacionEstado = new javax.swing.JLabel();
        jLabel7UltimoGpoResolucion = new javax.swing.JLabel();
        jTextField1NroTicket = new javax.swing.JTextField();
        jTextFieldNroLegajo1 = new javax.swing.JTextField();
        jComboBox1ClasificacionActual = new javax.swing.JComboBox<>();
        jComboBox1EstadoActual = new javax.swing.JComboBox<>();
        jComboBox1UltimoGpoResolucion = new javax.swing.JComboBox<>();
        jXDatePickerFechaApertura = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaAcualizacion = new org.jdesktop.swingx.JXDatePicker();
        jLabel1InfoDeLosTicket = new javax.swing.JLabel();
        jButton1Buscar = new javax.swing.JButton();
        jTextFieldNroLegajo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Uno.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1Uno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1Uno.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1Uno.setText("1");
        getContentPane().add(jLabel1Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jButtonAnterior.setBackground(new java.awt.Color(191, 185, 185));
        jButtonAnterior.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAnterior.setText("Anterior");
        getContentPane().add(jButtonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jLabelDE.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDE.setText("de");
        getContentPane().add(jLabelDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, 40));

        jButtonSiguiente.setBackground(new java.awt.Color(191, 185, 185));
        jButtonSiguiente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabelC.setBackground(new java.awt.Color(191, 185, 185));
        jLabelC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelC.setForeground(new java.awt.Color(51, 153, 255));
        jLabelC.setText("C");
        getContentPane().add(jLabelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 20, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1025, 10));

        jLabelNroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroTicket.setText("Nro. Ticket");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabelNroLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroLegajo.setText("Nro. Legajo");
        getContentPane().add(jLabelNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabelFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jLabelFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaApertura.setText("Fecha apertura");
        getContentPane().add(jLabelFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabelHoraApertura.setBackground(new java.awt.Color(191, 185, 185));
        jLabelHoraApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelHoraApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHoraApertura.setText("Hora apertura");
        getContentPane().add(jLabelHoraApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabelOperadorQueAbrioElTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelOperadorQueAbrioElTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOperadorQueAbrioElTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOperadorQueAbrioElTicket.setText("Operador que abrió el ticket");
        getContentPane().add(jLabelOperadorQueAbrioElTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabelClasificacionActual.setBackground(new java.awt.Color(191, 185, 185));
        jLabelClasificacionActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClasificacionActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClasificacionActual.setText("Clasificación actual del ticket");
        getContentPane().add(jLabelClasificacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jLabelEstadoActual.setBackground(new java.awt.Color(191, 185, 185));
        jLabelEstadoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstadoActual.setText("Estado actual del ticket");
        getContentPane().add(jLabelEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabelFechaUltimoCambioEstado.setBackground(new java.awt.Color(191, 185, 185));
        jLabelFechaUltimoCambioEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaUltimoCambioEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaUltimoCambioEstado.setText("Fecha último cambio estado");
        getContentPane().add(jLabelFechaUltimoCambioEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jLabelGpoResolucionActual.setBackground(new java.awt.Color(191, 185, 185));
        jLabelGpoResolucionActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGpoResolucionActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGpoResolucionActual.setText("Grupo resolución actual");
        getContentPane().add(jLabelGpoResolucionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jTextFieldLegajo2.setEditable(false);
        jTextFieldLegajo2.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldLegajo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldLegajo2.setFocusable(false);
        jTextFieldLegajo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegajo2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLegajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 260, 30));

        jTextFieldNroTicket2.setEditable(false);
        jTextFieldNroTicket2.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldNroTicket2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldNroTicket2.setFocusable(false);
        getContentPane().add(jTextFieldNroTicket2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 260, 30));

        jTextFieldHoraApertura.setEditable(false);
        jTextFieldHoraApertura.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldHoraApertura.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldHoraApertura.setFocusable(false);
        getContentPane().add(jTextFieldHoraApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 260, 30));

        jTextFieldOperadorQueAbrio.setEditable(false);
        jTextFieldOperadorQueAbrio.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldOperadorQueAbrio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldOperadorQueAbrio.setFocusable(false);
        getContentPane().add(jTextFieldOperadorQueAbrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 260, 30));

        jTextFieldClasificacionActual.setEditable(false);
        jTextFieldClasificacionActual.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldClasificacionActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldClasificacionActual.setFocusable(false);
        getContentPane().add(jTextFieldClasificacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 260, 30));

        jTextFieldFechaApertura.setEditable(false);
        jTextFieldFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldFechaApertura.setFocusable(false);
        getContentPane().add(jTextFieldFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 260, 30));

        jTextFieldEstadoActual.setEditable(false);
        jTextFieldEstadoActual.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldEstadoActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldEstadoActual.setFocusable(false);
        getContentPane().add(jTextFieldEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 260, 30));

        jTextFieldFechaUltimoCambioEstado.setEditable(false);
        jTextFieldFechaUltimoCambioEstado.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldFechaUltimoCambioEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldFechaUltimoCambioEstado.setFocusable(false);
        getContentPane().add(jTextFieldFechaUltimoCambioEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 260, 30));

        jTextFieldGpoResolucionAsignado.setEditable(false);
        jTextFieldGpoResolucionAsignado.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldGpoResolucionAsignado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldGpoResolucionAsignado.setFocusable(false);
        getContentPane().add(jTextFieldGpoResolucionAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 260, 30));

        jButtonConfReporte.setBackground(new java.awt.Color(191, 185, 185));
        jButtonConfReporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfReporte.setText("Configurar reporte");
        jButtonConfReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfReporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 190, 40));

        jButtonCancelar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 170, 40));

        jLabelInfoDeCadaTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelInfoDeCadaTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInfoDeCadaTicket.setForeground(new java.awt.Color(246, 58, 58));
        jLabelInfoDeCadaTicket.setText("Información asociada a cada ticket");
        getContentPane().add(jLabelInfoDeCadaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jButtonVerDetalle.setBackground(new java.awt.Color(191, 185, 185));
        jButtonVerDetalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVerDetalle.setText("Ver detalle");
        jButtonVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 170, 40));

        jLabel1NroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1NroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1NroTicket.setText("Nro. Ticket:");
        getContentPane().add(jLabel1NroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel2NroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2NroLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2NroLegajo.setText("Nro. Legajo: ");
        getContentPane().add(jLabel2NroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 30));

        jLabel3ClasificacionActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3ClasificacionActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3ClasificacionActual.setText("Clasificación actual:");
        getContentPane().add(jLabel3ClasificacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        jLabel4EstadoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4EstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4EstadoActual.setText("Estado actual:");
        getContentPane().add(jLabel4EstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        jLabel5FechaApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5FechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5FechaApertura.setText("Fecha apertura:");
        getContentPane().add(jLabel5FechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel6FechaActualizacionEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6FechaActualizacionEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6FechaActualizacionEstado.setText("Fecha actualización estado:");
        getContentPane().add(jLabel6FechaActualizacionEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, 30));

        jLabel7UltimoGpoResolucion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7UltimoGpoResolucion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7UltimoGpoResolucion.setText("Último grupo de resolución:");
        getContentPane().add(jLabel7UltimoGpoResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        jTextField1NroTicket.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1NroTicket.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1NroTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1NroTicketKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1NroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, 30));

        jTextFieldNroLegajo1.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNroLegajo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldNroLegajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 190, 30));

        jComboBox1ClasificacionActual.setBackground(new java.awt.Color(191, 185, 185));
        jComboBox1ClasificacionActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1ClasificacionActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas" }));
        getContentPane().add(jComboBox1ClasificacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 550, 30));

        jComboBox1EstadoActual.setBackground(new java.awt.Color(191, 185, 185));
        jComboBox1EstadoActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1EstadoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abierto en mesa de ayuda", "Abierto derivado", "Solucionado a la espera de OK", "Cerrado", "Todos" }));
        jComboBox1EstadoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1EstadoActualActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1EstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 260, 30));

        jComboBox1UltimoGpoResolucion.setBackground(new java.awt.Color(245, 245, 245));
        jComboBox1UltimoGpoResolucion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1UltimoGpoResolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(jComboBox1UltimoGpoResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 500, 30));

        jXDatePickerFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jXDatePickerFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jXDatePickerFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 30));

        jXDatePickerFechaAcualizacion.setBackground(new java.awt.Color(191, 185, 185));
        jXDatePickerFechaAcualizacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jXDatePickerFechaAcualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 160, 30));

        jLabel1InfoDeLosTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1InfoDeLosTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1InfoDeLosTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1InfoDeLosTicket.setText("Ticket nro: ");
        getContentPane().add(jLabel1InfoDeLosTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jButton1Buscar.setBackground(new java.awt.Color(191, 185, 185));
        jButton1Buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1Buscar.setText("Buscar");
        jButton1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarActionPerformed(evt);
            }
        });
        jButton1Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1BuscarKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 120, 40));

        jTextFieldNroLegajo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jTextFieldNroLegajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfReporteActionPerformed
        // TODO add your handling code here:
        Caso_de_uso_05 a = new Caso_de_uso_05();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConfReporteActionPerformed

    private void jButtonVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerDetalleActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButtonVerDetalleActionPerformed

    private void jButton1BuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1BuscarKeyPressed
                
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButton1Buscar.doClick();
        } 
    }//GEN-LAST:event_jButton1BuscarKeyPressed

    private void jButton1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1BuscarActionPerformed

    private void jComboBox1EstadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1EstadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1EstadoActualActionPerformed

    private void jTextField1NroTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1NroTicketKeyTyped
               
       
       char ticket=evt.getKeyChar();       
       
       if(ticket<'0' || ticket>'9'){
           evt.consume();
       }
       
       //si presiona enter busca lo tickes
       if(ticket == KeyEvent.VK_ENTER){
                
                jButton1Buscar.requestFocus();
                jButton1Buscar.doClick();
       } 
    }//GEN-LAST:event_jTextField1NroTicketKeyTyped

    private void jTextFieldLegajo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegajo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegajo2ActionPerformed

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
            java.util.logging.Logger.getLogger(Caso_de_uso_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfReporte;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonVerDetalle;
    private javax.swing.JComboBox<String> jComboBox1ClasificacionActual;
    private javax.swing.JComboBox<String> jComboBox1EstadoActual;
    private javax.swing.JComboBox<String> jComboBox1UltimoGpoResolucion;
    private javax.swing.JLabel jLabel1InfoDeLosTicket;
    private javax.swing.JLabel jLabel1NroTicket;
    private javax.swing.JLabel jLabel1Uno;
    private javax.swing.JLabel jLabel2NroLegajo;
    private javax.swing.JLabel jLabel3ClasificacionActual;
    private javax.swing.JLabel jLabel4EstadoActual;
    private javax.swing.JLabel jLabel5FechaApertura;
    private javax.swing.JLabel jLabel6FechaActualizacionEstado;
    private javax.swing.JLabel jLabel7UltimoGpoResolucion;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelClasificacionActual;
    private javax.swing.JLabel jLabelDE;
    private javax.swing.JLabel jLabelEstadoActual;
    private javax.swing.JLabel jLabelFechaApertura;
    private javax.swing.JLabel jLabelFechaUltimoCambioEstado;
    private javax.swing.JLabel jLabelGpoResolucionActual;
    private javax.swing.JLabel jLabelHoraApertura;
    private javax.swing.JLabel jLabelInfoDeCadaTicket;
    private javax.swing.JLabel jLabelNroLegajo;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JLabel jLabelOperadorQueAbrioElTicket;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1NroTicket;
    private javax.swing.JTextField jTextFieldClasificacionActual;
    private javax.swing.JTextField jTextFieldEstadoActual;
    private javax.swing.JTextField jTextFieldFechaApertura;
    private javax.swing.JTextField jTextFieldFechaUltimoCambioEstado;
    private javax.swing.JTextField jTextFieldGpoResolucionAsignado;
    private javax.swing.JTextField jTextFieldHoraApertura;
    private javax.swing.JTextField jTextFieldLegajo2;
    private javax.swing.JTextField jTextFieldNroLegajo1;
    private javax.swing.JLabel jTextFieldNroLegajo2;
    private javax.swing.JTextField jTextFieldNroTicket2;
    private javax.swing.JTextField jTextFieldOperadorQueAbrio;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaAcualizacion;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaApertura;
    // End of variables declaration//GEN-END:variables
}
