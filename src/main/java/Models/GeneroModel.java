package Models;

public class GeneroModel {

    private int id;
    private String nome;
    private int total_locacoes;

    public GeneroModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public GeneroModel(int id, String nome, int total_locacoes) {
        this.id = id;
        this.nome = nome;
        this.total_locacoes = total_locacoes;
    }

    public int getTotal_locacoes() {
        return total_locacoes;
    }

    public void setTotal_locacoes(int total_locacoes) {
        this.total_locacoes = total_locacoes;
    }

    public GeneroModel(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
