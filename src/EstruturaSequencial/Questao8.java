package EstruturaSequencial;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o valor da hora trabalhada?");
		float hrTabalhada = sc.nextFloat();
		
		System.out.println("Quantas horas trabalhou por m�s");
		int qtdHrTabalhada = sc.nextInt();
		
		float salario = (hrTabalhada * qtdHrTabalhada);
		
		System.out.println("Salario do m�s vai ser " + salario);
		
		sc.close();

	}

}
