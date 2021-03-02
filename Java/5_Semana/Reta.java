package Interface;

public class Reta implements Relacao {

    private int p1[];
    private int p2[];
    
    public Reta(int[] ponto1, int[] ponto2) {
        this.p1 = ponto1;
        this.p2 = ponto2;
    }
    
    public double distanciaPonto() {
        double soma = 0;
        double total = 0;
        
        for(int i = 0; i < 2; i++) {
            soma += Math.pow(p2[i]-p1[i], 2);
        }
        total = Math.sqrt(soma);
        return total;
    }
    
    @Override
    public boolean maiorQue(Object b) {
        if(this.distanciaPonto() > ((Reta)b).distanciaPonto()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean menorQue(Object b) {
       if(this.distanciaPonto() < ((Reta)b).distanciaPonto()){
            return true;
        }
        else {
            return false;
        } 
    }

    @Override
    public boolean igualA(Object b) {
        if(this.distanciaPonto() == ((Reta)b).distanciaPonto()){
            return true;
        }
        else {
            return false;
        }
    }
    
}
