package Models;

public class UsuarioModel {
    private int id;
    private int endereco;
    private String nome;
    private String email;
    private String cpf;
    private String dtNasc;
    private String senha;
    private boolean nvAcess;
    private String cargo;
    

    public UsuarioModel(int id, int endereco, String nome, String email, String cpf, String dtNasc, String senha, boolean nvAcess, String cargo) {
        this.id = id;
        this.endereco = endereco;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.senha = senha;
        this.nvAcess = nvAcess;
        this.cargo = cargo;
    }

    public UsuarioModel(int endereco, String nome, String email, String cpf, String dtNasc, String senha, boolean nvAcess, String cargo) {
        this.endereco = endereco;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.senha = senha;
        this.nvAcess = nvAcess;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isNvAcess() {
        return nvAcess;
    }

    public void setNvAcess(boolean nvAcess) {
        this.nvAcess = nvAcess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
