package ddd;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);

		double aceleracao, veloI, temp, veloF;

		System.out.printf("Digite a acelera��o: ");
		aceleracao = ler.nextDouble();

		System.out.printf("Digite a velocidade: ");
		veloI = ler.nextDouble();

		System.out.printf("Digite o tempo:");
		temp = ler.nextDouble();
		
		veloF = veloI + (aceleracao * temp) * 3.6 ;

		if (veloF <= 40) {
			System.out.printf("Ve�culo muito lento!");
		}else if (veloF <= 60) {
			
			System.out.printf("Velocidade permitida!");
		}else if (veloF <= 80) {
			
			System.out.printf("Velocidade de cruzeiro!");
		}else if (veloF <= 120) {
			
			System.out.printf("Ve�culo r�pido!");
		}else { 
			
			System.out.printf("Ve�culo muito r�pido!");
		}

		ler.close();
	}
}