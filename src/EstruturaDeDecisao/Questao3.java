package EstruturaDeDecisao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu g�nero F ou M ?");
		char letra = sc.nextLine().charAt(0);
				
		if (letra == 'F' || letra == 'f') {
			System.out.println("G�nero Feminino");
		} else if (letra == 'M' || letra == 'm') {
			System.out.println("G�nero Masculino");
		} else {
			System.out.println("G�nero invalido");
		}
		
		sc.close();
	}

}
