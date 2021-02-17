package Ex4;

public class Ex4 {

	private int[] vetor;
	
	public Ex4(int[] vetor) {
		this.vetor = vetor;
	}
	
	public void maior() {
		int maior = 0;	
	
		for(int i = 0; i<this.vetor.length; i++) {
			if(maior< this.vetor[i]) {
				maior = this.vetor[i];
			}
		}
		
		System.out.println("O maior númeroh: " + maior);
	}
	
	public static void main(String[] args) {
		
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 44};
		
		Ex4 novo = new Ex4(vetor);
		
		novo.maior();
	}
}
