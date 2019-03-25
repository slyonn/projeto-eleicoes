/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoeleicoes;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author solanje
 */
public class TelaLoginTre extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginTre
     */
    public TelaLoginTre() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        mostrarCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 203, 129));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERMISSÃO DE ACESSO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        codigoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPasswordActionPerformed(evt);
            }
        });
        codigoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoPasswordKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÓDIGO*");

        jLabel3.setText("*Código de 12 digitos que somente o supervisor do Colégio Eleitoral tem acesso.");

        entrarButton.setBackground(new java.awt.Color(0, 204, 102));
        entrarButton.setText("ENTRAR");
        entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        entrarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarButtonKeyPressed(evt);
            }
        });

        voltarButton.setBackground(new java.awt.Color(0, 153, 255));
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        mostrarCheckBox.setText("Mostrar código");
        mostrarCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codigoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entrarButton))
                            .addComponent(mostrarCheckBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codigoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(mostrarCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarButton)
                    .addComponent(voltarButton))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPasswordActionPerformed
        
    }//GEN-LAST:event_codigoPasswordActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
       String codigo = String.valueOf(codigoPassword.getPassword());
       if (codigo.equals("123456789123")){
           new TelaRelatorioVotacao().setVisible(true);
           codigoPassword.setText("");
       } else {
           JOptionPane.showMessageDialog(null, "Código incorreto.");
       }
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void mostrarCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCheckBoxActionPerformed
        boolean mostrar = mostrarCheckBox.isSelected();
        if (mostrar == true){
            codigoPassword.setEchoChar('\u0000');
        } else {
            codigoPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarCheckBoxActionPerformed

    private void entrarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String codigo = String.valueOf(codigoPassword.getPassword());
            if (codigo.equals("123456789123")){
                new TelaRelatorioVotacao().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Código incorreto.");
            }
        }
    }//GEN-LAST:event_entrarButtonKeyPressed

    private void codigoPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            entrarButton.requestFocus();
        }
    }//GEN-LAST:event_codigoPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLoginTre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginTre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginTre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginTre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginTre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField codigoPassword;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox mostrarCheckBox;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
