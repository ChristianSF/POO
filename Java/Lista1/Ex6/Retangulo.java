package Ex6;

public class Retangulo extends Figura {
    
    double area;
    double base;
    private double altura;
    
    public Retangulo(double b, double h) {
        this.altura = h;
        base = b;
    }
    
    @Override
    public double getArea() {
        area = base * this.altura;
        
        return area;
    }

    @Override
    public String toString() {
        return "Area: " + area + "Base: " + base + "Altura: " + altura;
    }
}
