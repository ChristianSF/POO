package Teste;

public class Thread_Exemplo1 extends Thread{
    private String nome;
    private int tempo;
    
    public Thread_Exemplo1(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    public void run() {
       try {
           for(int i = 0; i < 6; i++) {
                System.out.println(nome +" contador " + i);
                sleep(tempo);
            }
       }
       
       catch(InterruptedException e) {
           e.printStackTrace();
       }
    }
    
}
