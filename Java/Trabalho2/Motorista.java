package Trabalho;

public class Motorista {
    private String nome;
    private String sobrenome;
    private String id;
    private String categoria_cnh;
    private String data_nascimento;
    private int n_telefone;
    
    public Motorista(String nome, String sobrenome, String id, String categoria_cnh, String data_nascimento, int n_telefone) {
        setNome(nome);
        setSobrenome(sobrenome);
        setId(id);
        setCategoria_cnh(categoria_cnh);
        setData_nascimento(data_nascimento);
        setN_telefone(n_telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria_cnh() {
        return categoria_cnh;
    }

    public void setCategoria_cnh(String categoria_cnh) {
        this.categoria_cnh = categoria_cnh;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getN_telefone() {
        return n_telefone;
    }

    public void setN_telefone(int n_telefone) {
        this.n_telefone = n_telefone;
    }
    
    
}
