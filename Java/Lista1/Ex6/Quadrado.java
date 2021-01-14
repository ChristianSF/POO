package Ex6;

public class Quadrado extends Retangulo{
    
    
    public Quadrado(double b, double h) {
        this.base = b;
    }
    
    @Override
    public double getArea() {
        return base * base;
    }
    
    @Override
    public String toString() {
        return "Area: " + this.area + "Lado: " + base;
    }
    
}
