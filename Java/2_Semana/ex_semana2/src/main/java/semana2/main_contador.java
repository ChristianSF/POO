package semana2;

public class main_contador {

    public static void main(String args[]) {
        Contador contador1 = new Contador(5);
        
        contador1.DecrementaUm();
        contador1.Mostra();
        contador1.IncrementaMais(10);
        contador1.Mostra();
        contador1.DecrementaUm();
        contador1.DecremantaMais(2);
        contador1.Mostra();
    }
}
