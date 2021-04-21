package EstruturaSequencial;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("KG Do Peixe");
		double peso  = sc.nextDouble();
		
		double excesso = (peso - 50);
		double multa =  (excesso * 4 );
		
		System.out.println(excesso);
		System.out.println(multa);
		
		sc.close();

		
	}

}
