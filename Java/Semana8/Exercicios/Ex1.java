package Exercicios;

import java.lang.Throwable;

public class Ex1 extends Exception {

    public Ex1 (String message) {
        try{
            System.out.println(message);
            throw new Exception("Houve um erro. ");
        }
        
        catch(Throwable erro){
            System.out.println("Houve um errooo\n");
        }
        
        finally {
            System.out.println("Passou por aqui");
        }
    }
    
    public static void main(String args[]) {
        Ex1 teste = new Ex1("Oi, tudo bem?");
    }
}
