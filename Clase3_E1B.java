package Clase3_E;

public class Clase3_E1B {

	public static void main(String[] args) {
		// Ejercicio Clase3 1B
		
		int numero1 = 7, numero2 = 4, numero3 = 11;
		String orden = "descendente";
		int vector[] = new int[3];
		
		if(orden == "ascendente"){
			if((numero1 <= numero2) && (numero1 <= numero3)) {
				vector[0] = numero1;
				if(numero2 <= numero3){
					vector[1] = numero2;
					vector[2] = numero3;
				}else {
					vector[1] = numero3;
					vector[2] = numero2;
				}
				
			}else {
				if((numero2 <= numero3) && (numero2 <= numero1)) {
					vector[0] = numero2;
					if(numero1 <= numero3){
						vector[1] = numero1;
						vector[2] = numero3;
					}else {
						vector[1] = numero3;
						vector[2] = numero1;
					}
				}
				else {
					if((numero2 <= numero3) && (numero2 <= numero1)) {
						vector[0] = numero2;
						if(numero1 <= numero3){
							vector[1] = numero1;
							vector[2] = numero3;
						}else {
							vector[1] = numero3;
							vector[2] = numero1;
						}
					}
				}
			}
		}else {
			if((numero1 <= numero2) && (numero1 <= numero3)) {
				vector[2] = numero1;
				if(numero2 <= numero3){
					vector[1] = numero2;
					vector[0] = numero3;
				}else {
					vector[1] = numero3;
					vector[0] = numero2;
				}
				
			}else {
				if((numero2 <= numero3) && (numero2 <= numero1)) {
					vector[2] = numero2;
					if(numero1 <= numero3){
						vector[1] = numero1;
						vector[0] = numero3;
					}else {
						vector[1] = numero3;
						vector[0] = numero1;
					}
				}
				else {
					if((numero2 <= numero3) && (numero2 <= numero1)) {
						vector[2] = numero2;
						if(numero1 <= numero3){
							vector[1] = numero1;
							vector[0] = numero3;
						}else {
							vector[1] = numero3;
							vector[0] = numero1;
						}
					}
				}
			}
		}
		
		for(int indice = 0; indice < vector.length; indice++) {
			System.out.println(vector[indice]);
		}
	}
}


