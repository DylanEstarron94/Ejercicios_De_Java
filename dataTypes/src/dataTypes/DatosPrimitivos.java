package dataTypes;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*
		 * Datos primitivos: Datos fundamentales en Java que sirven  para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, double, boolean, char
		 * 		 * 
		 */
		
		//Vmin y Vmax
		//byte age = 127;
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		System.out.println("El valor mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);		
		
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		char maxChar = Character.MAX_VALUE;
		char minChar = Character.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de char es: " + minChar);
		System.out.println("El valor máximo de char es: " + maxChar);
		
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de int es: " + minInt);
		System.out.println("El valor máximo de int es: " + maxInt);
		
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de long es: " + minLong);
		System.out.println("El valor máximo de long es: " + maxLong);
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de float es: " + minFloat);
		System.out.println("El valor máximo de float es: " + maxFloat);
		
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		
		System.out.println("\nEl valor mínimo de double es: " + minDouble);
		System.out.println("El valor máximo de double es: " + maxDouble);
		
			
		/*long isbn = 9784499169019L;	
		System.out.println(isbn);
		
		float salario = 25000f;
		System.out.println(salario);
		
		double ISR = 1958.256d;
		System.out.println(ISR);*/
		
		char valorChar1 = 'x';
		char valorChar2 = 'a';
		
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		/*Casteo (Conversión de tipos en Java).
		 * -- Automático (dato más pequeño a un dato más grande).
		 * -- Manual (tipo de dato mas grande a tipo de dato más pequeño).
		 * 
		 * */
		
		
		//Automatico
		int myNumber = 1245;
		double myCasting = myNumber;
		System.out.println(myNumber);
		
		//Manual
		int myNewCasting =  (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
	}

}
