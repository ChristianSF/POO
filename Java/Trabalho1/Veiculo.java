package Trabalho;

public class Veiculo {
    private String marca;
    private String placa;
    private String tipo;
    private String cpf_motorista;

    public Veiculo(String marca, String placa, String tipo, String cpf_motorista) {
        setMarca(marca);
        setPlaca(placa);
        setTipo(tipo);
        setCpf_motorista(cpf_motorista);
    }

    public String getTipo() {
        return tipo;
    }

    public String getCpf_motorista() {
        return cpf_motorista;
    }

    public void setCpf_motorista(String cpf_motorista) {
        this.cpf_motorista = cpf_motorista;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
