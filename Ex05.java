package ddd;

import java.util.Scanner;

public class Ex05 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 
    	 double c, multiplica��o;
    	 
    	 System.out.printf("Digite a temperatura em celsius: ");
    	 c = ler.nextDouble();
    	 

    	 
    	 multiplica��o = (c * 1.8) + 32;
    	 
    	 System.out.printf("A temperatura em fahrenheit �: %.2f", multiplica��o);
    	 
    	 

     }
}

