package EstruturaSequencial;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos metros de quadrados serão pintadas?");
		float  metros = sc.nextFloat();
				
		int litros = (int) (metros/3);
		int precoL = 80;
		int capacidadeL = 18;
		int latas = litros / capacidadeL;
		int total = latas * precoL;

		System.out.println("Serão " + latas + " Latas");
		System.out.println("Cada lata possui 18L e vale 80 reais sendo um total de R$:" + total);

		
		sc.close();
	}

}
