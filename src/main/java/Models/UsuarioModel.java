package Models;

public class UsuarioModel {
    private int id;
    private int cidade;
    private String nome;
    private String endereco;
    private String email;
    private String cpf;
    private String dtNasc;
    private String senha;

    public UsuarioModel(int id, int cidade, String nome, String endereco, String email, String cpf, String dtNasc, String senha) {
        this.id = id;
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.senha = senha;
    }

    public UsuarioModel(int cidade, String nome, String endereco, String email, String cpf, String dtNasc, String senha ) {
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }
}
