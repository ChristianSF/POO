package Ex6;

public class Triangulo extends Figura{
    double area;
    double base;
    double altura;
    
    public Triangulo(double b, double h)  {
        altura = h;
        base = b;
    }
    
    @Override
    public double getArea() {
        area = (base * altura)/2;
        
        return area;
    }

    @Override
    public String toString() {
        return "Área: " + area + "Altura: " + altura + "Base: " + base;
    }
}
