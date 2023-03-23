package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exe2_Pilha {
	
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);

    Stack<String> pilha = new Stack<String>();
    int opcao = -1;
    while (opcao != 0) {



    System.out.print("\n\t1 - Adicionar livro na pilha");
    System.out.print("\t2 - Listar todos os livros");
    System.out.print("\t3 - Retirar livro");
    System.out.print("\t0 - Sair");

    System.out.print("\nEscolha uma opção: ");
    opcao = scanner.nextInt();
    scanner.nextLine();
    switch (opcao) {

    case 1:
        System.out.print("\nAdicionar livro na pilha: ");
        String livro = scanner.nextLine();
        pilha.push(livro);
        System.out.println("\nLivro adicionado!\n");
        break;

    case 2:
        if (pilha.isEmpty()) {
            System.out.println("\n A pilha está vazia.");

        } else {
            System.out.println("\nLivros na pilha: ");
            for (String livro1 : pilha)
                System.out.println(livro1);
            break;
        }

    case 3:
        System.out.println("Livro retirado da pilha.");
        pilha.pop();
        System.out.println(pilha);
        break;

    case 0:
        System.out.println("\nPrograma finalizado.");
        break;
    default:
        System.out.println("\nOpção inválida!");
        break;



    }

}
	}
}
