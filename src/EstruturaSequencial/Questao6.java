package EstruturaSequencial;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Qual o raio do cícrulo?");
		double raio = sc.nextDouble();
		
		double area = ( Math.PI * Math.pow(raio, 2));
		
		System.out.println("A area do circulo é " + area);
		
		sc.close();
		
	}
}
