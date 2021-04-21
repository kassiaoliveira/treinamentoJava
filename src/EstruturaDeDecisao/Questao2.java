package EstruturaDeDecisao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		double num = sc.nextDouble();
		
		if (num > 0) {
			System.out.println("Número é positivo");
		} else {
			System.out.println("Número é negativo");
		}
		sc.close();
	}

}
