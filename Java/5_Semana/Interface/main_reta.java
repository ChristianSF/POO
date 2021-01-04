package Interface;

public class main_reta {

    public static void main(String args[]) {
        int pa_1[] = {0, 0};
        int pa_2[] = {0, 3};
        
        int pb_1[] = {1,7};
        int pb_2[] = {0, 3};
        
        Reta reta1 = new Reta(pa_1, pa_2);
        Reta reta2 = new Reta(pb_1, pb_1);
        System.out.println("Tamanho reta 1: " + reta1.distanciaPonto());
        System.out.println("Tamanho reta 2: " + reta2.distanciaPonto());
        System.out.println("A reta 1 é maior que a reta 2: " + reta1.maiorQue(reta2));
        System.out.println("A reta 1 é menor que a reta 2: " + reta2.menorQue(reta2));
        System.out.println("Os tamanhos das retas são iguais: " + reta1.igualA(reta2));
    }
}
