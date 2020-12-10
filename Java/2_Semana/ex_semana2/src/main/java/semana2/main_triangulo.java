package semana2;

import semana2.Triangulo;

public class main_triangulo {
    
    public static void main(String args[]) {
        Triangulo triangulo1 = new Triangulo();
        System.out.println("Primeiro Resultado: ");
        triangulo1.Area();
        triangulo1.Mostra();
        
        double base1 = 3.0;
        double altura1 = 2.4;
        triangulo1.setBase(base1);
        triangulo1.setAltura(altura1);
        System.out.println("\n");
        System.out.println("Segundo Resultado: ");
        triangulo1.Area();
        triangulo1.Mostra();
    }
}
