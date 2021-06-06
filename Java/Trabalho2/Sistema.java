package Trabalho;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Motorista> motoristas = new ArrayList();
    ArrayList<Veiculo> veiculos = new ArrayList();
    ArrayList<Multa> multas = new ArrayList();
    
    public void InsereVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    
    public void ImprimeVeiculo() {
        for (Veiculo v: veiculos) {
            System.out.println("Categoria: " +v.getCategoria());
            System.out.println("Marca: " +v.getMarca());
            System.out.println("Placa: " +v.getPlaca());
            System.out.println("Id motorista: "+v.getId_motorista());
            System.out.println("\n");
        }
        System.out.println("\n");
    }
    
    public int TamanhoVeiculo() {
        return veiculos.size();
    }
    
    public void InsereMulta(Multa multa) {
        multas.add(multa);
    }
    
    public void ImprimeMulta() {
        for (Multa i: multas) {
            System.out.println("Categoria: " +i.getCategoria());
            System.out.println("Preço: " + i.getPreco());
            System.out.println("Local: " + i.getLocal());
            System.out.println("Pontos na carteira: " +i.getPontos_carteira());
            for(Motorista m: motoristas) {
                if(i.getId_motorista().equals(m.getId())) {
                    System.out.println("Id mototorista: " + i.getId_motorista());
                    System.out.println("Motorista: " + m.getNome() + " " + m.getSobrenome());
                }
            }
            
            for (Veiculo v: veiculos) {
                if(i.getPlaca_carro().equalsIgnoreCase(v.getPlaca())){
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Tipo: " + v.getCategoria());
                    System.out.println("Placa do carro: " + v.getPlaca());
                }
            }
        }
        System.out.println("\n");
    }
    
    public int TamanhoMulta() {
        return multas.size();
    }
    
    
    public void InsereMotorista(Motorista motorista){
        motoristas.add(motorista);
    }
    
    public void ImprimeMotorista(){
        for(Motorista m: motoristas) {
            System.out.println("ID: " +m.getId());
            System.out.println("Nome: " + m.getNome() + " " + m.getSobrenome());
            System.out.println("Data de Nascimento: " +m.getData_nascimento());
            System.out.println("Categoria da CNH: " +m.getCategoria_cnh());
            System.out.println("Número de telefone: " +m.getN_telefone());
            System.out.println("\n");
        }
        System.out.println("\n");
    }
    
    public int TamanhoMotorista() {
        return motoristas.size();
    }
}
