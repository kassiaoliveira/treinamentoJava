package EstruturaSequencial;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1° Nota:");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a 2° Nota:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a 3° Nota:");
		float nota3 = sc.nextFloat();
		System.out.println("Digite a 4° Nota:");
		float nota4 = sc.nextFloat();
		
		float media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.println("A Média do Aluno é " + media);

		sc.close();
	}

}
