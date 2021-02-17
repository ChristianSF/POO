package Ex2;

public class Ex2 {

	public static void main(String[] args) {
		
		double[] vetor = {30.05, 2.7, 8.26, 0.4, 1.5, 47.2};
			
		double resp = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			resp += vetor[i];
		}
		
		double media = resp / vetor.length;
		
		System.out.println(media);
	}
}
	
