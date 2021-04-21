package EstruturaDeDecisao;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno");
		double notaA = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno");
		double notaB = sc.nextDouble();
		
		double media = notaA + notaB /2;
		
		if (media >= 7 || media <= 9.9) {
			System.out.println("Aprovado");
		} else if(media < 7){
			System.out.println("Reprovado");
		} else{
			System.out.println("Aprovado sem Distinção");
		}
		
		sc.close();
			}

}
