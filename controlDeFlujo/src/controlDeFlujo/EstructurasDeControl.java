package controlDeFlujo;

import java.util.Scanner;

public class EstructurasDeControl {//Debe de coincidir la clase con el nombre de nuestro documento

	public static void main(String[] args) {//Todo dentro del método main
		
		//Recordar que para que algo se ejecute, siempre debe de ir dentro del método principal
		
		//Primero defrinir una variable del tipo String donde alamceno un dato
		String citaProgramada =  "28/09/23"; //Dejamos en null y después lo cambiamos a una fecha "28/09/23"
		//La variable declarada, se inicia en null a propósito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if(citaProgramada != null) {
			System.out.println("Ya hay una cita programada, ahí dispense uste'...");//Porque la variable ya está ocupada o lleva
		}
		else {
			System.out.println("Puede registrar cita");//Podemos registrar otra cita o una cita
			
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
		
		//Seleccionando una opción y almacenado la variable opción
		
		
		int opcion = 1;
		
		//Creamos un menú
		System.out.println("Menú de consultorio dental El diente feliz:");
		System.out.println("1. Programar cita");
		System.out.println("2. Verificar cita programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Reprogramar cita");
		System.out.println("5. Salir del menú");
		System.out.println("Seleccione una opción del menú: ");
		
		switch (opcion){
		case 1:
			System.out.println("Opción para programar cita, seleccione la fecha y hora de su cita: ");
			break;
			
		case 2:
			System.out.println("Verifique su cita programada: ");
			break;
			
		case 3:
			System.out.println("Su cita ha sido cancelada...");
			break;
			
		case 4:
			System.out.println("Su cita se reprogramó...");
			break;
			
		case 5:
			System.out.println("Ha salido del menú, vuelva pronto.");
			break;
			
			default:
				System.out.println("Seleccionaste una opción incorrecta...");
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
		/*int x = 20, y = 22;
		
 		// variable  comparacion  if  opcion true    opcion false
		int mayor   =   (x>y)      ?       x       :       y;		
		System.out.println(mayor);*/
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la edad del paciente: ");
		int edad = scan.nextInt();
		scan.close();
		boolean mayorEdad = (edad >= 18)?true:false; //resultado = (condicion)?valor1:valor2;
		if (mayorEdad) {
			System.out.println("Su chamaco ya puede votar");
		} else {
			System.out.println("Su morro todavia no puede votar");
		}

		System.out.println("La edad del paciente es de : " + edad);
		
		String mayorDeEdad = (edad >= 18) ? "mayor de edad" : "menor de edad" ;
		System.out.println(mayorDeEdad);

	}//cierra main
}//Cierra clase
