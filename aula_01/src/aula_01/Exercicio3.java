package aula_01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
    
		Scanner leia= new Scanner(System.in);
		
		float  salarioBruto, adicionalNoturno, horasExtras, descontos,salarioLiquido;
		
		System.out.print("Digite o Sal�rio Bruto: ");
        salarioBruto = leia.nextFloat();

        System.out.print("Digite o Adicional Noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Digite as Horas Extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Digite os Descontos: ");
        descontos = leia.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras *5) - descontos;
        System.out.println("Sal�rio L�quido: " + salarioLiquido);

        leia.close();
        
	}
}
