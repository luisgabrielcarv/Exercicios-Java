package ddd;

import java.util.Scanner;

public class Ex19 {
     public static void main(String[] args) {
       	 
    	 Scanner ler = new Scanner(System.in);
    	 
    	 double media, p1, p2;
    	 
    	 System.out.printf("Digite o valor da p1:");
    	 p1 = ler.nextDouble();
    	 
    	 System.out.printf("Digite o valor da p2:");
    	 p2 = ler.nextDouble();
    	 
    	 media = (p1 + p2 * 2) / 3;
    	 
    	 if (media >= 5) {
    		 System.out.printf("Voc� foi aprovado!");
    		 
    	 }else { 
    		 System.out.printf("Voc� foi reprovado.");
    	 }
     }
}
