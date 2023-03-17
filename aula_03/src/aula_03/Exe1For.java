package aula_03;

import java.util.Scanner;

public class Exe1For {
    public static void main(String[]args) {
    	
Scanner leia = new Scanner(System.in);
		
		int numeroInicial, numeroFinal;
		
		System.out.println("Inicio do intervalo:");
		numeroInicial = leia.nextInt();
		System.out.println("Fim do intervalo:");
		numeroFinal = leia.nextInt();
		
		if(numeroInicial > numeroFinal) {
			System.out.println("Intervalo inválido!");
			//para finalizar programa
			System.exit(0);			
		}	
		for(int contador= numeroInicial; contador <= numeroFinal; contador ++ ) {
			//para achar multiplos % , modulo
			if(contador%3 == 0 && contador%5 ==0)
				System.out.println(contador + "é multíplo de 5 e 3");
		}
    }
}
