package projetoeleicoes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class InterfaceEleicoes extends javax.swing.JFrame {

    public InterfaceEleicoes() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // NÃO PARAR A EXECUÇÃO COM CLICAR EM FECHAR
        setResizable(false); // NÃO ALTERAR O TAMANHO DA TELA
        
        // PROCESSO PARA ARQUIVAÇÃO E LEITURA DOS DADOS
        arquivoEleitor();
        arquivoSecao();
        arquivoPresidente();
        arquivoGovernador();
    }
    
    public void arquivoEleitor(){
        if (BancoDeDados.lerArquivoEleitor() == null){
            EleitorGerenciador.addCriarEleitor();
            BancoDeDados.salvarEleitor(EleitorGerenciador.listaEleitores);
            System.out.println("criar");
        } else {
            EleitorGerenciador.listaEleitores = BancoDeDados.lerArquivoEleitor();
            System.out.println("salvar");
        }
    }
    
    public void arquivoSecao(){
        if (BancoDeDados.lerArquivoSecao() == null){
            SecaoGerenciador.addCriarSecao();
            BancoDeDados.salvarSecao(SecaoGerenciador.listaSecoes);
            System.out.println("criar");
        } else {
            SecaoGerenciador.listaSecoes = BancoDeDados.lerArquivoSecao();
            System.out.println("salvar");
        }
    }
    
    public void arquivoPresidente(){
        if (BancoDeDados.lerArquivoPresidente() == null){
            CandidatosGerenciador.addCandidatosPresidentes();
            BancoDeDados.salvarPresidente(CandidatosGerenciador.listaDePresidentes);
            System.out.println("criar");
        } else {
            CandidatosGerenciador.listaDePresidentes = BancoDeDados.lerArquivoPresidente();
            System.out.println("salvar");
        }
    }
    
    public void arquivoGovernador(){
        if (BancoDeDados.lerArquivoGovernador() == null){
            CandidatosGerenciador.addCandidatosGovernadores();
            BancoDeDados.salvarGovernador(CandidatosGerenciador.listaDeGovernadores);
            System.out.println("criar");
        } else {
            CandidatosGerenciador.listaDeGovernadores = BancoDeDados.lerArquivoGovernador();
            System.out.println("salvar");
        }
    }

    public boolean calcularHoraEncerrar() {
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        if (calendar.get(Calendar.HOUR_OF_DAY) < 13) {
            return false;
        }
        return true;
    }

    public boolean calcularHoraIniciar() {
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        if (calendar.get(Calendar.HOUR_OF_DAY) < 8) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSecao = new javax.swing.JButton();
        buttonTre = new javax.swing.JButton();
        encerrarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        programaMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        secoesMenu = new javax.swing.JMenu();
        listaSecoesMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("telaPrincipal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 203, 129));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoeleicoes/Sem título-1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonSecao.setBackground(new java.awt.Color(22, 203, 129));
        buttonSecao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buttonSecao.setForeground(new java.awt.Color(255, 255, 255));
        buttonSecao.setText("TERMINAIS");
        buttonSecao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSecaoActionPerformed(evt);
            }
        });

        buttonTre.setBackground(new java.awt.Color(22, 203, 129));
        buttonTre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buttonTre.setForeground(new java.awt.Color(255, 255, 255));
        buttonTre.setText("TRE");
        buttonTre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTreActionPerformed(evt);
            }
        });

        encerrarButton.setBackground(new java.awt.Color(204, 0, 0));
        encerrarButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        encerrarButton.setForeground(new java.awt.Color(255, 255, 255));
        encerrarButton.setText("ENCERRAR");
        encerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(buttonSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(buttonTre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(encerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        programaMenu.setText("Programa");
        programaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        programaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programaMenuActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Instruções");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        programaMenu.add(jMenuItem2);

        jMenuBar1.add(programaMenu);

        secoesMenu.setText("Seções");
        secoesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        listaSecoesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        listaSecoesMenuItem.setText("Lista de seções");
        listaSecoesMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaSecoesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSecoesMenuItemActionPerformed(evt);
            }
        });
        secoesMenu.add(listaSecoesMenuItem);

        jMenuBar1.add(secoesMenu);

        jMenu1.setText("Votação");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Encerrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void buttonSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSecaoActionPerformed
        // ABRIR TELA DO TERMINAL
        new TerminalTela().setVisible(true); 
    }//GEN-LAST:event_buttonSecaoActionPerformed

    private void buttonTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTreActionPerformed
        // ABRIR TELA PARA LOGIN ANTES DE VER O RELATÓRIO DA SEÇÃO
        new TelaLoginTre().setVisible(true);
    }//GEN-LAST:event_buttonTreActionPerformed

    private void encerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarButtonActionPerformed
        // TER CERTEZA DE QUE O USÁRIO QUER SAIR DO PROGRAMA
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja, realmente, parar a execução do programa?");
        if (opcao == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_encerrarButtonActionPerformed

    private void listaSecoesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSecoesMenuItemActionPerformed
        new TelaListaSecoes().setVisible(true);
    }//GEN-LAST:event_listaSecoesMenuItemActionPerformed

    private void programaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programaMenuActionPerformed
        // aparecer tela com instruções
    }//GEN-LAST:event_programaMenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaInstrucoes().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new TelaLoginEncerrarVotacao().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceEleicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEleicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEleicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEleicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEleicoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSecao;
    private javax.swing.JButton buttonTre;
    private javax.swing.JButton encerrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem listaSecoesMenuItem;
    private javax.swing.JMenu programaMenu;
    private javax.swing.JMenu secoesMenu;
    // End of variables declaration//GEN-END:variables
}
