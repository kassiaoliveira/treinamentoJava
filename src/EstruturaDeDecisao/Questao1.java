package EstruturaDeDecisao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int numA = sc.nextInt();
		System.out.println("Digite um segundo n�mero");
		int numB = sc.nextInt();
		
		
		if (numA > numB) {
			System.out.println("O Maior n�mero � o primeiro digitado");
		} else 
			System.out.println("O Maior n�mero � o segundo digitado");
		
		sc.close();

	}

}
