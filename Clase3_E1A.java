package Clase3_E;

public class Clase3_E1A {

	public static void main(String[] args) {
		// Array y String
		// Ejercicio 1A
		
		String s = "Hola Mundo, soy Francisco";
		char letra = 'o';
		int contador = 0;
		for(int indice = 0; indice < s.length(); indice++) {
			if(s.charAt(indice) == letra) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que aparecio la letra " + letra + " fue " + contador);
	}
}