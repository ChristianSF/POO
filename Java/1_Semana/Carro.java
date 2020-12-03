public class Carro {
  
       String marca;
       String placa;
       String modelo;
 
       public void acelerar(int a) {
           System.out.println("Acelerando o carro: " +modelo);
           System.out.println("Velocidade: "+a);
       }
       
       public void frear() {
           System.out.println("Freando o carro");
       }
       
    public static void main(String args[]) {
        Carro c1 = new Carro();
        c1.marca = "Ford";
        c1.placa = "HFX-7041";
        c1.modelo = "Fusion";
      
        c1.acelerar(50);
        c1.frear();
    }
}