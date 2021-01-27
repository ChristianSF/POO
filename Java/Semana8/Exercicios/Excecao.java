package Exercicios;

public class Excecao extends Exception{
    
    private String mensagem;
    
    public Excecao(String msg) {
        super();
        this.mensagem = msg;
    }
    
    public void ImprimeString() {
        try{
            throw new Excecao("Houve um erro");
        }
        
        catch(Throwable erro) {
            System.out.println("Sua String: ");
            System.out.println(this.mensagem);
        }
    }
}
