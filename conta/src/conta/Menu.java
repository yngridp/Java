package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		// tipo da agencia, numero da gencia
		Conta c1 = new Conta (1, 123, 1, "Yngrid Padilha", 100000.00f);
		//metodo visualizar para mostrar todos os dados
		c1.visualizar();
		//get mostra valor de uma propriedade especifica
		System.out.println("Saldo da conta" + c1.getSaldo());
		//consertar o nome // alterar dado
		c1.setTitular("Yngrid Padilha dos Santos");
		
		c1.visualizar();
		
		c1.sacar(1000.0f);
		c1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a op��o desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro come�a aqui!");
				//sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				System.out.println("Digite o Numero da Ag�ncia: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 : {
					System.out.println("Digite o Limite de Cr�dito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 : {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por n�mero\n\n");

				System.out.println("Digite o n�mero da conta: ");
				numero = leia.nextInt();

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				System.out.println("Digite o n�mero da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection
				System.out.println("Digite o Numero da Ag�ncia: ");
                agencia = leia.nextInt();
                System.out.println("Digite o Nome do Titular: ");
                leia.skip("\\R?");
                titular = leia.nextLine();

                System.out.println("Digite o Saldo da Conta (R$): ");
                saldo = leia.nextFloat();

                // retornar tipo

                switch (tipo) {
                case 1 : {
                    System.out.println("Digite o Limite de Cr�dito (R$): ");
                    limite = leia.nextFloat();

                    // criar o objeto conta corrente
                }
                case 2 : {
                    System.out.println("Digite o dia do Aniversario da Conta: ");
                    aniversario = leia.nextInt();

                    // criar o objeto conta poupanca

                }
                default : {
                    System.out.println("Tipo de conta inv�lido!");
                }
                }

                // fim do condicional buscar na collection
                System.out.println("Digite o Numero da Conta de Origem: ");
                numero = leia.nextInt();
                System.out.println("Digite o Numero da Conta de Destino: ");
                numeroDestino = leia.nextInt();

                do {
                    System.out.println("Digite o Valor da Transfer�ncia (R$): ");
                    valor = leia.nextFloat();
                } while (valor <= 0);
		}
	}

}
}