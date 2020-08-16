
public class RainhaEOMonge {

	/**
	 * Único método de execução do desafio  
	 */
	public static void executar() {

		Double qtd = (double) 1;
		Double soma = null;

		System.out.println("Rainha e o Monge");
		
		for (int i = 1; i <= 64; i++) {
			if (i == 1) {

				System.out.println("Casa: " + i + "- Qtd: " + qtd + "- Soma: " + i);
				
			} else {

				qtd = qtd * 2;
				soma = qtd + (qtd - 1);

				System.out.println("Casa: " + i + " - Qtd: " + qtd + " - Soma: " + soma);
			}
		}

	}

}
