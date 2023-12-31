/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author vitor
 */
public class LocacaoModel {

    private int id;
    private int idUsuario;
    private int idFilme;
    private double vl_locacao;
    private int idJogo;
    private String dt_inicio;
    private String dt_fim;

    private String usuario;
    private String filme_Jogo;
    private String tipo;

    public LocacaoModel(int id, int idUsuario, int idFilme, double vl_locacao, int idJogo, String dt_inicio, String dt_fim) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idFilme = idFilme;
        this.vl_locacao = vl_locacao;
        this.idJogo = idJogo;
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
    }

    public LocacaoModel(int idUsuario, double vl_locacao, int idJogo) {
        this.idUsuario = idUsuario;
        this.vl_locacao = vl_locacao;
        this.idJogo = idJogo;
    }

    public LocacaoModel(int idUsuario, int idFilme, double vl_locacao) {
        this.idUsuario = idUsuario;
        this.idFilme = idFilme;
        this.vl_locacao = vl_locacao;
    }

    public LocacaoModel(int idUsuario, String usuario, String filme_Jogo, String tipo, double vl_locacao, String dt_inicio) {
        this.idUsuario = idUsuario;
        this.vl_locacao = vl_locacao;
        this.dt_inicio = dt_inicio;
        this.usuario = usuario;
        this.filme_Jogo = filme_Jogo;
        this.tipo = tipo;
    }

    public LocacaoModel(int id, String filme_Jogo, String tipo, double vl_locacao, String dt_fim) {
        this.id = id;
        this.vl_locacao = vl_locacao;
        this.dt_fim = dt_fim;
        this.filme_Jogo = filme_Jogo;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFilme_Jogo() {
        return filme_Jogo;
    }

    public void setFilme_Jogo(String filme_Jogo) {
        this.filme_Jogo = filme_Jogo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public double getVl_locacao() {
        return vl_locacao;
    }

    public void setVl_locacao(double vl_locacao) {
        this.vl_locacao = vl_locacao;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public String getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(String dt_fim) {
        this.dt_fim = dt_fim;
    }

}
