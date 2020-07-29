package ExerciciosJavaLang;

import java.util.Scanner;

public class Exercicio_I {

	private String txt, testeString, testeString2;
	
	public void Exc_I() {
		
		Scanner input = new Scanner(System.in, "ISO-8859-1");
		System.out.println("Como fazer para saber se uma String se encontra dentro de outra?"
				+ "\nDigite alguma palavra para saber se ela se encontra na frase:"
				+ "\n'Se você encontrar um caminho sem obstáculos, "
				+ "\n ele provavelmente não leva a lugar nenhum.'"
				+ "\n");
		
		String s = " Se você encontrar um caminho sem obstáculos, " 
					+ "ele provavelmente não leva a lugar nenhum. ";
		s.toLowerCase();
		
		txt = input.next();
		
		if (s.contains(txt)) {
			System.out.printf("A palavra '%s' foi encontrada na frase acima.\n",txt);
		} else {
			System.out.printf("A palavra '%s' não foi encontrada na frase acima.\n",txt);
		}

		
		System.out.println("\nE para tirar os espaços em branco das pontas de uma String?"
				+ "\nUtilizamos o '.strip()':");
		
		String test = "    teste";
		System.out.printf("%s contendo espaço no inicio\n",test);
		String semEspaco = test.strip();
		System.out.printf("%s sem espaço no inicio\n",semEspaco);

		System.out.println("\nVerificando se uma string está vazia ou não");
		
		testeString = "";
		
		if (testeString.isEmpty()) {
			System.out.println("A String está vazia ");
		}else {
			System.out.println("A String agora não está vazia");
		}
		
		System.out.println("Agora digite algo:");
		testeString2 = input.next();
		
		if (testeString2.isEmpty()) {
			System.out.println("A String está vazia ");
		}else {
			System.out.println("A String agora não está vazia");
		}

		System.out.println("\nVerificação de quantidade de caracteres:"
				+ "\nA frase do começo do algoritmo possui " + s.length() + " caracteres\n");
	}

}
