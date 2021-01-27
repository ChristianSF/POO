package Exercicios;

public class Ex5 {

    public void g() throws Excecao{
	throw new Excecao("erro método G");
    }
	
    public void f(){
	try {
            g();
	} 
        
        catch(Excecao error) {
            error.ImprimeString();
	}    
    }
    
    public static void main(String args[]) {
          Ex5 teste = new Ex5();
          teste.f();
    }
}
