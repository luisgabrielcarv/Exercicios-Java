package ddd;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);
   	 
   	 
   	 double tri, valor1, valor2, valor3;
   	 
   	 System.out.printf("Digite o primeiro valor: ");
   	 valor1 = ler.nextDouble();
   	 
   	 System.out.printf("Digite o segundo valor : ");
   	 valor2 = ler.nextDouble();
   	 
   	 System.out.printf("Digite o terceiro valor: ");
   	 valor3 = ler.nextDouble();

   	
   	 
   	 
   	 
   	 
   	 
   	 
   	 if ((valor1 != valor2) && (valor2 != valor3)) {
   		System.out.printf("Seu triangulo � escaleno");
   	}else if ((valor1 == valor2) && (valor2 != valor3)) {
   		System.out.printf("Seu triangulo � is�sceles");
   	}else {
   		System.out.printf("Seu triangulo � equilatero");
   		
   			
   	}
   	
   	 
   	 
   	 
    }



}


    
   		
   	
   	
   	
    
    
    
    
    
    
    
    
   	
    
    
   		



   	 

    
    
   	
   	
    
    