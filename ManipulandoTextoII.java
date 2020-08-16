import javax.swing.JOptionPane;

public class ManipulandoTextoII {

	/**
	 * Método principal execução do desafio.
	 */

	public static void executar() {

		System.out.println("Manipulando TextoII");
		String mensagem = JOptionPane.showInputDialog("Digite o texto: ");

		String[] palavras = palavras = mensagem.split(" ");
		System.out.println("Total de palavras: " + palavras.length);

	}

}
