package Clase3_E;

public class Clase3_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres = "Ramiro Javier Julieta Maria Alberto Lucas Mariana Josefina" ;
		String[] nombresSeparados = nombres.split(" ");
		for(int indice = 0; indice < nombresSeparados.length; indice++ ) {
			System.out.println(nombresSeparados[indice]);
		}
	}

}
