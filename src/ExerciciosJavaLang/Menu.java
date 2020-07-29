package ExerciciosJavaLang;

import java.util.Scanner;

public class Menu {
	
	 public static void main(String[] args) {
		 
	        Scanner input = new Scanner(System.in, "ISO-8859-1");
	        int op;
	        do {
	        	System.out.println(
	        			  "| ************************************ |"
	        			+ "\n| ------------------------------------ |"
	        			+ "\n|        EXERCICIOS JAVA LANG          |"
	        			+ "\n|    Digite o numero correspondente    |"
	        			+ "\n|             a cada funcao:           |"
	        			+ "\n| ------------------------------------ |"
	        			+ "\n|   1.Exercicio I     2.Exercicio II   |"
	        			+ "\n|   3.Exercicio III   4.Exercicio IV   |"
	        			+ "\n|       Digite 0 para encerrar         |"
	        			+ "\n| ************************************ |"
	        			+ "\n");
	        	
	        		op = input.nextInt();
	        		switch (op) {
	                case 1:
	                    Exercicio_I ex1 = new Exercicio_I();
	                    ex1.Exc_I();
	                    break;

	                case 2:
	                    Exercicio_II ex1_2 = new Exercicio_II();
	                    ex1_2.Exc_II();
	                    break;

	                case 3:
	                    Exercicio_III ex1_3 = new Exercicio_III();
	                    ex1_3.Exc_III();
	                    break;

	                case 4:
	                    Exercicio_IV ex1_4 = new Exercicio_IV();
	                    ex1_4.Exc_IV();
	                    break;
	                   
	                case 0:
	                    System.out.println("\n"
	                    		+ "| ************************************ |"
	                    		+ "\n|         ＼(^o^)／    	＼(^o^)／                |"
	                    		+ "\n|   Algoritmo feito por Pedro Araujo   |"
	                    		+ "\n|   Obrigado por utilizar o algoritmo  |"
	                    		+ "\n|             Volte Sempre!            |"
	                    		+ "\n| ************************************ |"
	                    		+ "\n");
	                    break;

	                default:
	                	System.out.println("\n"
	                    		+ "\n| ****************************************** |"
	                    		+ "\n|        ¯\\_( ͡° ͜ʖ ͡°)_/¯ ¯\\_( ͡° ͜ʖ ͡°)_/¯       |"
	                    		+ "\n|            Essa opção é inválida           |"
	                    		+ "\n|   Insira uma opção válida para prosseguir  |"
	                    		+ "\n| ****************************************** |"
	                    		+ "\n");

	            }
	        } while (op != 0);
	 	}
	 }