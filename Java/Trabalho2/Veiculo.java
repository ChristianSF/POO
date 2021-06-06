package Trabalho;

public class Veiculo {
    private String marca;
    private String placa;
    private String categoria;
    private String id_motorista;

    public Veiculo(String marca, String placa, String categoria, String id_motorista) {
        setMarca(marca);
        setPlaca(placa);
        setCategoria(categoria);
        setId_motorista(id_motorista);
    }

    public String getCategoria() {
        return categoria;
    }

    public String getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(String id_motorista) {
        this.id_motorista = id_motorista;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
    
    public String Imprime() {
        return "Marca: " + getMarca() + "\n" + 
                "Placa: " + getPlaca() + "\n" +
                "Categoria: " + getCategoria() + "\n" +
                "Id Motorista: " + getId_motorista() + "\n";
                
    }
}
