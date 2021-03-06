package Exercicios;

import java.io.FileNotFoundException;

public class Ex2 extends Exception{

    private String mensagem;
    
    public Ex2(String msg) {
        super();
        this.mensagem = msg;
    }
    
    public void ImprimeString() {
        try{
            throw new Ex2("Houve um erro");
        }
        
        catch(Throwable erro) {
            System.out.println("Sua String: ");
            System.out.println(this.mensagem);
        }
    }
}
