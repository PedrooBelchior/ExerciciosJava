package ExerciciosJavaLang;

import java.util.Scanner;

public class Exercicio_I {

	private String txt, testeString, testeString2;
	
	public void Exc_I() {
		
		Scanner input = new Scanner(System.in, "ISO-8859-1");
		System.out.println("Como fazer para saber se uma String se encontra dentro de outra?"
				+ "\nDigite alguma palavra para saber se ela se encontra na frase:"
				+ "\n'Se voc� encontrar um caminho sem obst�culos, "
				+ "\n ele provavelmente n�o leva a lugar nenhum.'"
				+ "\n");
		
		String s = " Se voc� encontrar um caminho sem obst�culos, " 
					+ "ele provavelmente n�o leva a lugar nenhum. ";
		s.toLowerCase();
		
		txt = input.next();
		
		if (s.contains(txt)) {
			System.out.printf("A palavra '%s' foi encontrada na frase acima.\n",txt);
		} else {
			System.out.printf("A palavra '%s' n�o foi encontrada na frase acima.\n",txt);
		}

		
		System.out.println("\nE para tirar os espa�os em branco das pontas de uma String?"
				+ "\nUtilizamos o '.strip()':");
		
		String test = "    teste";
		System.out.printf("%s contendo espa�o no inicio\n",test);
		String semEspaco = test.strip();
		System.out.printf("%s sem espa�o no inicio\n",semEspaco);

		System.out.println("\nVerificando se uma string est� vazia ou n�o");
		
		testeString = "";
		
		if (testeString.isEmpty()) {
			System.out.println("A String est� vazia ");
		}else {
			System.out.println("A String agora n�o est� vazia");
		}
		
		System.out.println("Agora digite algo:");
		testeString2 = input.next();
		
		if (testeString2.isEmpty()) {
			System.out.println("A String est� vazia ");
		}else {
			System.out.println("A String agora n�o est� vazia");
		}

		System.out.println("\nVerifica��o de quantidade de caracteres:"
				+ "\nA frase do come�o do algoritmo possui " + s.length() + " caracteres\n");
	}

}
