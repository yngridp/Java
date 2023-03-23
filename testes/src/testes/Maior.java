package testes;

import java.util.Scanner;

public class Maior {
     public static void main(String []args) {
    	 
    	 int n1, total;
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("Digite um numero:");
    	 n1 = scanner.nextInt();
    	 
    	 
    	 if(n1 > 0) {
    		 total = n1*2;
    		 System.out.println( total);
    	 }
    	 else{
    		 System.out.println("O numéro é invalido!"); 
    	 }
    	 
     }
}
