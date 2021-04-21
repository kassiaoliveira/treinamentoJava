package EstruturaSequencial;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Qual a temperaatura em Fahrenheit?");
		double F = sc.nextDouble();
		
		double C = (5 *((F-32)/9) );
		
		System.out.println("A temperatura em Celsius é: " + C);
	
		sc.close();
	}

}
