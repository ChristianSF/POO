package Ex1;

import java.util.ArrayList;
import java.util.Collection;

public class Ex1 extends Thread implements Runnable{
    
    private int nThreads;
    private int intervalo_inicio;
    private int intervalo_final;
    
    public Ex1(int intervalo_inicio, int intervalo_final, int n) {
        this.intervalo_inicio = intervalo_inicio;
        this.intervalo_final = intervalo_final;
        this.nThreads = n;
   
    }
    
    public void run (){
        int j = 0;
        int primos[]= null;
        int soma = 0;
        
        for(int i = this.intervalo_inicio; i < this.intervalo_final; i++) {
            primos[i] = 0;
        }
        
        for(int i = this.intervalo_inicio; i < this.intervalo_final; i++) {
            if(i % 2 == 0) {
                primos[j] = i;
                j++;
            }
        }
        
        for (int i = 0; i < j; i++) {
            soma = primos[i] + soma;
        }
        
        System.out.println("Soma da Thread:" + soma);
    }
    
    public static void main(String args[]) {
        Collection<Ex1> threads = new ArrayList<>();
        
        int n = 5;
        
        for(int i = 0; i < n; i++) {
            Ex1 thread = new Ex1(1, 100, n);
            
            threads.add(thread);
        }
        
        for (Ex1 erro : threads) {
            erro.start();
        }

        for (Ex1 erro : threads) {
            try {
                erro.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
