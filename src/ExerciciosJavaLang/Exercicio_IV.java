package ExerciciosJavaLang;

public class Exercicio_IV {
	public void Exc_IV() {
		
		String s = "762";
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int digit = ((int) s.charAt(i) & 0xF);
			for (int j = 0; j < s.length() - 1 - i; j++) {
				digit *= 10;
			}
			result += digit;
		}

		System.out.printf("\n '%d' convertido para int"
				+ "\n",result);
	}
}
