package EstruturaSequencial;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o valor da base?");
		double base = sc.nextDouble();
		
		System.out.println("Qual o valor da Altura");
		double altura = sc.nextDouble();
		
		double area = (base * altura) * 2;
		
		System.out.println("O Dobro da area do quadro é " + area);
		
		sc.close();

	}

}
