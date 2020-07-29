package ExerciciosJavaLang;

public class Exercicio_II {

	public void Exc_II() {

		System.out.println("Imprimindo uma string, linha por linha:");
		String txt = "teste";
		printCaracter(txt);
		System.out.println("\n");

	}

	public static void printCaracter(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}
}
