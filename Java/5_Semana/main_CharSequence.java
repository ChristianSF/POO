package Interface;

public class main_CharSequence {

    public static void main(String args[]) {
        Sequencia palavra = new Sequencia();
        
        System.out.println(palavra.getSequencia());
        System.out.println(palavra.charAt(5));
        System.out.println(palavra.toString());
        System.out.println(palavra.Tamanho());
        System.out.println(palavra.subSequencia(3, 7));
    }
}
