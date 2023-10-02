package logicOperators;

public class Ejercicios {

	public static void main(String[] args) {
		//Enrique, Paola y Mariana compran un iphone 15. Si el total de la compra supera los 25mil pesos, por lo tanto obitnenen un 10% de descuento. La tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿ Cuál sería el costo total de los equipos?¿Aplica descuento? ¿Cuál sería el costo total con descuento? ¿Cuánto pagarían mensualmente?
		
		int numTelefonos = 3;
		float desc = 0.1f;
		float precio = 19499f;
		
		float total = precio * numTelefonos;
		System.out.println("El costo total de la compra es de $" + total);
		
		
		if (total >= 25000) {
			System.out.println("\nSe aplica un descuento de " + desc*100 + "% sobre el total del costo de  $" + total);
			total = total - (total * desc);				
		}
		
		System.out.println("\nEl precio final de la compra es de $" + total);
		float MSI = total /12;
		System.out.println("\nTu compra a 12 meses sin intereses pagando mensualmente $" + MSI);

	}

}
