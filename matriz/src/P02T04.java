import java.util.Scanner;

public class P02T04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		System.out.println("Tamaño del vector?:");
		int n = entrada.nextInt();	
		entrada.close();
		
		int[] vector = new int[n];
		
		for(int i = 0; i<n; i++) {
			vector[i] = 2;
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println("El elemento "+i+" del vector es"+vector[i]);
		}
		
	}

}
