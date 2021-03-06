
package Ventanas;


import Dao.EmpleadoDao;
import clases.Empleado;;
import clases.Historialclasificacion;
import clases.Historialticket;
import clases.Intervencion;
import clases.Ticket;
import clases.TicketDTO;
import controllers.Enum_EstadoTicket;
import controllers.GestorEmpleado;
import controllers.GestorTicket;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class VerDetalleTicket extends javax.swing.JFrame {

        private Ticket ticket;
        private List<Historialticket> historialesTickets = new ArrayList<>();
        private Caso_de_uso_02 casoUso2;
                
        public VerDetalleTicket() {
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

        jLabelInformacionDelUsuarioQueReclamo = new javax.swing.JLabel();
        jLabelNroLegajo = new javax.swing.JLabel();
        jLabelApellidoyNombre = new javax.swing.JLabel();
        jLabelTelefonoInterno = new javax.swing.JLabel();
        jLabelTelefonoDirecto = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelDescripcionDelCargo = new javax.swing.JLabel();
        jLabelInformacionHistoricoReclamo = new javax.swing.JLabel();
        jTextFieldNroLegajo = new javax.swing.JTextField();
        jTextFieldTelefonoInterno = new javax.swing.JTextField();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jTextFieldApeYNombre = new javax.swing.JTextField();
        jTextFieldTelefonoDirecto = new javax.swing.JTextField();
        jTextFieldDescrpDelCargo = new javax.swing.JTextField();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPaneObservaciones = new javax.swing.JScrollPane();
        jTextAreaObservacion = new javax.swing.JTextArea();
        jButtonVolver = new javax.swing.JButton();
        jButton1CerrarTicket = new javax.swing.JButton();
        jButton1DerivarTicket = new javax.swing.JButton();
        jLabel2NroTicket = new javax.swing.JLabel();
        jTextField1NroTicketPorPantalla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalle del ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInformacionDelUsuarioQueReclamo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelInformacionDelUsuarioQueReclamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInformacionDelUsuarioQueReclamo.setForeground(new java.awt.Color(246, 58, 58));
        jLabelInformacionDelUsuarioQueReclamo.setText("Información del usuario que realizó el reclamo: ");
        getContentPane().add(jLabelInformacionDelUsuarioQueReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabelNroLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNroLegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNroLegajo.setText("Nro. legajo");
        getContentPane().add(jLabelNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabelApellidoyNombre.setBackground(new java.awt.Color(191, 185, 185));
        jLabelApellidoyNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelApellidoyNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellidoyNombre.setText("Apellido y Nombre");
        getContentPane().add(jLabelApellidoyNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabelTelefonoInterno.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTelefonoInterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefonoInterno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefonoInterno.setText("Teléfono interno");
        getContentPane().add(jLabelTelefonoInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabelTelefonoDirecto.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTelefonoDirecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefonoDirecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefonoDirecto.setText("Teléfono directo");
        getContentPane().add(jLabelTelefonoDirecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabelUbicacion.setBackground(new java.awt.Color(191, 185, 185));
        jLabelUbicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUbicacion.setText("Ubicación");
        getContentPane().add(jLabelUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabelDescripcionDelCargo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelDescripcionDelCargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescripcionDelCargo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcionDelCargo.setText("Descripción del cargo");
        getContentPane().add(jLabelDescripcionDelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabelInformacionHistoricoReclamo.setBackground(new java.awt.Color(191, 185, 185));
        jLabelInformacionHistoricoReclamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInformacionHistoricoReclamo.setForeground(new java.awt.Color(246, 58, 58));
        jLabelInformacionHistoricoReclamo.setText("Información del histórico del reclamo:");
        getContentPane().add(jLabelInformacionHistoricoReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextFieldNroLegajo.setEditable(false);
        jTextFieldNroLegajo.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldNroLegajo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldNroLegajo.setFocusable(false);
        getContentPane().add(jTextFieldNroLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, -1));

        jTextFieldTelefonoInterno.setEditable(false);
        jTextFieldTelefonoInterno.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTelefonoInterno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTelefonoInterno.setFocusable(false);
        getContentPane().add(jTextFieldTelefonoInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, -1));

        jTextFieldUbicacion.setEditable(false);
        jTextFieldUbicacion.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldUbicacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldUbicacion.setFocusable(false);
        getContentPane().add(jTextFieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 780, -1));

        jTextFieldApeYNombre.setEditable(false);
        jTextFieldApeYNombre.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldApeYNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldApeYNombre.setFocusable(false);
        getContentPane().add(jTextFieldApeYNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 380, -1));

        jTextFieldTelefonoDirecto.setEditable(false);
        jTextFieldTelefonoDirecto.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldTelefonoDirecto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTelefonoDirecto.setFocusable(false);
        getContentPane().add(jTextFieldTelefonoDirecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 220, -1));

        jTextFieldDescrpDelCargo.setEditable(false);
        jTextFieldDescrpDelCargo.setBackground(new java.awt.Color(191, 185, 185));
        jTextFieldDescrpDelCargo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldDescrpDelCargo.setFocusable(false);
        getContentPane().add(jTextFieldDescrpDelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 330, -1));

        jLabelObservaciones.setBackground(new java.awt.Color(191, 185, 185));
        jLabelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservaciones.setText("Observaciones");
        getContentPane().add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jTextAreaObservacion.setEditable(false);
        jTextAreaObservacion.setBackground(new java.awt.Color(191, 185, 185));
        jTextAreaObservacion.setColumns(20);
        jTextAreaObservacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextAreaObservacion.setRows(5);
        jTextAreaObservacion.setFocusable(false);
        jScrollPaneObservaciones.setViewportView(jTextAreaObservacion);

        getContentPane().add(jScrollPaneObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 800, 100));

        jButtonVolver.setBackground(new java.awt.Color(191, 185, 185));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jButtonVolver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVolverKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 120, 40));

        jButton1CerrarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButton1CerrarTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1CerrarTicket.setText("Cerrar ticket");
        jButton1CerrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CerrarTicketActionPerformed(evt);
            }
        });
        jButton1CerrarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1CerrarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1CerrarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 120, 40));

        jButton1DerivarTicket.setBackground(new java.awt.Color(191, 185, 185));
        jButton1DerivarTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1DerivarTicket.setText("Derivar ticket ");
        jButton1DerivarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DerivarTicketActionPerformed(evt);
            }
        });
        jButton1DerivarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1DerivarTicketKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1DerivarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 120, 40));

        jLabel2NroTicket.setBackground(new java.awt.Color(191, 185, 185));
        jLabel2NroTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2NroTicket.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2NroTicket.setText("Nro. Ticket: ");
        getContentPane().add(jLabel2NroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jTextField1NroTicketPorPantalla.setEditable(false);
        jTextField1NroTicketPorPantalla.setBackground(new java.awt.Color(191, 185, 185));
        jTextField1NroTicketPorPantalla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1NroTicketPorPantalla.setFocusable(false);
        getContentPane().add(jTextField1NroTicketPorPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 240, -1));

        jTable1.setBackground(new java.awt.Color(191, 185, 185));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha cambio de estado", "Hora cambio de estado", "Operador interventor", "Grupo resolución", "Clasificación del ticket", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 950, 140));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
            salir();
      
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButton1DerivarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1DerivarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jButton1DerivarTicket.doClick();
        } 
    }//GEN-LAST:event_jButton1DerivarTicketKeyPressed

    private void jButton1DerivarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DerivarTicketActionPerformed
          if( ticket.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
              ticket.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) ){
          
            Caso_de_uso_04 cu = new Caso_de_uso_04();
            this.setVisible(false);
            cu.setVisible(true);
            cu.derivarTicket(ticket, this, jTextAreaObservacion.getText());
                         
       }else{
           JOptionPane.showMessageDialog(null, "El ticket seleccionado no se puede derivar porque se encuentra " + ticket.getEstadoactual());

       }
    }//GEN-LAST:event_jButton1DerivarTicketActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int row = jTable1.getSelectedRow();
                 
         if(row >= 0){   
                jTextAreaObservacion.setText(historialesTickets.get(row).getObservaciones());
         }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
      
       if(evt.getKeyCode() == KeyEvent.VK_TAB){
            jButton1CerrarTicket.requestFocus();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jButtonVolverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVolverKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonVolver.doClick();
        }
    }//GEN-LAST:event_jButtonVolverKeyPressed

    private void jButton1CerrarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1CerrarTicketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButton1CerrarTicket.doClick();
        }
    }//GEN-LAST:event_jButton1CerrarTicketKeyPressed

    private void jButton1CerrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CerrarTicketActionPerformed
        JOptionPane.showMessageDialog(null, "Caso de uso 3, para ver funcionamiento descomentar");
    /*        
        Caso_de_uso_03 cu3 = new Caso_de_uso_03();
        this.setVisible(false);
        cu3.cargarCampos(ticket,this);
        cu3.setVisible(true);
    */   
    }//GEN-LAST:event_jButton1CerrarTicketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerDetalleTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDetalleTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDetalleTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDetalleTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDetalleTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1CerrarTicket;
    private javax.swing.JButton jButton1DerivarTicket;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel2NroTicket;
    private javax.swing.JLabel jLabelApellidoyNombre;
    private javax.swing.JLabel jLabelDescripcionDelCargo;
    private javax.swing.JLabel jLabelInformacionDelUsuarioQueReclamo;
    private javax.swing.JLabel jLabelInformacionHistoricoReclamo;
    private javax.swing.JLabel jLabelNroLegajo;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelTelefonoDirecto;
    private javax.swing.JLabel jLabelTelefonoInterno;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneObservaciones;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaObservacion;
    private javax.swing.JTextField jTextField1NroTicketPorPantalla;
    private javax.swing.JTextField jTextFieldApeYNombre;
    private javax.swing.JTextField jTextFieldDescrpDelCargo;
    private javax.swing.JTextField jTextFieldNroLegajo;
    private javax.swing.JTextField jTextFieldTelefonoDirecto;
    private javax.swing.JTextField jTextFieldTelefonoInterno;
    private javax.swing.JTextField jTextFieldUbicacion;
    // End of variables declaration//GEN-END:variables

