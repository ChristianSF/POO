package semana2;

public class Retangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private double relacao;
    
    public void Area() {
        area = base * altura;
        System.out.println("Ah área é: " +area);
    }
    
    public void Perimetro() {
        perimetro = (base + base) +(altura + altura);
        System.out.println("O perímetro eh: "+perimetro);
    }
    
    public void Quadrado() {
        if (base != altura) {
            System.out.println("Não é quadrado.");
        }
        
        else {
            System.out.println("É quadrado.");
        }
    }
    
    public void Relacao() {
        
        relacao = altura / base;
        System.out.println("Ah relação eh: "+relacao);
    }
    
    public void Mostra() {
        System.out.println("A base do retângulo é: "+base);
        System.out.println("A altura do retângulo é: "+altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
