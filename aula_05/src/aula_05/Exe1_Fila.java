package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe1_Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
        	
        	//Menu de fila:
        	System.out.print("*************************************************");
            System.out.println("\n\t1 - Adicionar cliente na fila");
            System.out.println("\t2 - Listar clientes na fila");
            System.out.println("\t3 - Chamar próximo cliente");
            System.out.println("\t0 - Sair");
            System.out.print("\n*************************************************");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
            
            //Opções após a primeira escolha:
            
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    fila.add(nomeCliente);
                    System.out.println("\nCliente adicionado!\n");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\n Fila vazia.");
                    } else {
                    	System.out.print("\n********");
                        System.out.println("\nClientes na fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nFila vazia.");
                    } else {
                        String proximoCliente = fila.poll();
                        System.out.println("Chamando cliente " + proximoCliente);
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado.");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }
        scanner.close();
    }

}
