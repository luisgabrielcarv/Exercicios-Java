package ddd;

import java.util.Scanner;

public class Ex06 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 
    	 double c, multiplica��o;
    	 
    	 System.out.printf("Digite o valor em d�lar: ");
    	 c = ler.nextDouble();
    	 

    	 
    	 multiplica��o = c / 5.04;
    	 
    	 System.out.printf("Convertido em reias fica: %.2f", multiplica��o);
    	 
    	 

     }
}

