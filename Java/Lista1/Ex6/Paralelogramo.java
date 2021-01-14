package Ex6;

public class Paralelogramo extends Figura {
    
    private double base;
    private double altura;
    private double area;
    
    public Paralelogramo (double b, double h) {
        this.base = b;
        this.altura = h;
    }
    
    @Override
    public double getArea() {
        this.area = this.base * this.altura;
        
        return this.area;
    }

    @Override
    public String toString() {
        return "Área Paralelogramo: " + this.area + "base: " + this.base + "Altura: " + this.altura;
    }
}
