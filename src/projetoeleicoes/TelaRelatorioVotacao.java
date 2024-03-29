/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoeleicoes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author solanje
 */
public class TelaRelatorioVotacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioVotacao
     */
    public TelaRelatorioVotacao() {
        initComponents();
        Urna.addNulosBrancosPresidentes();
        Urna.addNulosBrancosGovernadores();
        Urna.calcularPorcentagemGovernadoresVotados();
        Urna.calcularPorcentagemPresidentesVotados();
        inserirDadosTabelaPresidente();
        inserirDadosTabelaGovernador();
        inserirDadosNuloBrancoGovernadorTabela();
        inserirDadosNuloBrancoPresidenteTabela();
        dadosPresidenteTable.setEnabled(false);
        dadosnNuloBrancoPresidenteTable.setEnabled(false);
        dadosGovernadorTable.setEnabled(false);
        dadosnNuloBrancoGovernadorTable.setEnabled(false);
        inserirDadosNuloBrancoPresidenteTabela();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    public void inserirDadosTabelaPresidente(){
        DefaultTableModel modeloTabelaPresidente = new DefaultTableModel();
        
        modeloTabelaPresidente.addColumn("Nome");
        modeloTabelaPresidente.addColumn("Número");
        modeloTabelaPresidente.addColumn("Votos (absolutos)");
        modeloTabelaPresidente.addColumn("Votos (%)");
        
        Object dados[] = new Object[4];
        List <Candidatos> listaPresidentes = new ArrayList<>();
        listaPresidentes = CandidatosGerenciador.listaDePresidentes;
        
        for (int i = 0; i < CandidatosGerenciador.listaDePresidentes.size(); i++) {
            dados[0] = CandidatosGerenciador.listaDePresidentes.get(i).getNome();
            dados[1] = CandidatosGerenciador.listaDePresidentes.get(i).getNumero();
            dados[2] = CandidatosGerenciador.listaDePresidentes.get(i).getVotos();
            dados[3] = Urna.vetorPorcentagemPresidente[i];
            modeloTabelaPresidente.addRow(dados);
        }
        
        dadosPresidenteTable.setModel(modeloTabelaPresidente);
    }
    
    public void inserirDadosTabelaGovernador(){
        DefaultTableModel modeloTabelaGovernador = new DefaultTableModel();
        
        modeloTabelaGovernador.addColumn("Nome");
        modeloTabelaGovernador.addColumn("Número");
        modeloTabelaGovernador.addColumn("Votos (absolutos)");
        modeloTabelaGovernador.addColumn("Votos (%)");
        
        Object dados[] = new Object[4];
        List <Candidatos> listaPresidentes = new ArrayList<>();
        listaPresidentes = CandidatosGerenciador.listaDeGovernadores;
        
        for (int i = 0; i < CandidatosGerenciador.listaDeGovernadores.size(); i++) {
            dados[0] = CandidatosGerenciador.listaDeGovernadores.get(i).getNome();
            dados[1] = CandidatosGerenciador.listaDeGovernadores.get(i).getNumero();
            dados[2] = CandidatosGerenciador.listaDeGovernadores.get(i).getVotos(); 
            dados[3] = Urna.vetorPorcentagemGovernador[i];
            modeloTabelaGovernador.addRow(dados);
        }
        
        dadosGovernadorTable.setModel(modeloTabelaGovernador);
    }
    
    public void inserirDadosNuloBrancoGovernadorTabela (){
        DefaultTableModel modeloTabelaGovernadorNulo = new DefaultTableModel();
        
        modeloTabelaGovernadorNulo.addColumn("Tipo");
        modeloTabelaGovernadorNulo.addColumn("Quantidade (%)");
        modeloTabelaGovernadorNulo.addColumn("Quantidade (absoluta)");
        
        Object dados[] = new Object[3];
        String nome[] = new String[2];
        
        nome[0] = "Nulo";
        nome[1] = "Branco";
        
        for (int i = 0; i < 2; i++) {
            dados[0] = nome[i];
            dados[2] = Urna.nulosBrancosGovernadores[i];
            dados[1] = (Urna.nulosBrancosGovernadores[i] * 100) / 6;
            modeloTabelaGovernadorNulo.addRow(dados);
        }
        
        dadosnNuloBrancoGovernadorTable.setModel(modeloTabelaGovernadorNulo);
    }
    
    public void inserirDadosNuloBrancoPresidenteTabela (){
        DefaultTableModel modeloTabelaPresidenteNulo = new DefaultTableModel();
        
        modeloTabelaPresidenteNulo.addColumn("Tipo");
        modeloTabelaPresidenteNulo.addColumn("Quantidade (%)");
        modeloTabelaPresidenteNulo.addColumn("Quantidade (absoluta)");
        
        Object dados[] = new Object[3];
        String nome[] = new String[2];
        
        nome[0] = "Nulo";
        nome[1] = "Branco";
        
        for (int i = 0; i < 2; i++) {
            dados[0] = nome[i];
            dados[2] = Urna.nulosBrancosPresidentes[i];
            dados[1] = (Urna.nulosBrancosPresidentes[i] * 100) / 6;
            modeloTabelaPresidenteNulo.addRow(dados);
        }
        
        dadosnNuloBrancoPresidenteTable.setModel(modeloTabelaPresidenteNulo);
    }
    
    public boolean calcularHora(){
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        if (calendar.get(Calendar.HOUR_OF_DAY) < 9){
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosPresidenteTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dadosGovernadorTable = new javax.swing.JTable();
        presidenteLabel = new javax.swing.JLabel();
        governadorLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dadosnNuloBrancoPresidenteTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        dadosnNuloBrancoGovernadorTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 203, 129));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIO DE VOTAÇÃO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        dadosPresidenteTable.setBackground(new java.awt.Color(204, 255, 204));
        dadosPresidenteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dadosPresidenteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(dadosPresidenteTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Relatório de dados da votação até o momento");

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Voltar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dadosGovernadorTable.setBackground(new java.awt.Color(204, 255, 204));
        dadosGovernadorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dadosGovernadorTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(dadosGovernadorTable);

        presidenteLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        presidenteLabel.setText("PRESIDENTE");
        presidenteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        governadorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        governadorLabel.setText("GOVERNADOR");
        governadorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dadosnNuloBrancoPresidenteTable.setBackground(new java.awt.Color(204, 255, 204));
        dadosnNuloBrancoPresidenteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dadosnNuloBrancoPresidenteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(dadosnNuloBrancoPresidenteTable);

        dadosnNuloBrancoGovernadorTable.setBackground(new java.awt.Color(204, 255, 204));
        dadosnNuloBrancoGovernadorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dadosnNuloBrancoGovernadorTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(dadosnNuloBrancoGovernadorTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(governadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presidenteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(presidenteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(governadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("Resultado");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Final");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ResultadoFinalTela().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorioVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioVotacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dadosGovernadorTable;
    private javax.swing.JTable dadosPresidenteTable;
    private javax.swing.JTable dadosnNuloBrancoGovernadorTable;
    private javax.swing.JTable dadosnNuloBrancoPresidenteTable;
    private javax.swing.JLabel governadorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel presidenteLabel;
    // End of variables declaration//GEN-END:variables
}
