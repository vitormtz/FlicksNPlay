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

        jMenuBar1 = new javax.swing.JMenuBar();
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
        setMaximumSize(null);

        jMenuConsultas.setText("Consultas");

        jMenuItemGeneros.setText("Generos");
        jMenuItemGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemGeneros);

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

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosMensais.setText("Relatórios Mensais");
        jMenuItemRelatoriosMensais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosMensaisActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosMensais);

        jMenuBar1.add(jMenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCadastrarFilmeEJogos;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItemGeneros;
    private javax.swing.JMenuItem jMenuItemRelatoriosMensais;
    private javax.swing.JMenuItem jMenuItemTiposPagamentos;
    private javax.swing.JMenu jMenuPagamentos;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