void cargarCampos(TicketDTO ticketDTO) {
            
            EmpleadoDao empleadoDao = new EmpleadoDao();
            GestorEmpleado gestorEmpleado = new GestorEmpleado();
            GestorTicket gestorTicket = new GestorTicket();
            this.ticket= gestorTicket.obtenerTicket(ticketDTO.getNroTicket());
            Empleado empleado = gestorEmpleado.obtenerEmpleado(ticketDTO.getNroLegajoempleado());
            List<Historialticket> historialesT = new ArrayList<>();
            DefaultTableModel modelo =  (DefaultTableModel) jTable1.getModel();
            List<Empleado> listaEmpleadosGrupos = empleadoDao.obtenerGruposEmpleados(); 
            
             //aca cargo los campoes del empleado
            jTextField1NroTicketPorPantalla.setText(String.valueOf(ticketDTO.getNroTicket()));
            jTextFieldNroLegajo.setText(String.valueOf(empleado.getLegajoEmpleado()));
            jTextFieldApeYNombre.setText(empleado.getNombre() + " " + empleado.getApellido());
            jTextFieldTelefonoInterno.setText(String.valueOf(empleado.getTelefonointerno()));
            jTextFieldTelefonoDirecto.setText(String.valueOf(empleado.getTelefonodirecto()));
            jTextFieldDescrpDelCargo.setText(empleado.getDescripcioncargo());
            jTextFieldUbicacion.setText(empleado.getUbicacion());    
            
    if(ticket.getEstadoactual().equals("CERRADO")){
        
        
         historialesT = gestorTicket.obtenerHistorialesTicketCerrados(ticketDTO.getNroTicket());
         this.historialesTickets = historialesT;
         List<Empleado> listaEmpleados = new ArrayList<>(historialesT.get(0).getUsuario().getEmpleados());
        
       for(int i=0; i<historialesT.size(); i++){
           
            modelo.addRow(new Object[6]);//agrega una fila 
           
            jTable1.setValueAt(historialesT.get(i).getFechafin(), i, 0);
            jTable1.setValueAt(historialesT.get(i).getHorafin(), i, 1);
            jTable1.setValueAt(listaEmpleados.get(0).getNombre() + " " + listaEmpleados.get(0).getApellido(), i, 2); 
            jTable1.setValueAt("Mesa de ayuda", i, 3);
            jTable1.setValueAt(ticket.getClasificacion().getNombreclasificacion(), i, 4);                         
            jTable1.setValueAt(historialesT.get(i).getEstado(), i, 5);                  

            }
        
    } else{       
            String operador = null;
                       
            historialesT = gestorTicket.obtenerHistorialesTicket(ticketDTO.getNroTicket());
            this.historialesTickets = historialesT;
            List<Empleado> listaEmpleados = gestorEmpleado.obtenerEmpleados();
                      
             
            int k=0;
            List<Historialclasificacion> listaHC = new ArrayList<>();
            listaHC = gestorTicket.obtenerHistorialesClasificacion(ticketDTO.getNroTicket());
            
            for(int i=0; i<historialesT.size(); i++){
                
                modelo.addRow(new Object[6]); // agrega una fila
                
                List<Intervencion> intervencion = new ArrayList<>(historialesT.get(i).getTicket().getIntervencions()); //Esto me trae siempre una lista de un solo elemento
                if(k==listaHC.size()-1){
                    k=0;
                    listaHC = new ArrayList<>(historialesT.get(1).getTicket().getHistorialclasificacions());
                }
                //Cargo todas las columnas menos la de operador
                jTable1.setValueAt(historialesT.get(i).getFechafin(), i, 0);
                jTable1.setValueAt(historialesT.get(i).getHorafin(), i, 1);
                jTable1.setValueAt(listaHC.get(k).getClasificacion().getNombreclasificacion(), i, 4); 
                 k++;
                
                jTable1.setValueAt(historialesT.get(i).getEstado(), i, 5);
                
                
                //busco el nombre del operador que tenga el legajo usuario de historiales.get(i)
                                
                int j=0;
                Boolean encontrado=false;
                            
                while(!encontrado && j<listaEmpleados.size()){
                    
                    if(historialesT.get(i).getUsuario().getLegajoUsuario() == listaEmpleados.get(j).getUsuario().getLegajoUsuario()){
                        operador =  (listaEmpleados.get(j).getNombre() + " " + listaEmpleados.get(j).getApellido());
                        encontrado = true;
                    }
                    for(int n=0; n<listaEmpleadosGrupos.size(); n++){
                        if(listaEmpleadosGrupos.get(n).getLegajoEmpleado() == listaEmpleados.get(j).getLegajoEmpleado()){
                             jTable1.setValueAt(listaEmpleadosGrupos.get(n).getGruporesolucion().getNombregrupo(), i, 3);
                             break;
                        }
                    }
                    
                    j++;
                }
                   
  
                jTable1.setValueAt(operador, i, 2);
                
            }
 
        }
    }
 
void verDetalles(TicketDTO ticketDto, Caso_de_uso_02 Cu2) {
        this.casoUso2 = Cu2;
        this.cargarCampos(ticketDto);
    }
    
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
            
        this.setVisible(false);
        casoUso2.setVisible(true);
            
       
    }

}
