package EstruturaSequencial;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos metros de quadrados serão pintadas?");
		float  metros = sc.nextFloat();
				
		double litrosL = (int) (metros/3);
		double precoL = 80;
		double capacidadeL = 18;
		int latas = (int) (litrosL / capacidadeL);
		int totalLatas = (int) (latas * precoL);
		
		double litrosGalao = (int) (metros/6);
		double precoGalao = 25;
		double capacidadeGalao = 3.6;
		int galao= (int) (litrosGalao / capacidadeGalao);
		int totalGalao = (int) (galao * precoGalao);

		System.out.println("Serão " + latas + " Latas");
		System.out.println("Cada lata possui 18L e vale 80 reais sendo um total de R$:" + totalLatas);
		System.out.println("Serão " + galao + " Latas");
		System.out.println("Cada galão posui 3.6L e vale 25 reais sendo um total de R$:" + totalGalao);

		sc.close();
	}

}
