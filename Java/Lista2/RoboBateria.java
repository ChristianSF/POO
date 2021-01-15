package Robos;

public class RoboBateria extends RoboAbstrato {
    private long energia;
    
        RoboBateria(String n, int px, int py, short d, long e) {
            super(n, px, py, d);
            energia = e;
        }
        
    public void move(int passos) {
        long energiaASerGasta = passos * 10;
        if (energiaASerGasta <= energia) {
            switch (direcaoAtual()) {
                
                case 0:
                    moveX(+passos);
                    break;
                    
                case 45:
                    energiaASerGasta = passos * 14;
                    moveX(+passos);
                    moveY(+passos);
                    break;
                    
                case 90:
                    moveY(+passos);
                    break;
                    
                case 135:
                    energiaASerGasta = passos * 14;
                    moveY(+passos);
                    moveX(-passos);
                    break;
                    
                case 180:
                    moveX(-passos);
                    break;
                    
                case 225:
                    energiaASerGasta = passos * 14;
                    moveX(-passos);
                    moveY(-passos);
                    break;
                    
                case 270:
                    moveY(-passos);
                    break;
                    
                case 315:
                    energiaASerGasta = passos * 14;
                    moveY(-passos);
                    moveX(+passos);
                    break;
            }
            energia -= energiaASerGasta;
        }
    }
    
    public void Recarrega(int novaRecarga) {
        energia += novaRecarga; 
    }
    
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do robô:" + energia;
        return resultado;
    }
}