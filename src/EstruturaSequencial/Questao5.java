package EstruturaSequencial;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Metros você quer converter?");
		double metros = sc.nextDouble();
		
		double centimetros = (metros * 100);
		
		System.out.println("O valor em Centimetros é " + centimetros);
		
		sc.close();
		
	}

}
