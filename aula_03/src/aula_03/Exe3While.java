package aula_03;

import java.util.Scanner;

public class Exe3While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int idade = 0;
        int m21 = 0;
        int m50 = 0;
        boolean continuar = true;

        while(continuar) {
            System.out.print("Digite uma  idade: ");
            idade = leia.nextInt();

            if (idade < 0) {
                System.out.println("Idade Inválida");
                continuar = false;
            }

            if(idade <= 21)
                m21 ++;

            else if (idade >= 50)
                m50 ++;
        }

        System.out.println("Menores de 21: " + m21);
        System.out.println("Maiores de 50: " + m50);
	    	 }
	}
