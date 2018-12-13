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
public class Caso_de_uso_22 extends javax.swing.JFrame {

    /**
     * Creates new form CasoDeUso22
     */
    public Caso_de_uso_22() {
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

        jLabelOpcionesOrdenamiento = new javax.swing.JLabel();
        jLabelFiltros = new javax.swing.JLabel();
        jLabelOrdenado = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jLabelVisualizando = new javax.swing.JLabel();
        jLabelUNO = new javax.swing.JLabel();
        jLabelDe = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescrip = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelCantTicket = new javax.swing.JLabel();
        jLabelConstante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2DE = new javax.swing.JLabel();
        jLabel2ConstanteC = new javax.swing.JLabel();
        jButton1Anterior = new javax.swing.JButton();
        jButton1Siguiente = new javax.swing.JButton();
        jLabelNroTicket = new javax.swing.JLabel();
        jLabelClasificacionTicket = new javax.swing.JLabel();
        jLabelFechaApertura = new javax.swing.JLabel();
        jLabelTiempoTotalAtencion = new javax.swing.JLabel();
        jLabelUltimoGrupoResol = new javax.swing.JLabel();
        jLabelNroLegajo = new javax.swing.JLabel();
        jButtonImprimir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPaneFiltrosUtilizados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPaneOrdenDefecto = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPaneNuevoOrden = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabelInfoDelEstado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelInfoDelTicketAsociadaAlEstado = new javax.swing.JLabel();
        jTextFieldTicket = new javax.swing.JTextField();
        jTextFieldFechaApertura = new javax.swing.JTextField();
        jTextFieldTiempoTotalAtencion = new javax.swing.JTextField();
        jTextFieldUltimoGPOResolucion = new javax.swing.JTextField();
        jTextFieldLegajo = new javax.swing.JTextField();
        jTextFieldClasificacionActual = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información por estado actual del ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOpcionesOrdenamiento.setBackground(new java.awt.Color(191, 185, 185));
        jLabelOpcionesOrdenamiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOpcionesOrdenamiento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOpcionesOrdenamiento.setText("Opciones de ordenamiento");
        getContentPane().add(jLabelOpcionesOrdenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabelFiltros.setBackground(new java.awt.Color(191, 185, 185));
        jLabelFiltros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFiltros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFiltros.setText("Filtros utilizados");
        getContentPane().add(jLabelFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jLabelOrdenado.setBackground(new java.awt.Color(191, 185, 185));
        jLabelOrdenado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOrdenado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrdenado.setText("Ordenado");
        getContentPane().add(jLabelOrdenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(191, 185, 185));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 270, 30));

        jButtonAtras.setBackground(new java.awt.Color(191, 185, 185));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAtras.setText("Anterior");
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabelVisualizando.setBackground(new java.awt.Color(191, 185, 185));
        jLabelVisualizando.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVisualizando.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVisualizando.setText("Visualizando");
        getContentPane().add(jLabelVisualizando, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, 30));

