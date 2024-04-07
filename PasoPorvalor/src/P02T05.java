
public class P02T05 {

	public static void main(String[] args) {
		int[] vector = new int[2];
		vector[0]=2;
		vector[1]=2;
		System.out.println("El valor inicial del vector en el método main() "
				+ "es ["+vector[0]+","+vector[1]+"]");
		cuadradoElementos(vector[0], vector[1]);
		System.out.println("El valor del vector en el método main()"
				+ " después de llamar al método cuadradoElementos() es ["+vector[0]+","+vector[1]+"]");
	}
	public static void cuadradoElementos(int a, int b){ 
	a=a*a;
	b=b*b;
	System.out.println("Los valores de los elementos pasados al método cuadradoElementos() "
			+ "después de elevarles al cuadrado son "+a+" y "+b);
	return; 
	} 
	
}
