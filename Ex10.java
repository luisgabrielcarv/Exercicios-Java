package ddd;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);
   	 
   	 
   	 int primeiro, segundo;
   	 
   	 System.out.printf("Digite o primeiro numero: ");
   	 primeiro = ler.nextInt();
   	 
   	 System.out.printf("Digite o segundo : ");
   	 segundo = ler.nextInt();
   	 
   	 if (primeiro>segundo) {
   	    System.out.printf("O numero maior é %d", primeiro);
   	 } 
   	 else if (primeiro<segundo) {
   	 
   		 System.out.printf("O numero maior é %d", segundo);
   	 }	 
   	 else if (primeiro==segundo) {
   		System.out.printf("Os numeros são identicos", primeiro, segundo);
   	 }
   		 
   	 }
   		 
   	    
   	   
   	 
   	 
   		 
   	 

   	 

   	 

   	 
   	 

    }




