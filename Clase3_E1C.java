package Clase3_E;

public class Clase3_E1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[] = new int[]{1,3,6,22,41,23,11,5,44};
		int numeroX = 15;
		int suma = 0;
		
		for(int indice = 0; indice < vector.length; indice++) {
			if(vector[indice] > numeroX) {
				suma = suma + vector[indice];
			}
		}
		
		System.out.println(suma);
		
	}

}
