/*package aula_04;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner scanner = new scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int somaPrincipal = 0, somaSecundaria =0;
		String diagonalPrincipal ="" , diagonalSecundaria = "";
		
		for(int iLinha = 0; iLinha < matriz.length; iLinha ++) {
			
			for(int iColuna = 0; iColuna < matriz.length; iColuna ++) {
				
				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = scanner.nextInt();
				
			}
		}
		for(int contador = 0; contador < matriz.length; contador ++) {
			
			diagonalPrincipal += matriz[contador][contador] + " ";
			somaPrincipal += matriz[contador][contador];
			
			diagonalSecundaria += matriz[contador][matriz.length - 1 - contador] + " ";
			somaSecundaria += matriz[contador][matriz.length - 1 - contador];
			
		}
	}

}
*/