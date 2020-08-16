import javax.swing.JOptionPane;

public class Fibonacci {

	/**
	 * Método de chamada para a exercusão Fibonacci.
	 */
	public static void executar() {

		System.out.println("Fibonacci");
		String mensagem = JOptionPane.showInputDialog("Digite a quantidade de saída: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);
		
		for(int i = 1; i <= valor; i++) {
			
			System.out.println(metodo(i));
		}

	}

	/**
	 * Método de execução da lógica fibonacci
	 * @param n valores da equação
	 * @return retorno do valor para o método executar
	 */
	public static int metodo(int n) {
		if (n == 1 || n == 2) {
			
			return 1;
		}else {
			
			return metodo(n-1) + metodo(n-2); 
		}
}
}


