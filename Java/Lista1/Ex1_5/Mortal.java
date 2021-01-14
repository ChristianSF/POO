package Ex1_5;

public class Mortal {    
    
    private boolean vivo;
    
    public Mortal() {
        this.vivo = true;
    }
    
    public boolean isVivo() {
        return this.vivo;
    }
    
    public void Mata() {
        this.vivo = false;
    }
    
}
