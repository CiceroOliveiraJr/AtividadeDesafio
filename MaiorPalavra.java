import javax.swing.JOptionPane;

public class MaiorPalavra {
	
	/**
	 * �nico m�todo de execu��o do desafio.
	 */

	public static void executar() {
		System.out.println("Maior Palavra");
		String mensagem = JOptionPane.showInputDialog("Digite sua frase: ");

		String[] frase = mensagem.split(" ");

		String maiorPalavra = "";

		for (String frases : frase) {

			if (frases.length() > maiorPalavra.length()) {

				maiorPalavra = frases;

			}

		}

		System.out.println("Maior palavra: " + maiorPalavra);

	}

}
