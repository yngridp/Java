package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		// para cadastrar, apagar, atualizar um crud
		Scanner scanner = new Scanner(System.in);
		// new para instanciar objeto
		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1-Cadastrar nota");
			System.out.println("2-Listar todas as nota");
			System.out.println("3-Buscar uma nota");
			System.out.println("4-Remover nota");
			System.out.println("5-Atualizar uma nota");
			System.out.println("6-Sair");

			opcao = scanner.nextInt();
//ctrl + shift +f arruma codigo
			switch (opcao) {

			case 1:
				System.out.println("Cadastrar nota");
				System.out.println("Digite uma nota:");
				//nota = scanner.nextDouble();
				
				notas.add(scanner.nextDouble());//adicona na coletion

				break;
			case 2:
				System.out.println("Listar nota");
				//tipo do dado ou var : array da coletion
				if(notas.isEmpty()) {
					System.out.println("Não existem notas cadastradas!");
					
				}else {
				for(Double eNota : notas)
					System.out.println(eNota);
				}

				break;
			case 3:
				System.out.println("Buscar nota");
				System.out.println("Digite uma nota: ");
				nota = scanner.nextDouble();
				
				if(notas.contains(nota))
					System.out.println("A nota está localizada na posição:"+ notas.indexOf(nota));
				else
					System.out.println("A nota não foi encontada!");
				
				break;
			case 4:
				System.out.println("Remover uma nota");
				System.out.println("Digite uma nota: ");
				nota = scanner.nextDouble();
				
				notas.remove(nota);

				break;
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = scanner.nextDouble();
				System.out.println("Digite a nova nota: ");
				Double novaNota = scanner.nextDouble();
				
				notas.set(notas.indexOf(nota), novaNota);

				break;
			default:
				if(opcao > 6)
					System.out.println("Opção Inválida!");
			}
		} while (opcao != 6);
		scanner.close();
	}

}
//do while para repretir o codigo todo
//swicth para ter a opcao de digitar 1,2,3,4,5, e o if para opção invalida
// dentro de cada caso fazer uma operação
