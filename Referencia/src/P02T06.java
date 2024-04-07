
public class P02T06 {

	public static void main(String[] args) {
		int[] vector = new int[2];
		vector[0]=2;
		vector[1]=2;
		System.out.println("El valor inicial del vector en el método main() "
				+ "es ["+vector[0]+","+vector[1]+"]");
		cuadradoVector(vector);
		System.out.println("El valor del vector en el método main()"
				+ " después de llamar al método cuadradoElementos() es ["+vector[0]+","+vector[1]+"]");
	}
	public static void cuadradoVector(int[] vector){ 
	for(int i=0; i<vector.length; i++) {
		vector[i]=vector[i]*vector[i];
	}
	System.out.println("Los valores de los elementos pasados al método cuadradoElementos() "
			+ "después de elevarles al cuadrado son "+vector[0]+" y "+vector[1]);
	return; 
	} 

}