        jLabelUNO.setBackground(new java.awt.Color(191, 185, 185));
        jLabelUNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUNO.setForeground(new java.awt.Color(51, 153, 255));
        jLabelUNO.setText("1");
        getContentPane().add(jLabelUNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 30, 30));

        jLabelDe.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDe.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDe.setText("de");
        getContentPane().add(jLabelDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 30, 50));

        jLabelX.setBackground(new java.awt.Color(191, 185, 185));
        jLabelX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelX.setForeground(new java.awt.Color(51, 153, 255));
        jLabelX.setText("X");
        getContentPane().add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 20, 50));

        jButtonSiguiente.setBackground(new java.awt.Color(191, 185, 185));
        jButtonSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1060, 10));

        jLabelDescrip.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDescrip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescrip.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescrip.setText("Descripción del estado");
        getContentPane().add(jLabelDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(191, 185, 185));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 560, 100));

        jLabelCantTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelCantTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCantTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantTicket.setText("Total ticket ");
        getContentPane().add(jLabelCantTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabelConstante.setBackground(new java.awt.Color(191, 185, 185));
        jLabelConstante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelConstante.setForeground(new java.awt.Color(51, 153, 255));
        jLabelConstante.setText("C");
        getContentPane().add(jLabelConstante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 20, 40));

        jLabel1.setBackground(new java.awt.Color(191, 185, 185));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 20, 40));

        jLabel2DE.setBackground(new java.awt.Color(191, 185, 185));
        jLabel2DE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2DE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2DE.setText("de");
        getContentPane().add(jLabel2DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, 40));

        jLabel2ConstanteC.setBackground(new java.awt.Color(191, 185, 185));
        jLabel2ConstanteC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2ConstanteC.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2ConstanteC.setText("C");
        getContentPane().add(jLabel2ConstanteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, 40));

        jButton1Anterior.setBackground(new java.awt.Color(191, 185, 185));
        jButton1Anterior.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1Anterior.setText("Anterior");
        getContentPane().add(jButton1Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        jButton1Siguiente.setBackground(new java.awt.Color(191, 185, 185));
        jButton1Siguiente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1Siguiente.setText("Siguiente");
        getContentPane().add(jButton1Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        jLabelNroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroTicket.setText("Nro. Ticket");
        getContentPane().add(jLabelNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabelClasificacionTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabelClasificacionTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClasificacionTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClasificacionTicket.setText("Clasificación actual del ticket");
        getContentPane().add(jLabelClasificacionTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        jLabelFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jLabelFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaApertura.setText("Fecha de apertura");
        getContentPane().add(jLabelFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabelTiempoTotalAtencion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTiempoTotalAtencion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTiempoTotalAtencion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTiempoTotalAtencion.setText("Tiempo total de atención");
        getContentPane().add(jLabelTiempoTotalAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLabelUltimoGrupoResol.setBackground(new java.awt.Color(191, 185, 185));
        jLabelUltimoGrupoResol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUltimoGrupoResol.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUltimoGrupoResol.setText("Último grupo de resolución");
        getContentPane().add(jLabelUltimoGrupoResol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabelNroLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroLegajo.setText("Nro. Legajo");
        getContentPane().add(jLabelNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        jButtonImprimir.setBackground(new java.awt.Color(191, 185, 185));
        jButtonImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonImprimir.setText("Imprimir");
        getContentPane().add(jButtonImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, 120, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("<>");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 70, 40));

        jButtonCancelar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 120, 40));

        jTable1.setBackground(new java.awt.Color(191, 185, 185));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Filtro", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(160, 151));
        jTable1.setRowHeight(23);
        jScrollPaneFiltrosUtilizados.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPaneFiltrosUtilizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 50));

        jTable2.setBackground(new java.awt.Color(191, 185, 185));
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nro. Ticket"},
                {"Clasificación actual del ticket"},
                {"Fecha apertura"},
                {"Último grupo de resolución"},
                {"Tiempo total de atención"}
            },
            new String [] {
                "Orden por defecto"
            }
        ));
        jTable2.setPreferredSize(new java.awt.Dimension(75, 102));
        jTable2.setRowHeight(17);
        jScrollPaneOrdenDefecto.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPaneOrdenDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 240, 130));

        jTable3.setBackground(new java.awt.Color(191, 185, 185));
        jTable3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 - NULL"},
                {"2 - NULL"},
                {"3 - NULL"},
                {"4 - NULL"},
                {"5 - NULL"}
            },
            new String [] {
                "Nuevo ordenamiento"
            }
        ));
        jTable3.setPreferredSize(new java.awt.Dimension(75, 102));
        jTable3.setRequestFocusEnabled(false);
        jScrollPaneNuevoOrden.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPaneNuevoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 240, 130));

        jLabelInfoDelEstado.setBackground(new java.awt.Color(191, 185, 185));
        jLabelInfoDelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInfoDelEstado.setForeground(new java.awt.Color(246, 58, 58));
        jLabelInfoDelEstado.setText("Información asociada al estado:");
        getContentPane().add(jLabelInfoDelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1060, -1));

        jLabelInfoDelTicketAsociadaAlEstado.setBackground(new java.awt.Color(191, 185, 185));
        jLabelInfoDelTicketAsociadaAlEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInfoDelTicketAsociadaAlEstado.setForeground(new java.awt.Color(246, 58, 58));
        jLabelInfoDelTicketAsociadaAlEstado.setText("Información del ticket asociado al estado:");
        getContentPane().add(jLabelInfoDelTicketAsociadaAlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jTextFieldTicket.setEditable(false);
        jTextFieldTicket.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 270, -1));

        jTextFieldFechaApertura.setEditable(false);
        jTextFieldFechaApertura.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 270, -1));

        jTextFieldTiempoTotalAtencion.setEditable(false);
        jTextFieldTiempoTotalAtencion.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTiempoTotalAtencion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldTiempoTotalAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 200, -1));

        jTextFieldUltimoGPOResolucion.setEditable(false);
        jTextFieldUltimoGPOResolucion.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldUltimoGPOResolucion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldUltimoGPOResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 200, -1));

        jTextFieldLegajo.setEditable(false);
        jTextFieldLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldLegajo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 280, -1));

        jTextFieldClasificacionActual.setEditable(false);
        jTextFieldClasificacionActual.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldClasificacionActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldClasificacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 280, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Caso_de_uso_22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_de_uso_22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_de_uso_22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Anterior;
    private javax.swing.JButton jButton1Siguiente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2ConstanteC;
    private javax.swing.JLabel jLabel2DE;
    private javax.swing.JLabel jLabelCantTicket;
    private javax.swing.JLabel jLabelClasificacionTicket;
    private javax.swing.JLabel jLabelConstante;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelFechaApertura;
    private javax.swing.JLabel jLabelFiltros;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelInfoDelEstado;
    private javax.swing.JLabel jLabelInfoDelTicketAsociadaAlEstado;
    private javax.swing.JLabel jLabelNroLegajo;
    private javax.swing.JLabel jLabelNroTicket;
    private javax.swing.JLabel jLabelOpcionesOrdenamiento;
    private javax.swing.JLabel jLabelOrdenado;
    private javax.swing.JLabel jLabelTiempoTotalAtencion;
    private javax.swing.JLabel jLabelUNO;
    private javax.swing.JLabel jLabelUltimoGrupoResol;
    private javax.swing.JLabel jLabelVisualizando;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneFiltrosUtilizados;
    private javax.swing.JScrollPane jScrollPaneNuevoOrden;
    private javax.swing.JScrollPane jScrollPaneOrdenDefecto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldClasificacionActual;
    private javax.swing.JTextField jTextFieldFechaApertura;
    private javax.swing.JTextField jTextFieldLegajo;
    private javax.swing.JTextField jTextFieldTicket;
    private javax.swing.JTextField jTextFieldTiempoTotalAtencion;
    private javax.swing.JTextField jTextFieldUltimoGPOResolucion;
    // End of variables declaration//GEN-END:variables
}
