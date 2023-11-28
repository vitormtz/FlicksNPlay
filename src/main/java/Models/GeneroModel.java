package Models;

public class GeneroModel {

    private int id;
    private String nome;

    public GeneroModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
