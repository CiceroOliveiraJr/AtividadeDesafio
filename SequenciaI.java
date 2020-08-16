import javax.swing.JOptionPane;

public class SequenciaI {
	/**
	 * Método principal execução do desafio.
	 */

	public static void executar() {

		Double temp = (double) 0;
		Double expressao = (double) 0;
		String mensagem = JOptionPane.showInputDialog("Digite o valor: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);

		System.out.println("SequencialI");

		for (int i = 1; i <= valor; i++) {

			temp = temp + ((valor - i) / (i + 1));

		}

		expressao = valor + temp;

		System.out.println("Entrada: " + valor + " Saída: " + expressao);

	}

}
