package Trabalho;

public class Multa {
    private String categoria;
    private float preco;
    private String local;
    private int pontos_carteira;
    private String id_motorista;
    private String placa_carro;
    
    public Multa(String categoria, float preco, String local, int pontos_carteira, String id_motorista, String placa_carro) {
        setCategoria(categoria);
        setPreco(preco);
        setLocal(local);
        setPontos_carteira(pontos_carteira);
        setPlaca_carro(placa_carro);
        setId_motorista(id_motorista);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getPontos_carteira() {
        return pontos_carteira;
    }

    public void setPontos_carteira(int pontos_carteira) {
        this.pontos_carteira = pontos_carteira;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(String id_motorista) {
        this.id_motorista = id_motorista;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }
}
