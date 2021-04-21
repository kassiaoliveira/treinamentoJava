package EstruturaSequencial;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual sua altura?");
		double altura = sc.nextDouble();
		
		System.out.println("Seu peso ideal é " + ((72.7*altura) - 58));
		
		sc.close();

	}

}
