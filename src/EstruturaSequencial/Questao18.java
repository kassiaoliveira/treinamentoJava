package EstruturaSequencial;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual tamanho do arquivo em MB?");
		double mb = sc.nextDouble();
		
		System.out.println("Qual velocidade da internet em Mbps");
		double mbps = sc.nextDouble();
		
		double downloadEmSegundos = mb /(mbps/8);
		double downloadEmHoras = downloadEmSegundos / 3600;
		
		System.out.println("O tempo em segundos será " + downloadEmSegundos);
		System.out.println("O tempo em hora é" + downloadEmHoras);
		
		sc.close();

	}

}
