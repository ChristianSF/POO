package Exercicios;

import java.lang.Throwable;

public class Ex1 extends Exception {

    public Ex1 (String message) {
        try{
            System.out.println(message);
        }
        catch(Throwable erro){
            System.out.println("Houve um erro\n");
        }
        
        finally {
            System.out.println("\n");
            System.out.println("Passou por aqui");
        }
    }
    
    public static void main(String args[]) {
        Ex1 teste = new Ex1("Oi, tudo bem?");
    }
}
