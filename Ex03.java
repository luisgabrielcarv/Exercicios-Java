package ddd;

import java.util.Scanner;

public class Ex03 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 int b, h, multiplica��o;
    	 
    	 System.out.printf("Digite a base do tri�ngulo: ");
    	 b = ler.nextInt();
    	 
    	 System.out.printf("Digite a altura do tri�ngulo: ");
    	 h = ler.nextInt();
    	 
    	 multiplica��o = b * h / 2;
    	 
    	 System.out.printf("A �rea do tri�ngulo �: %d", multiplica��o);
    	 
    	 

     }
}

