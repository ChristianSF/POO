package Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int vetor[] = new int[100];
		int tam = 0, n = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		while(n != 0) {
			
			n = entrada.nextInt();
			
			if(n == 0) {
				break;
			}
			
			vetor[tam] = n;
			tam++;
		}
		
		entrada.close();
		
		Arrays.sort(vetor);
		
		System.out.println("Seus numeros são: \n");
		
		for(int i = 0; i < tam; i++) {
			if (vetor[i] == 0) {
				tam++;
			}
			else {
				System.out.println(vetor[i]);
			}
		}
	}
}
