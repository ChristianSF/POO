package Exercicios;

public class Ex4 extends Exception{
    
    public static void main(String[] Args) {
        Excecao erro = null;
        
        try {
            erro.ImprimeString();
	} 
        catch(NullPointerException erro1) {
		System.out.println("--> Valor nulo <--");
	}
    }
}
