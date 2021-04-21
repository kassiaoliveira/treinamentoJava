package EstruturaSequencial;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual sua altura?");
		double altura = sc.nextDouble();
		
		System.out.println("O Peso ideal para homem é " + ((72.7*altura) - 58));
		System.out.println("O Peso ideal para mulher é " + ((61.1*altura) - 44.7));

		
		sc.close();

	}

}
