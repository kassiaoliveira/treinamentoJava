package EstruturaSequencial;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o 1? N?mero:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o 2? N?mero:");
		int num2 = sc.nextInt();
	
		System.out.println("A soma dos dois n?meros ? " + (num1 + num2));
		
		sc.close();
	}

}
