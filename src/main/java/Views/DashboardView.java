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
        setExtendedState(MAXIMIZED_BOTH);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemGeneros = new javax.swing.JMenuItem();
        jMenuItemJogos = new javax.swing.JMenuItem();
        jMenuItemFilmes = new javax.swing.JMenuItem();
        jMenuPagamentos = new javax.swing.JMenu();
        jMenuItemTiposPagamentos = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosMensais = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastrarUsuário = new javax.swing.JMenuItem();
        jMenuItemCadastrarFilme = new javax.swing.JMenuItem();
        jMenuItemCadastrarJogo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2222);
        setResizable(false);

        jMenuConsultas.setText("Consultas");

        jMenuItemGeneros.setText("Generos");
        jMenuItemGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemGeneros);

        jMenuItemJogos.setText("Jogos");
        jMenuConsultas.add(jMenuItemJogos);

        jMenuItemFilmes.setText("Filmes");
        jMenuConsultas.add(jMenuItemFilmes);

        jMenuBar1.add(jMenuConsultas);

        jMenuPagamentos.setText("Pagamentos");

        jMenuItemTiposPagamentos.setText("Tipos de Pagamentos");
        jMenuItemTiposPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTiposPagamentosActionPerformed(evt);
            }
        });
        jMenuPagamentos.add(jMenuItemTiposPagamentos);

        jMenuBar1.add(jMenuPagamentos);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosMensais.setText("Relatórios Mensais");
        jMenuItemRelatoriosMensais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosMensaisActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosMensais);

        jMenuBar1.add(jMenuRelatorios);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadastrarUsuário.setText("Cadastrar Usuário");
        jMenuItemCadastrarUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarUsuárioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarUsuário);

        jMenuItemCadastrarFilme.setText("Cadastrar Filme");
        jMenuItemCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFilmeActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarFilme);

        jMenuItemCadastrarJogo.setText("Cadastrar Filme");
        jMenuItemCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarJogoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarJogo);

        jMenuBar1.add(jMenuCadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
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

    private void jMenuItemCadastrarUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarUsuárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarUsuárioActionPerformed

    private void jMenuItemCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFilmeActionPerformed
        CadastroFilmeView cadastroFilmeView = new CadastroFilmeView();
        cadastroFilmeView.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarFilmeActionPerformed

    private void jMenuItemCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarJogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCadastrarFilme;
    private javax.swing.JMenuItem jMenuItemCadastrarJogo;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuário;
    private javax.swing.JMenuItem jMenuItemFilmes;
    private javax.swing.JMenuItem jMenuItemGeneros;
    private javax.swing.JMenuItem jMenuItemJogos;
    private javax.swing.JMenuItem jMenuItemRelatoriosMensais;
    private javax.swing.JMenuItem jMenuItemTiposPagamentos;
    private javax.swing.JMenu jMenuPagamentos;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
