package EstruturaSequencial;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Qual o raio do c�crulo?");
		double raio = sc.nextDouble();
		
		double area = ( Math.PI * Math.pow(raio, 2));
		
		System.out.println("A area do circulo � " + area);
		
		sc.close();
		
	}
}
