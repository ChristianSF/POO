package Ex6;

public class TrianguloRetangulo extends Triangulo{
    
    public TrianguloRetangulo(double b, double h) {
        base = b;
        altura = h;
    }
    
    @Override
    public String toString() {
        return "Área do Triangulo: " + this.area + "base: " + base + "Altura: " + altura;
    }
}
