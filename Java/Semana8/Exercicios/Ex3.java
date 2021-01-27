package Exercicios;

import Execoes.Exececao;

public class Ex3 extends Exception {
    
    private String mensagem;
    
    public Ex3(String msg) {
        super();
        this.mensagem = msg;
    }
    
    public void imprimeString() {
		System.out.println(this.mensagem);
    }
    
    public void lancar() throws Excecao{
        throw new Excecao("Houve um erro");
    }
    
    public static void main(String[] Args) throws Excecao {
        Ex3 erro = new Ex3("Testando");
        
        try {
            erro.lancar();
        } 
        catch(Excecao erro1) {
            erro.imprimeString();
        }
    }
    
}
