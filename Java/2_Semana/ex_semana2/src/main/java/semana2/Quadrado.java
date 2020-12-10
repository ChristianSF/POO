package semana2;

import java.util.Random;

public class Quadrado {
    
    private double lado;
    private double a;
    private int i;
    private int quadrados[];
    private double soma = 0;
    
    public Quadrado() {
        
    }
    
    public void Aleatorios() {
        quadrados = new int[10];
        Random aleatorio = new Random();
        
        for(i = 0; i < 10; i++){
            a = aleatorio.nextInt(20);
            quadrados[i] = (int) (a * a);
        }
    }
    
    public void Mostra() {
        System.out.println("\n");
        System.out.println("Areas: ");
        for (i=0; i < 10; i++) {
            System.out.println("Quadrado na posicao: " +(i+1) + " Area: "+quadrados[i]);
        } 
        System.out.println("\n");
    }
    
    public void Soma() {
        for (i = 0; i < 10; i++) {
            soma = soma + quadrados[i];
        }
        System.out.println("A soma das áreas dos quadrados é: " +soma);
    }
}
