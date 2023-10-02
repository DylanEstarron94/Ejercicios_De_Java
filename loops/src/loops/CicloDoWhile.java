package loops;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		/**
		 *Do-While. Evalúa su expresión en la parte inferior del ciclo. POr lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		 */
		
		//Cuenta del 1 al 10
		/*int cuenta = 1;
		
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta <= 15);//Output 1: ya que se ejecutó al menos una vez
		
		System.out.println("Fin de cuenta");*/
		
		/*
		 * Crear un programa para un cajero bancario
		 * -El programa me mostrará cuatro opciones
		 * 		1. consultar saldo
		 * 		2. ingresar dinero
		 * 		3. retirar dinero
		 * 		4. salir
		 * -Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * -Mostrar al usuario la opción que eligío y permitir que elija otra opción
		 * -El usuario puede salir el programa eligiendo 4 (salir)
		 * */
	
		
		int opcion;
		
		System.out.println("************************Bienvenido al cajero mamalons supersayayinesco meteórico mamastroso*******************************");
		
		
		do {
			
			System.out.println("\nElige una de las siguientes ocpciones y elige el número correspondiente: ");
			System.out.println("1. consultar saldo\r\n"
					+ "2. ingresar dinero\r\n"
					+ "3. retirar dinero\r\n"
					+ "4. salir");
			System.out.print("\nElige tu respuesta: ");
			
		try (Scanner skn = new Scanner(System.in)) {
				opcion = skn.nextInt();
			};
			
			System.out.println("");
			
			switch (opcion) {
			case 1:
				System.out.println("Consulte su saldo: ");
				break;
				
			case 2:
				System.out.println("Ingrese su dinero: ");
				break;
				
			case 3:
				System.out.println("Retire su dinero: ");
				break;
				
			case 4:
				System.out.println("Gracias por su visit... ");
				break;
				
				default:
					System.out.println("Opción incorrecta, elige una opción válida...");
			}
			
		}while(opcion != 4);
		
		

	}

}
