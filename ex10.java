package ddd;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);
   	 
   	 
   	 int primeiro, segundo;
   	 
   	 System.out.printf("Digite o primeiro numero: ");
   	 primeiro = ler.nextInt();
   	 
   	 System.out.printf("Digite o segundo : ");
   	 segundo = ler.nextInt();
   	 
   	 if (primeiro>segundo) {
   	    System.out.printf("O numero maior � %d", primeiro);
   	 } 
   	 else if (primeiro<segundo) {
   	 
   		 System.out.printf("O numero maior � %d", segundo);
   	 }	 
   	 else if (primeiro==segundo) {
   		System.out.printf("Os numeros s�o identicos", primeiro, segundo);
   	 }
   		 
   	 }
   		 
   	    
   	   
   	 
   	 
   		 
   	 

   	 

   	 

   	 
   	 

    }




