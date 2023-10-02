package logicOperators;

public class OperadoresLogicos {

	public static void main(String[] args) {

		/*
		 * --Operadores aritméticos (+, -, *, /,  %)
		 * --Operadores lógicos
		 * --Operadores relacionales (=, +=, -=, *=, /=, <, >, <=, >=)
		 * */
		
		int num1 = 12;
		int num2 = 4;
		
		int resultado = num1 - num2;
		System.out.println(resultado);
		
		/*Relacionales
		            = asignación
		            += asignación suma
		            -= asignación resta
		            *= asignación multiplicación
		            /= asignación división
		            == igual que
		            != distinto que
		            < menor que
		            > mayor que
		            <= menor igual que
		            >= mayor igual que
		    */
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		boolean comparacion1 = numeroUno == numeroDos;
		System.out.println(comparacion1);
		
		boolean comparacionDos = (numeroUno < numeroDos) && (numeroUno > numeroDos);
		System.out.println(comparacionDos);
		
		boolean comparacionTres = (numeroUno < numeroDos) || (numeroUno > numeroDos);
		System.out.println(comparacionTres);
		
		boolean comparacionCuatro = false;
		System.out.println(!comparacionCuatro);
	}

}
