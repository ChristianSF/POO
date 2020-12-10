package semana2;

public class Triangulo {
  
    private double base;
    private double altura;
    private double area;
       
    //Construtores
    public Triangulo() {
        base = 4.0;
        altura = 3.0;
    }
      
    public Triangulo(double base1, double altura1) {
        base = base1;
        altura = altura1;
        
    }
    
    public void Area() {
        area = (base * altura)/2;
    }
       
    //Método Mostra
    public void Mostra() {
        System.out.println("A altura eh: " +altura);
        System.out.println("A base eh: " +base);
        System.out.println("A área eh: " +area);
       }

    //Get e Set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 }
    
