
public class SequenciaDeNumeros {
	
	/**
	 * �nico m�todo de execu��o.
	 */

	public static void executra() {

		System.out.println("Sequencia de n�meros");
		int a = 50;
		int impar = 0;
		int par = 0;

		for (int i = 1; i <= a; i += 2) {

			impar += i;
		}
		for (int i = 0; i <= a; i += 2) {

			par += i;
		}

	
		double temp = par - impar;
		double temp2 = temp;

		System.out.println(temp);

		while (temp > 1) {

			temp2 = temp2 * (temp - 1);

			temp--;
			

		}

		System.out.println("[1 50]" + temp2);
	}

}
