package EstruturaDeDecisao;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma letra para saber se é vogal ou consoante");
		char letra = sc.nextLine().charAt(0);

		
		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
			break;
		}
		
		sc.close();
		
	}

}
