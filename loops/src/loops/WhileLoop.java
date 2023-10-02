package loops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * While. El ciclo while ejecuta continuamente un bloque de código hasta que se cumpla 
		 * while (expresion) {
		 * //Bloque de código
		 * (contador-itarador)
		 * }
		 * */
		
		/*int cuenta = 1;
		
		while (cuenta < 11) {
			System.out.println("La cuenta es de " + cuenta);
			cuenta++;
		}*/
		
		//Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.print("Escribe un número entero el cual será el final de la cuenta: ");
		int numero = scan.nextInt();
		
		
		int dato = 1;
		
		while (dato <= numero ) {
			System.out.println(dato);
			dato++;
		}
		
				
		scan.close();	

	}

}
