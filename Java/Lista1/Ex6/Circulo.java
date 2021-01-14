package Ex6;

public class Circulo extends Figura {
    
    private double raio;
    private double pi = (double) 3.14;
    private double area;
    
    public Circulo (double r){
        this.raio = r;
        
    }
    
    @Override
    public double getArea() {
        this.area = pi * (raio*raio);
        
        return this.area;
    }

    @Override
    public String toString() {
        return "Area: " + area + "Raio: " + raio;
    }
    
}
