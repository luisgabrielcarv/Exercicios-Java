package ddd;

import java.util.Scanner;

public class Ex04 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 int a, b, c, d;
    	 double soma;
    	 
    	 System.out.printf("Digite o primeiro valor: ");
    	 a = ler.nextInt();
    	 
    	 System.out.printf("Digite o segundo valor: ");
    	 b = ler.nextInt();
    	 
    	 System.out.printf("Digite o terceiro valor: ");
    	 c = ler.nextInt();
    	 
    	 System.out.printf("Digite o quarto valor: ");
    	 d = ler.nextInt();
    	     	


    	  soma = (a + b + c + d) / 4;
    	 
    	 System.out.printf("A m�dia aritm�tica �: %.0f", soma);
    	 
    	 

     }
}

