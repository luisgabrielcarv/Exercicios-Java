package ddd;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	   	 Scanner ler = new Scanner(System.in);
	   	 
	   	 
	   	
		double base, altura , op;
	   	 
	   	 System.out.printf("Digite a base do ret�ngulo: ");
	   	 base = ler.nextDouble();
	   	 
	   	 System.out.printf("Digite a altura do ret�ngulo : ");
	   	 altura = ler.nextDouble();
	   	 
	   	 op = base*altura;
	   	 
	   	 
	   	 if (op>100) {
	   	    System.out.printf("Terreno grande", op);
	   	 } 
	   	 else   {
	   	 
	   		 System.out.printf("Terreno pequeno", op);
	   	 }	 
	   	 
	   	 }
}
