import javax.swing.JOptionPane;

public class Fibonacci {

	/**
	 * M�todo de chamada para a exercus�o Fibonacci.
	 */
	public static void executar() {

		System.out.println("Fibonacci");
		String mensagem = JOptionPane.showInputDialog("Digite a quantidade de sa�da: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);
		
		for(int i = 1; i <= valor; i++) {
			
			System.out.println(metodo(i));
		}

	}

	/**
	 * M�todo de execu��o da l�gica fibonacci
	 * @param n valores da equa��o
	 * @return retorno do valor para o m�todo executar
	 */
	public static int metodo(int n) {
		if (n == 1 || n == 2) {
			
			return 1;
		}else {
			
			return metodo(n-1) + metodo(n-2); 
		}
}
}


