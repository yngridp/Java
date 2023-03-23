package aula_04;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float [][] matriz = new float [2][4];
		float [] media = new float [2];
		float soma = 0.0f;
		//i linha j coluna
		for(int i=0; i < matriz.length; i++) {
			// length verá quantos de linhas qquando são iguais
			//quando não é igual colocar [linhas].length
			for(int j=0; j < matriz[i].length; j++) {
				//printf mostra saída formatada 
				System.out.printf("Digite a %dº nota do %dº participante ", j + 1, i +1);
			    matriz[i][j] = scanner.nextFloat();
			    
			    soma += matriz[i][j] = scanner.nextFloat();
			}
			media[i] = soma/matriz[i].length;
			//f de float para não confundir com double
			//soma zerada para não somar com a soma do participante anterior
			soma = 0.0f;
		}
		for(float nota : media) {
			System.out.println(nota);
		}

	}

}
