package ExerciciosJavaLang;

public class Exercicio_III {
	
	public void Exc_III() {

		System.out.println("Imprimindo uma string, ao contrario");
		String txt = "Socorram-me, subi no ônibus em Marrocos";
		printCaracterInverso(txt);
		String txt2 = "anotaram a data da maratona";
		printCaracterInverso(txt2);
		System.out.println("\n");

	}

	public static void printCaracterInverso(String palavra) {
		for (int i = palavra.length(); i > 0; i--) {
			System.out.print(palavra.charAt(i - 1));
		}
	}
}
