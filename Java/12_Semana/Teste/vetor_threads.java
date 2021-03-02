package Teste;

public class vetor_threads extends Thread implements Runnable  {
    
    private String numeroContagem;
    
    public vetor_threads(String numero) {
        this.numeroContagem = numero;
    }

    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("\nContagem "+this.numeroContagem+"- Contando: "+Integer.toString(i));
        }
    }
    public static void main(String args[]) {
        int i;
        int n = 10;
        Thread[] Contagens = new Thread[n];
        
        for (i=0; i<10; i++) {
            Runnable contagem = new vetor_threads(Integer.toString(i));
            
            Thread contagemThread = new Thread(contagem);
            
            contagemThread.setName(Integer.toString(i));
            
            Contagens[i] = contagemThread;
            Contagens[i].start();
        }
    }
}
