/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Support.ItemCombo;
import Controllers.FilmeController;
import Controllers.GeneroController;
import Controllers.JogoController;
import Models.FilmeModel;
import Models.GeneroModel;
import Models.JogoModel;
import Support.PriceDocumentFilter;
import TablesModel.FilmesTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author vitor
 */
public class CadastroFilmeJogoView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFilmeView
     */
    private int id;

    public CadastroFilmeJogoView() {
        initComponents();
        carregarFilmesJogos();
        ((AbstractDocument) this.jTextFieldPreco.getDocument()).setDocumentFilter(new PriceDocumentFilter());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxClasIndicativa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilmesJogos = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDescricao = new javax.swing.JTextPane();
        jLabelClasIndicativa = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelNomeValLocacao = new javax.swing.JLabel();
        jLabelDisponivel = new javax.swing.JLabel();
        jComboBoxDisponivel = new javax.swing.JComboBox();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FlicksNPlay - Cadastro De Filmes E Jogos");
        setResizable(false);

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGenero.setText("Gênero:");

        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jComboBoxClasIndicativa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxClasIndicativa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxClasIndicativaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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
        jTableFilmesJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFilmesJogosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFilmesJogos);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        jScrollPane2.setViewportView(jTextPaneDescricao);

        jLabelClasIndicativa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelClasIndicativa.setText("Classificação:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxGenero.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxGeneroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextFieldPreco.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextFieldPrecoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelNomeValLocacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeValLocacao.setText("Preço:");

        jLabelDisponivel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDisponivel.setText("Disponível:");

        jComboBoxDisponivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDisponivel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxDisponivelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxTipoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClasIndicativa)
                            .addComponent(jLabelNomeValLocacao)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxClasIndicativa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDisponivel)
                            .addComponent(jLabelGenero)
                            .addComponent(jLabelTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(131, 131, 131))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipo)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeValLocacao)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGenero)
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClasIndicativa)
                            .addComponent(jComboBoxClasIndicativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDisponivel)
                            .addComponent(jComboBoxDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAtualizar))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Object valueId = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 0);
        Object valueTipo = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 2);

        if ("Filme".equals((String) valueTipo)) {
            FilmeController filmeController = new FilmeController();
            filmeController.delete(Integer.valueOf((String) valueId));

            carregarFilmesJogos();
            limparCampos();
            this.jButtonCadastrar.setEnabled(true);
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        } else {
            JogoController jogoController = new JogoController();
            jogoController.delete(Integer.valueOf((String) valueId));

            carregarFilmesJogos();
            limparCampos();
            this.jButtonCadastrar.setEnabled(true);
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        String nome = this.jTextFieldNome.getText();
        double preco = Double.parseDouble(this.jTextFieldPreco.getText().equals("") ? "00.00" : this.jTextFieldPreco.getText());
        Integer classificacao = Integer.valueOf(this.jComboBoxClasIndicativa.getSelectedItem().toString().equals("") ? "0" : this.jComboBoxClasIndicativa.getSelectedItem().toString());
        String tipo = this.jComboBoxTipo.getSelectedItem().equals("Filme") ? "F" : "J";
        boolean disponivel = this.jComboBoxDisponivel.getSelectedItem().equals("Sim") ? true : false;
        String descricao = this.jTextPaneDescricao.getText();

        if (validaCampos()) {
            JOptionPane.showMessageDialog(null, "Valores não inseridos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("F")) {
            ItemCombo comboGenero = (ItemCombo) this.jComboBoxGenero.getSelectedItem();
            int genero = comboGenero.getId();

            FilmeModel filmes = new FilmeModel(this.id, genero, nome, descricao, classificacao, disponivel, preco, tipo.charAt(0));
            FilmeController filmeController = new FilmeController();
            filmeController.update(filmes);

            carregarFilmesJogos();
            limparCampos();
            this.jButtonCadastrar.setEnabled(true);
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        } else if (tipo.equals("J")) {
            ItemCombo comboGenero = (ItemCombo) this.jComboBoxGenero.getSelectedItem();
            int genero = comboGenero.getId();

            JogoModel jogos = new JogoModel(this.id, genero, nome, descricao, classificacao, disponivel, preco, tipo.charAt(0));
            JogoController JogoController = new JogoController();
            JogoController.update(jogos);

            carregarFilmesJogos();
            limparCampos();
            this.jButtonCadastrar.setEnabled(true);
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jComboBoxClasIndicativaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxClasIndicativaAncestorAdded
        this.jComboBoxClasIndicativa.removeAllItems();
        this.jComboBoxClasIndicativa.addItem("");
        this.jComboBoxClasIndicativa.addItem(10);
        this.jComboBoxClasIndicativa.addItem(12);
        this.jComboBoxClasIndicativa.addItem(14);
        this.jComboBoxClasIndicativa.addItem(16);
        this.jComboBoxClasIndicativa.addItem(18);
    }//GEN-LAST:event_jComboBoxClasIndicativaAncestorAdded

    private void jTableFilmesJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFilmesJogosMouseClicked
        this.jButtonExcluir.setEnabled(true);
        this.jButtonAtualizar.setEnabled(true);
        this.jButtonCadastrar.setEnabled(false);

        this.id = Integer.parseInt((String) this.jTableFilmesJogos.getValueAt(getSelectedRow(), 0));
        Object valueNome = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 1);
        Object valueTipo = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 2);
        Object valueGenero = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 3);
        Object valueDescricao = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 4);
        Object valueClassificacao = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 5);
        Object valueDisponivel = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 6);
        Object valuePreco = this.jTableFilmesJogos.getValueAt(getSelectedRow(), 7);

        this.jTextFieldNome.setText((String) valueNome);
        this.jComboBoxTipo.setSelectedIndex("Filme".equals((String) valueTipo) ? 1 : 2);
        for (int i = 0; i < this.jComboBoxGenero.getItemCount(); i++) {
            this.jComboBoxGenero.setSelectedIndex(i);
            if (String.valueOf(this.jComboBoxGenero.getSelectedItem()).equals(String.valueOf(valueGenero))) {
                break;
            }
        }
        this.jTextPaneDescricao.setText((String) valueDescricao);
        for (int i = 0; i < this.jComboBoxClasIndicativa.getItemCount(); i++) {
            this.jComboBoxClasIndicativa.setSelectedIndex(i);
            if (String.valueOf(this.jComboBoxClasIndicativa.getSelectedItem()).equals(String.valueOf(valueClassificacao))) {
                break;
            }
        }
        this.jComboBoxDisponivel.setSelectedIndex("Sim".equals((String) valueDisponivel) ? 1 : 2);
        this.jTextFieldPreco.setText((String) valuePreco);

    }//GEN-LAST:event_jTableFilmesJogosMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String nome = this.jTextFieldNome.getText();
        double preco = Double.parseDouble(this.jTextFieldPreco.getText().equals("") ? "00.00" : this.jTextFieldPreco.getText());
        Integer classificacao = Integer.valueOf(this.jComboBoxClasIndicativa.getSelectedItem().toString().equals("") ? "0" : this.jComboBoxClasIndicativa.getSelectedItem().toString());
        String tipo = this.jComboBoxTipo.getSelectedItem().equals("Filme") ? "F" : "J";
        boolean disponivel = this.jComboBoxDisponivel.getSelectedItem().equals("Sim") ? true : false;
        String descricao = this.jTextPaneDescricao.getText();
        if (validaCampos()) {
            JOptionPane.showMessageDialog(null, "Valores não inseridos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("F")) {
            ItemCombo comboGenero = (ItemCombo) this.jComboBoxGenero.getSelectedItem();
            int genero = comboGenero.getId();

            FilmeModel filme = new FilmeModel(genero, nome, descricao, classificacao, disponivel, preco, tipo.charAt(0));
            FilmeController filmeController = new FilmeController();
            filmeController.create(filme);

            carregarFilmesJogos();
            limparCampos();
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        } else if (tipo.equals("J")) {
            ItemCombo comboGenero = (ItemCombo) this.jComboBoxGenero.getSelectedItem();
            int genero = comboGenero.getId();

            JogoModel jogo = new JogoModel(genero, nome, descricao, classificacao, disponivel, preco, tipo.charAt(0));
            JogoController jogoController = new JogoController();
            jogoController.create(jogo);

            carregarFilmesJogos();
            limparCampos();
            this.jButtonExcluir.setEnabled(false);
            this.jButtonAtualizar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxGeneroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxGeneroAncestorAdded
        this.jComboBoxGenero.removeAllItems();
        this.jComboBoxGenero.addItem("");
        GeneroController generoController = new GeneroController();
        ArrayList<GeneroModel> lista = generoController.readAll();
        for (GeneroModel generoModel : lista) {
            this.jComboBoxGenero.addItem(new ItemCombo(generoModel.getId(), generoModel.getNome()));
        }
    }//GEN-LAST:event_jComboBoxGeneroAncestorAdded

    private void jComboBoxDisponivelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxDisponivelAncestorAdded
        this.jComboBoxDisponivel.removeAllItems();
        this.jComboBoxDisponivel.addItem("");
        this.jComboBoxDisponivel.addItem("Sim");
        this.jComboBoxDisponivel.addItem("Não");
    }//GEN-LAST:event_jComboBoxDisponivelAncestorAdded

    private void jComboBoxTipoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxTipoAncestorAdded
        this.jComboBoxTipo.removeAllItems();
        this.jComboBoxTipo.addItem("");
        this.jComboBoxTipo.addItem("Filme");
        this.jComboBoxTipo.addItem("Jogo");
    }//GEN-LAST:event_jComboBoxTipoAncestorAdded

    private void jTextFieldPrecoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextFieldPrecoAncestorAdded
        this.jTextFieldPreco.setText("0");
    }//GEN-LAST:event_jTextFieldPrecoAncestorAdded
    public void carregarFilmesJogos() {
        FilmeController FilmeController = new FilmeController();
        ArrayList<FilmeModel> lista = FilmeController.readFilmeJogo();
        this.jTableFilmesJogos.setModel(new FilmesTableModel(lista));
    }

    public void limparCampos() {
        this.jTextFieldNome.setText("");
        this.jTextFieldPreco.setText("0");
        this.jComboBoxClasIndicativa.setSelectedIndex(0);
        this.jComboBoxTipo.setSelectedIndex(0);
        this.jComboBoxGenero.setSelectedIndex(0);
        this.jComboBoxDisponivel.setSelectedIndex(0);
        this.jTextPaneDescricao.setText("");
    }

    public int getSelectedRow() {
        return this.jTableFilmesJogos.getSelectedRow();
    }

    public boolean validaCampos() {
        String nome = this.jTextFieldNome.getText();
        String preco = this.jTextFieldPreco.getText();
        String classificacao = String.valueOf(this.jComboBoxClasIndicativa.getSelectedItem());
        String tipo = (String) this.jComboBoxTipo.getSelectedItem();
        String genero = String.valueOf(this.jComboBoxGenero.getSelectedItem());
        String disponivel = (String) this.jComboBoxDisponivel.getSelectedItem();
        String descricao = this.jTextPaneDescricao.getText();
        return nome.isEmpty() || preco.isEmpty()
                || classificacao.isEmpty() || tipo.isEmpty()
                || genero.isEmpty() || disponivel.isEmpty() || descricao.isEmpty();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox jComboBoxClasIndicativa;
    private javax.swing.JComboBox jComboBoxDisponivel;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelClasIndicativa;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelDisponivel;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeValLocacao;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFilmesJogos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextPane jTextPaneDescricao;
    // End of variables declaration//GEN-END:variables
}
