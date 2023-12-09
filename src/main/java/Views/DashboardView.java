/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author augusto.zeni
 */
public class DashboardView extends javax.swing.JFrame {

    /**
     * Creates new form DashboardView
     */
    public DashboardView(boolean cargo) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        if (!cargo) {
            jMenuRelatorios.setVisible(false);
            jMenuCadastros.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelLocacao = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelBuscaCliente = new javax.swing.JLabel();
        jTextFieldBuscaCliente = new javax.swing.JTextField();
        jButtonPesquisaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLocacaoFilmesJogos = new javax.swing.JTable();
        jButtonRemover = new javax.swing.JButton();
        jLabelBuscaFilmeJogo = new javax.swing.JLabel();
        jTextFieldBuscaFilmeJogo = new javax.swing.JTextField();
        jButtonPesquisaFilmeJogo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFilmesJogos = new javax.swing.JTable();
        jButtonAdicionarFilmeJogo = new javax.swing.JButton();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelPagamento = new javax.swing.JPanel();
        jMenuBarOpcoes = new javax.swing.JMenuBar();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemGeneros = new javax.swing.JMenuItem();
        jMenuPagamentos = new javax.swing.JMenu();
        jMenuItemTiposPagamentos = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastrarUsuario = new javax.swing.JMenuItem();
        jMenuItemCadastrarFilmeEJogos = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosMensais = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlicksNPlay");

        jTabbedPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabelCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCliente.setText("Cliente:");

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setEnabled(false);

        jTextFieldCpf.setEditable(false);
        jTextFieldCpf.setEnabled(false);

        jLabelCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCpf.setText("CPF:");

        jLabelBuscaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBuscaCliente.setText("Buscar:");

        jButtonPesquisaCliente.setText("Pesquisar");

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCliente);

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setEnabled(false);

        jButton1.setText("Adicionar");
        jButton1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCliente)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCliente)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBuscaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisaCliente)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisaCliente)
                    .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filmes e Jogos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableLocacaoFilmesJogos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableLocacaoFilmesJogos);

        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);

        jLabelBuscaFilmeJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBuscaFilmeJogo.setText("Buscar:");

        jButtonPesquisaFilmeJogo.setText("Pesquisar");

        jTableFilmesJogos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableFilmesJogos);

        jButtonAdicionarFilmeJogo.setText("Adicionar");
        jButtonAdicionarFilmeJogo.setEnabled(false);

        jLabelValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValorTotal.setText("Valor Total:");

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemover))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelBuscaFilmeJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBuscaFilmeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisaFilmeJogo))
                            .addComponent(jButtonAdicionarFilmeJogo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemover)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscaFilmeJogo)
                    .addComponent(jTextFieldBuscaFilmeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaFilmeJogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionarFilmeJogo)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelLocacaoLayout = new javax.swing.GroupLayout(jPanelLocacao);
        jPanelLocacao.setLayout(jPanelLocacaoLayout);
        jPanelLocacaoLayout.setHorizontalGroup(
            jPanelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLocacaoLayout.setVerticalGroup(
            jPanelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLocacaoLayout.createSequentialGroup()
                .addGroup(jPanelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLocacaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLocacaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("Locação", jPanelLocacao);

        javax.swing.GroupLayout jPanelPagamentoLayout = new javax.swing.GroupLayout(jPanelPagamento);
        jPanelPagamento.setLayout(jPanelPagamentoLayout);
        jPanelPagamentoLayout.setHorizontalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1209, Short.MAX_VALUE)
        );
        jPanelPagamentoLayout.setVerticalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Pagamento", jPanelPagamento);

        jMenuConsultas.setText("Consultas");

        jMenuItemGeneros.setText("Generos");
        jMenuItemGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemGeneros);

        jMenuBarOpcoes.add(jMenuConsultas);

        jMenuPagamentos.setText("Pagamentos");

        jMenuItemTiposPagamentos.setText("Tipos de Pagamentos");
        jMenuItemTiposPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTiposPagamentosActionPerformed(evt);
            }
        });
        jMenuPagamentos.add(jMenuItemTiposPagamentos);

        jMenuBarOpcoes.add(jMenuPagamentos);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadastrarUsuario.setText("Cadastrar Usuários");
        jMenuItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarUsuario);

        jMenuItemCadastrarFilmeEJogos.setText("Cadastrar Filmes e Jogos");
        jMenuItemCadastrarFilmeEJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFilmeEJogosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarFilmeEJogos);

        jMenuBarOpcoes.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosMensais.setText("Relatórios Mensais");
        jMenuItemRelatoriosMensais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosMensaisActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosMensais);

        jMenuBarOpcoes.add(jMenuRelatorios);

        setJMenuBar(jMenuBarOpcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerosActionPerformed
        GeneroView generoView = new GeneroView();
        generoView.setVisible(true);
    }//GEN-LAST:event_jMenuItemGenerosActionPerformed

    private void jMenuItemTiposPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTiposPagamentosActionPerformed
        TipoPagamentoView tipoPagamentoView = new TipoPagamentoView();
        tipoPagamentoView.setVisible(true);
    }//GEN-LAST:event_jMenuItemTiposPagamentosActionPerformed

    private void jMenuItemRelatoriosMensaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosMensaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelatoriosMensaisActionPerformed

    private void jMenuItemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarUsuarioActionPerformed
        CadastroUsuarioView cadastroUsuariosView = new CadastroUsuarioView();
        cadastroUsuariosView.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarUsuarioActionPerformed

    private void jMenuItemCadastrarFilmeEJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFilmeEJogosActionPerformed
        CadastroFilmeJogoView cadastroFilmeJogoView = new CadastroFilmeJogoView();
        cadastroFilmeJogoView.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarFilmeEJogosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionarFilmeJogo;
    private javax.swing.JButton jButtonPesquisaCliente;
    private javax.swing.JButton jButtonPesquisaFilmeJogo;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabelBuscaCliente;
    private javax.swing.JLabel jLabelBuscaFilmeJogo;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JMenuBar jMenuBarOpcoes;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCadastrarFilmeEJogos;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItemGeneros;
    private javax.swing.JMenuItem jMenuItemRelatoriosMensais;
    private javax.swing.JMenuItem jMenuItemTiposPagamentos;
    private javax.swing.JMenu jMenuPagamentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLocacao;
    private javax.swing.JPanel jPanelPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableFilmesJogos;
    private javax.swing.JTable jTableLocacaoFilmesJogos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBuscaCliente;
    private javax.swing.JTextField jTextFieldBuscaFilmeJogo;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
