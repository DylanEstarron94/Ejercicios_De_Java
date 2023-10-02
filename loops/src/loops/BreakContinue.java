package loops;

public class BreakContinue {

	public static void main(String[] args) {
		/**
		 * Sentencias utilizadas en loops:
		 * --break. Se utiliza para salir de un bucle en un punto específico
		 * --Continuo. Interrumpo
		 * 
		 * */
		
		//Super ozzito va a realizar una rifa en la cual el cliente numero 5 se ganará una coca-cola de bolsita
		for(int cliente = 1; cliente <= 20; cliente++) {
				
			if(cliente == 5) {
				System.out.println("Eres el cliente número" + cliente + ", te ganaste una coquita en bolsa.");
				continue;
			}
			
			System.out.println("cliente numero" + cliente);
					
		}

	}

}
