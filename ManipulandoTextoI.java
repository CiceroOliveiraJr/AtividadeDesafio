import javax.swing.JOptionPane;

public class ManipulandoTextoI {

		/**
		 * Método principal execução do desafio.
		 */
		public static void executar() {
	
			System.out.println("Manipulando TextoI");
			String mensagem = JOptionPane.showInputDialog("Digite o texto: ");
			mensagem = mensagem.toLowerCase();
			int cont = 0;
			
			for(int i=0; i < mensagem.length(); i++) {
				
							
				if(mensagem.charAt(i)=='a') {
					
					cont++;
					
				}
			} 
			System.out.println("Total de A: " + cont);
		
	}

}
