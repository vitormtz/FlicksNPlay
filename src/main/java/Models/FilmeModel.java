/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author vitor
 */
public class FilmeModel {

    private int id;
    private String genero1;
    private int genero2;
    private String nome;
    private String descricao;
    private int classificacao_indicativa;
    private boolean disponivel;
    private double vl_locacao;
    private char tipo;

    public FilmeModel(int id, String genero1, String nome, String descricao, int classificacao_indicativa, boolean disponivel, double vl_locacao, char tipo) {
        this.id = id;
        this.genero1 = genero1;
        this.nome = nome;
        this.descricao = descricao;
        this.classificacao_indicativa = classificacao_indicativa;
        this.disponivel = disponivel;
        this.vl_locacao = vl_locacao;
        this.tipo = tipo;
    }

    public FilmeModel(int id, int genero2, String nome, String descricao, int classificacao_indicativa, boolean disponivel, double vl_locacao, char tipo) {
        this.id = id;
        this.genero2 = genero2;
        this.nome = nome;
        this.descricao = descricao;
        this.classificacao_indicativa = classificacao_indicativa;
        this.disponivel = disponivel;
        this.vl_locacao = vl_locacao;
        this.tipo = tipo;
    }

    public FilmeModel(int genero2, String nome, String descricao, int classificacao_indicativa, boolean disponivel, double vl_locacao, char tipo) {
        this.genero2 = genero2;
        this.nome = nome;
        this.descricao = descricao;
        this.classificacao_indicativa = classificacao_indicativa;
        this.disponivel = disponivel;
        this.vl_locacao = vl_locacao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public int getGenero2() {
        return genero2;
    }

    public void setGenero2(int genero2) {
        this.genero2 = genero2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getClassificacao_indicativa() {
        return classificacao_indicativa;
    }

    public void setClassificacao_indicativa(int classificacao_indicativa) {
        this.classificacao_indicativa = classificacao_indicativa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getVl_locacao() {
        return vl_locacao;
    }

    public void setVl_locacao(double vl_locacao) {
        this.vl_locacao = vl_locacao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDisponivel() {
        return "true".equals(String.valueOf(this.isDisponivel())) ? "Sim" : "Não";
    }

    public String getTipoCompleto() {
        return String.valueOf(tipo).equals("F") ? "Filme" : "Jogo";
    }
}
