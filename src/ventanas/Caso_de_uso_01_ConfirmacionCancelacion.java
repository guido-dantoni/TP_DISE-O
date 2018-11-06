package Ventanas;

/**
 *
 * @author Marcos
 */
public class Caso_de_uso_01_ConfirmacionCancelacion extends javax.swing.JFrame {

 
        private Caso_de_uso_01 c;
        public Caso_de_uso_01_ConfirmacionCancelacion(Caso_de_uso_01 cu1) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.c=cu1;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTexto = new javax.swing.JLabel();
        jButtonSi = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTexto.setBackground(new java.awt.Color(191, 185, 185));
        jLabelTexto.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabelTexto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto.setText("¿Está seguro que desea cancelar el registro del ticket?");
        getContentPane().add(jLabelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 40));

        jButtonSi.setBackground(new java.awt.Color(191, 185, 185));
        jButtonSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSi.setText("Si");
        jButtonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, 40));

        jButtonCancelar.setBackground(new java.awt.Color(191, 185, 185));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("No");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 120, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCU1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiActionPerformed
        // TODO add your handling code here:
         PantallaMesaDeAyuda a = new PantallaMesaDeAyuda();
         
         this.setVisible(false);
         c.setVisible(false);
         a.setVisible(true);
        
    }//GEN-LAST:event_jButtonSiActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
                        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSi;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTexto;
    // End of variables declaration//GEN-END:variables

}
