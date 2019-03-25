package projetoeleicoes;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaLoginEncerrarVotacao extends javax.swing.JFrame {

    public TelaLoginEncerrarVotacao() {
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
        encerrarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        mostrarCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        secaoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 203, 129));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENCERRAMENTO DA VOTAÇÃO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
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
        jLabel2.setText("CÓDIGO");

        encerrarButton.setBackground(new java.awt.Color(0, 204, 102));
        encerrarButton.setText("ENCERRAR");
        encerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarButtonActionPerformed(evt);
            }
        });
        encerrarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encerrarButtonKeyPressed(evt);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("SEÇÃO");

        secaoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secaoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(codigoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(encerrarButton))
                    .addComponent(mostrarCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(secaoText))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encerrarButton)
                    .addComponent(voltarButton))
                .addGap(46, 46, 46))
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

    private void codigoPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            encerrarButton.requestFocus();
        }
    }//GEN-LAST:event_codigoPasswordKeyPressed

    private void encerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarButtonActionPerformed
        String secao = secaoText.getText();
        String codigo = String.valueOf(codigoPassword.getPassword());

        if (codigo.equals("999999999") & SecaoGerenciador.checarSecaoSecao(secao) != null) {
            Secao disponibilidade = SecaoGerenciador.checarSecaoSecao(secao);
            disponibilidade.setDisponível(false);
            JOptionPane.showMessageDialog(null, "Votação na seção " + secaoText.getText() + " encerrada.");
            codigoPassword.setText("");
            secaoText.setText("");
            SecaoGerenciador.listaSecoes = BancoDeDados.lerArquivoSecao();
            BancoDeDados.salvarSecao(SecaoGerenciador.listaSecoes);
        } else {
            JOptionPane.showMessageDialog(null, "Código ou nº da seção incorretos.");
        }
    }//GEN-LAST:event_encerrarButtonActionPerformed

    private void encerrarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encerrarButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String secao = secaoText.getText();
            String codigo = String.valueOf(codigoPassword.getPassword());

            if (codigo.equals("999999999") & SecaoGerenciador.checarSecaoSecao(secao) != null) {
                Secao disponibilidade = SecaoGerenciador.checarSecaoSecao(secao);
                disponibilidade.setDisponível(false);
                JOptionPane.showMessageDialog(null, "Votação na seção " + secaoText.getText() + " encerrada.");
                codigoPassword.setText("");
                secaoText.setText("");
                SecaoGerenciador.listaSecoes = BancoDeDados.lerArquivoSecao();
                BancoDeDados.salvarSecao(SecaoGerenciador.listaSecoes);
            } else {
                JOptionPane.showMessageDialog(null, "Código ou nº da seção incorretos.");
            }
        }
    }//GEN-LAST:event_encerrarButtonKeyPressed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void mostrarCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCheckBoxActionPerformed
        boolean mostrar = mostrarCheckBox.isSelected();
        if (mostrar == true) {
            codigoPassword.setEchoChar('\u0000');
        } else {
            codigoPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarCheckBoxActionPerformed

    private void secaoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secaoTextActionPerformed
        
    }//GEN-LAST:event_secaoTextActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginEncerrarVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEncerrarVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEncerrarVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginEncerrarVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginEncerrarVotacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField codigoPassword;
    private javax.swing.JButton encerrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox mostrarCheckBox;
    private javax.swing.JTextField secaoText;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
