package EstruturaSequencial;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro");
		int num1 = sc.nextInt();
		
		System.out.println("Digite um segundo número inteiro");
		int num2 = sc.nextInt();
		
		System.out.println("Digite um número Real");
		double num3 = sc.nextDouble();
		
		System.out.println("O Produto do primeiro com metade do segundo: " + (num1* (num2/2)));
		System.out.println("A Soma do Triplo do Primeiro com o Terceiro: " + ((num1* 3) + num3));
		System.out.println("O terceiro elevado ao cubo: " + Math.pow(num3, 3));
		
		sc.close();
	}

}
