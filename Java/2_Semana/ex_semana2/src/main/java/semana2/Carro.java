package semana2;

import semana2.Contador;

public class Carro {
    private String nome;
    private String marca;
    private String placa;
    private int velocidade;
    
    Contador vezesFreou = new Contador(0);
    Contador vezesAcelerou = new Contador(0);
    Contador vezesLigou = new Contador(0);
     
    public static void main(String args[]) {
        Carro carro1 = new Carro();
        
        carro1.marca = "Marca";
        carro1.nome = "Fusion";
        carro1.placa = "HFW-4321";
        carro1.velocidade = 0;
        
        carro1.Ligar();
        carro1.Acelerar(10);
        carro1.Acelerar(10);
        carro1.Acelerar(10);
        carro1.Frear();
    }
    
    public void Ligar() {
        System.out.println("Ligando carro...");
        vezesLigou.IncrementaUm();
    }
   
    public void Acelerar(int aceleracao) {
       System.out.println("Acelerando... ");
       velocidade = velocidade + aceleracao;
       System.out.println("Velocidade atual: "+velocidade);
       vezesAcelerou.IncrementaUm();
   }
    
   public void Frear() {
       System.out.println("Freando...");
       vezesAcelerou.IncrementaUm();
   }
}