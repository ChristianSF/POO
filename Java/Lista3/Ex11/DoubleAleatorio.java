package Ex11;
import java.util.Random;

public class DoubleAleatorio {
	private int tam;
	
	public DoubleAleatorio(int tamanho) {
		this.tam = tamanho;
	}

	public double[] gerador() {
		Random r = new Random();
		double[] vetor = new double[10];
		
		for (int i = 0; i < this.tam; i++) {
			vetor[i] = (r.nextDouble()) * 100;
		}
		return vetor;
	}
	
	public static void main(String[] args) {
		DoubleAleatorio novo = new DoubleAleatorio(5);
		
		double vetor[] = novo.gerador();
		
		for (int i = 0; i < novo.tam; i++) {
			System.out.println( vetor[i]);
		}
	}
	
}
