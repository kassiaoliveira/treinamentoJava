package EstruturaSequencial;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horasTrabalhahdas = sc.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhahdas ;
		double descontoIR =  ( (11.0/100) * salarioBruto);
		double inss =  ( (8.0/100) * salarioBruto);
		double sindicato = ( (5.0/100) * salarioBruto);
		
		System.out.println("Salario Bruto ser: " + salarioBruto);
		System.out.println("O Desconto de 11% do IR será de : " + descontoIR);
		System.out.println("O Desconto de 8% do INSS será de: " + inss );
		System.out.println("O Desconto de 5% do Sindicato será de : " +  sindicato);
		System.out.println("Seu salario liquido será : " + ( salarioBruto - descontoIR - inss - sindicato));

			
		sc.close();

	}

}
