package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		
		int idade, sexo, genero=0, esporte, contador = 0,futebolFeminino=0, maiores18Volei=0, gamesTNBF=0;
		char continua = 'S';
		
		while(continua =='S') {
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		do {
			
		
		System.out.println("Digite o sexo (1-M/2-F/3-T/4-NB): ");
		sexo = leia.nextInt();
		}while(sexo<1 || sexo >4);
		
		if(sexo ==3 || sexo == 4) {
		System.out.println("Digite o G�nero com o qual se identifica(1-M/2-F)");
		genero = leia.nextInt();
		}
		System.out.println("Digite o seu esporte favorito (1-Futebol/2-Voleibol/3-Basquete:) ");
		esporte = leia.nextInt();
		
		contador ++;
		
		if(sexo == 2 && esporte ==  1)
			futebolFeminino ++;
		
		if(idade >= 18 && esporte ==  2)
			maiores18Volei ++;
		
		if(sexo== 3 || sexo ==4 && genero == 2 && esporte ==  4)
			gamesTNBF ++;
		
		genero =0;
		
		System.out.println("Deseja continuar (S/N)?");
		continua = leia.next().toUpperCase().charAt(0);
		
		}
        System.out.println("Total de Fichas preenchidas: " + contador);
        System.out.println("Total de pessoas de sexo feminio que gostam de futebol:" + futebolFeminino);
        System.out.println("Total de pessoas maiores de 18 anos que gostam de VoleiBol:" + maiores18Volei );
        System.out.println("Total de pessoas Trans e N�o Bin�rias que se identificam com o genero feminos e gostam de games:"+ gamesTNBF);
	}

}
