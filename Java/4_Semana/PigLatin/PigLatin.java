package Semana4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {
    
    private String palavra;
    private char[] letra;
    private char[] resto;
    private String primeirasLetras;
      
    public void Transforma(String frase) {
        StringTokenizer st = new StringTokenizer(frase, " ");
        
        System.out.println("Palavras novas: ");
        while(st.hasMoreTokens()){
            palavra = st.nextToken();   
            letra = palavra.toCharArray();
            palavra.getChars(1, palavra.length(), resto, 0);
            primeirasLetras = resto.toString();
            System.out.println(primeirasLetras+letra[0]+"ay");
       }
    }
}
