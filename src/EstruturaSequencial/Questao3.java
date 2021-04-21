package EstruturaSequencial;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o 1° Número:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o 2° Número:");
		int num2 = sc.nextInt();
	
		System.out.println("A soma dos dois números é " + (num1 + num2));
		
		sc.close();
	}

}
