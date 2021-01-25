package Exercicios;

import java.io.FileNotFoundException;

public class Ex2 extends Exception{

    String mensagem;
    
    public Ex2(String msg) {
        mensagem = msg;
    }
    
    public void ImprimeString() {
        try{
            System.out.println("Sua String: ");
            System.out.println(mensagem);
        }
        
        catch(Throwable erro) {
            System.out.println("Ocorreu um erro");
        }
    }
}
