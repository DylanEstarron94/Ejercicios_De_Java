package dataTypes;

public class DatosEstructurados {
	
	public static void main (String[] args) {
		/*
		         * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de 
				   dato primitivo
		         * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra 
					  reservada String. Los String en Java se consideran objetos
		         * -- Arrays.
		         * -- Creados por el usuario (API Java)
		*/
		
		String myString = "Hola, soy un String";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		//Métodos para Strings
		
		//-- String length. Método que permite medir la longitud de una cadena de caracteres
		String texto = "oiusdajksdnyuagsnas";	
		System.out.println("\nLa longitud de mi texto es de: " + texto.length());
		
		//--String: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("\nAplicando el método toupperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("\nAplicando el método tolowerCase: " + lowerCase);
		
		// --idnexOf(). Devuelve el índice de la primera aparición de un texto específico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal");
		System.out.println("\nla palabra 'temporal' inicia en el índice: " + indexOf);
		
		// --Concatenación
		String nombre = "Dylan";
		String apellido = "Estarrón";
		
		String usuario = nombre + " " + apellido;
		System.out.println(usuario);
		
		System.out.println(nombre.concat(" " + apellido));
		
		// --Métodos de conversión o parseo
		String presupuesto = "5000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int presupuestoInt = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + presupuestoInt + " que ahora es de tipo " + ((Object)presupuestoInt).getClass().getSimpleName());
		
		/*
		 * Arrays. conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corresponde a una posición identificada por índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		 *  
		 * */
		System.out.println("\n\n");
		String[] autos = {"VolksWagen", "Kia", "Ford", "Tata", "Chevrolet", "koenigsegg"};
		System.out.println(autos);
		System.out.println("\n\n");
 		
		
		/*
		         * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		         * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		         * -- Arrays.
		         * -- Creados por el usuario (API Java)
		*/
		
		//Variables dinámicas
		float gastosMensuales = 35684.254f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 55684.254f;
		System.out.println(gastosMensuales);
		
		//Variables finales o constantes
		final int nomina = 25000;
		System.out.println(nomina);
		
	}

}
