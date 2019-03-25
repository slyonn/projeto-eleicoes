package projetoeleicoes;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TerminalTela extends javax.swing.JFrame {



    public TerminalTela() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        terminalLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtTituloEleitor = new javax.swing.JTextField();
        btnConfirmarTitulo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        secaoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 203, 129));
        jPanel2.setPreferredSize(new java.awt.Dimension(1281, 326));

        terminalLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        terminalLabel.setForeground(new java.awt.Color(255, 255, 255));
        terminalLabel.setText("TERMINAL");
        terminalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terminalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        terminalLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                terminalLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminalLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(terminalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nº DO TÍTULO DE ELEITOR");

        jtxtTituloEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloEleitorActionPerformed(evt);
            }
        });
        jtxtTituloEleitor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtTituloEleitorKeyPressed(evt);
            }
        });

        btnConfirmarTitulo.setBackground(new java.awt.Color(0, 153, 102));
        btnConfirmarTitulo.setText("CONFIRMAR");
        btnConfirmarTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarTituloActionPerformed(evt);
            }
        });
        btnConfirmarTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarTituloKeyPressed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 153, 204));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        secaoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secaoTextActionPerformed(evt);
            }
        });
        secaoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                secaoTextKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INFORME O Nº DA SEÇÃO");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtxtTituloEleitor)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConfirmarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(secaoText))
                        .addGap(481, 481, 481))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnConfirmarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtTituloEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTituloEleitorActionPerformed

    }//GEN-LAST:event_jtxtTituloEleitorActionPerformed

    private void btnConfirmarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTituloActionPerformed
        String secao = secaoText.getText();
        String nTitulo = jtxtTituloEleitor.getText();
        boolean checarNumeroEleitor = EleitorGerenciador.checarNumeroEleitor(nTitulo);
        boolean checarSecaoEleitor = EleitorGerenciador.checarSecaoEleitor(nTitulo, secao);
        boolean checarVoto = EleitorGerenciador.checarVoto(nTitulo);
        boolean checarJustificar = EleitorGerenciador.checarJustificar(nTitulo);
        boolean checarSecaoSecao = SecaoGerenciador.checarSecao(secao);
        boolean checarDisponibilidadeSecao = SecaoGerenciador.checarDisponibilidadeSecao(secao);

        if (checarSecaoSecao == false) {
            JOptionPane.showMessageDialog(null, "Secão inexistente. Corrija o número.");
            secaoText.requestFocus();
        } else if (checarNumeroEleitor == false) {
            JOptionPane.showMessageDialog(null, "Número de eleitor inválido.");
            jtxtTituloEleitor.requestFocus();
        } else if (checarSecaoEleitor == false) {
            int opcao = JOptionPane.showConfirmDialog(null, "O eleitor não pertecence a esta seção. Deseja justificar o voto?");
            if (opcao == 0) {
                EleitorGerenciador.pesquisarEleitor(nTitulo).setJustificar(true);
                System.out.println(EleitorGerenciador.pesquisarEleitor(nTitulo).isJustificar());
            }
        } else if (checarJustificar == false) {
            JOptionPane.showMessageDialog(null, "Este eleitor já justificou o voto.");
        } else if (checarVoto == false) {
            JOptionPane.showMessageDialog(null, "Este eleitor já votou.");
        } else if (checarDisponibilidadeSecao == false){
            JOptionPane.showMessageDialog(null, "Votação encerrada nesta seção.");
        } else {
            EleitorGerenciador.pesquisarEleitor(nTitulo).setVoto(true);
            new TelaVotacaoPresidente().setVisible(true);
        }
        BancoDeDados.salvarEleitor(EleitorGerenciador.listaEleitores);   
    }//GEN-LAST:event_btnConfirmarTituloActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void terminalLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_terminalLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_terminalLabelAncestorAdded

    private void jtxtTituloEleitorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTituloEleitorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirmarTitulo.requestFocus();
        }
    }//GEN-LAST:event_jtxtTituloEleitorKeyPressed

    private void btnConfirmarTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarTituloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String secao = secaoText.getText();
            String nTitulo = jtxtTituloEleitor.getText();
            boolean checarNumeroEleitor = EleitorGerenciador.checarNumeroEleitor(nTitulo);
            boolean checarSecaoEleitor = EleitorGerenciador.checarSecaoEleitor(nTitulo, secao);
            boolean checarVoto = EleitorGerenciador.checarVoto(nTitulo);
            boolean checarJustificar = EleitorGerenciador.checarJustificar(nTitulo);
            boolean checarSecaoSecao = SecaoGerenciador.checarSecao(secao);

            if (checarSecaoSecao == false) {
                JOptionPane.showMessageDialog(null, "Secão inexistente. Corrija o número.");
                secaoText.requestFocus();
            } else if (checarNumeroEleitor == false) {
                JOptionPane.showMessageDialog(null, "Número de eleitor inválido.");
                jtxtTituloEleitor.requestFocus();
            } else if (checarSecaoEleitor == false) {
                int opcao = JOptionPane.showConfirmDialog(null, "O eleitor não pertecence a esta seção. Deseja justificar o voto?");
                if (opcao == 0) {
                    EleitorGerenciador.pesquisarEleitor(nTitulo).setJustificar(true);
                    System.out.println(EleitorGerenciador.pesquisarEleitor(nTitulo).isJustificar());
                }
            } else if (checarJustificar == false) {
                JOptionPane.showMessageDialog(null, "Este eleitor já justificou o voto.");
            } else if (checarVoto == false) {
                JOptionPane.showMessageDialog(null, "Este eleitor já votou.");
            } else {
                new TelaVotacaoPresidente().setVisible(true);
            }
        }
        BancoDeDados.salvarEleitor(EleitorGerenciador.listaEleitores);
    }//GEN-LAST:event_btnConfirmarTituloKeyPressed

    private void secaoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secaoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secaoTextActionPerformed

    private void secaoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secaoTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtxtTituloEleitor.requestFocus();
        }
    }//GEN-LAST:event_secaoTextKeyPressed

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
            java.util.logging.Logger.getLogger(TerminalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminalTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarTitulo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtxtTituloEleitor;
    private javax.swing.JTextField secaoText;
    private javax.swing.JLabel terminalLabel;
    // End of variables declaration//GEN-END:variables
}
