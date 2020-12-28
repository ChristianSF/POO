package Semana4;

import java.util.Scanner;

public class PigLatin_main {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String frase_2;
        
        System.out.println("Entre com a frase: ");
        
        frase_2 = entrada.nextLine();
        entrada.close();
        
        PigLatin frase = new PigLatin();
        frase.Transforma(frase_2);
    }
}
