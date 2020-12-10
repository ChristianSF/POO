package semana2;

import semana2.Retangulo;

public class main_retangulo {

    public static void main(String args[]) {
        Retangulo retangulo1 = new Retangulo();
        
        retangulo1.setAltura(5.0);
        retangulo1.setBase(5.0);
        
        retangulo1.Area();
        retangulo1.Perimetro();
        retangulo1.Quadrado();
        retangulo1.Relacao();
        retangulo1.Mostra();
    }
}
