package Teste;

public class Teste {

    public static void main(String args[]) {
        Thread_Exemplo1 thread = new Thread_Exemplo1("Thread #1", 600);
        //thread.start();
        
        Thread_Exemplo1 thread2 = new Thread_Exemplo1("Thread #2", 900);
    }
}
