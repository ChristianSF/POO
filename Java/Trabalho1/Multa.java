package Trabalho;

public class Multa {
    private String tipo;
    private float valor;
    private String cpf;
    private String placa;
    
    
    public Multa(String tipo, float valor, String cpf, String placa) {
        setTipo(tipo);
        setValor(valor);
        setCpf(cpf);
        setPlaca(placa);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
