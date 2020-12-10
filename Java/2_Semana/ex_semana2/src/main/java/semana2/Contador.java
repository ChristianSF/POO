package semana2;

public class Contador {
    private int i;
    
    public Contador(int cont) {
        i = cont;
    }
    
    public void Mostra() {
        System.out.println("O valor do contador eh: " +i);
    }
    
    public void IncrementaUm() {
        i = i + 1;
    }
    
    public void IncrementaMais(int a) {
        i = i + a;
    }
    
    public void DecrementaUm() {
        i = i - 1;
    }
    
    public void DecremantaMais(int a) {
        i = i - a;
    }
}