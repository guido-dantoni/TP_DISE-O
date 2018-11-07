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
public class PantallaInicioTP extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicioTP
     */
    public PantallaInicioTP() {
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

        MesaDeAyuda = new javax.swing.JButton();
        GrupoDeResolucion = new javax.swing.JButton();
        Gerencia = new javax.swing.JButton();
        jLabelLlamita = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabelTituloSecundario = new javax.swing.JLabel();
        LabelFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MesaDeAyuda.setBackground(new java.awt.Color(0, 51, 204));
        MesaDeAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MesaDeAyuda.setForeground(new java.awt.Color(191, 185, 185));
        MesaDeAyuda.setText("MESA DE AYUDA");
        MesaDeAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaDeAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(MesaDeAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 210, 70));

        GrupoDeResolucion.setBackground(new java.awt.Color(0, 51, 204));
        GrupoDeResolucion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GrupoDeResolucion.setForeground(new java.awt.Color(191, 185, 185));
        GrupoDeResolucion.setText("GRUPO DE RESOLUCIÓN");
        getContentPane().add(GrupoDeResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 210, 70));

        Gerencia.setBackground(new java.awt.Color(0, 51, 204));
        Gerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gerencia.setForeground(new java.awt.Color(191, 185, 185));
        Gerencia.setText("GERENCIA");
        getContentPane().add(Gerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 210, 70));

        jLabelLlamita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Llamita2.png"))); // NOI18N
        getContentPane().add(jLabelLlamita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 420));

        jLabelTitulo2.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTitulo2.setFont(new java.awt.Font("MS PGothic", 0, 85)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTitulo2.setText("La llamita");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 350, 110));

        jLabelTituloSecundario.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTituloSecundario.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelTituloSecundario.setForeground(new java.awt.Color(45, 93, 165));
        jLabelTituloSecundario.setText("gas natural");
        getContentPane().add(jLabelTituloSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        LabelFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoNuevo.jpg"))); // NOI18N
        getContentPane().add(LabelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1350, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MesaDeAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaDeAyudaActionPerformed
               
       Login log= new Login();
       log.setTipoUsuario("Mesa de Ayuda");
    }//GEN-LAST:event_MesaDeAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gerencia;
    private javax.swing.JButton GrupoDeResolucion;
    private javax.swing.JLabel LabelFondoPantalla;
    private javax.swing.JButton MesaDeAyuda;
    private javax.swing.JLabel jLabelLlamita;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTituloSecundario;
    // End of variables declaration//GEN-END:variables
}
