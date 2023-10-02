package loops;

public class cicloFor {

	public static void main(String[] args) {
		/*
		 * El ciclo for proporciona una forma compacta de iterar sobre valores.
		 * for(inicializacion; condicion; (incremento/decremento)){
		 * //bloque de codigo
		 * }
		 */
		
		//For con variable local
		/*for (int numero = 10; numero >= 1; numero--) {
			System.out.println("numero igual a " + numero);
		}*/
		
		//For con variable global
		/*int contador;
		for(contador = 1; contador<100 ; contador++) {
			System.out.println("el contador va en " + contador);
		}*/
		
		/*
		 * Bucles anidados: Bucle dentro de otro bucle
		 */
		int filas = 9;
		
		for(int i = 0; i < filas; i++) {
			for(int h = 0; h <= i; h++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//Java API - Math
		//Calcular 5 potencias del valor pi
		
		double pi = Math.PI;
		int exponente = 5;
		
		System.out.println("El valor de pi es: " + pi);
		System.out.print("\n");
		
		for(int potencia = 1; potencia <= exponente; potencia++) {

			double potenciaPi = Math.pow(pi, potencia);
			
			System.out.println("potencia " + potencia +" de pi: " + potenciaPi);
		}
		
		
	}
}
