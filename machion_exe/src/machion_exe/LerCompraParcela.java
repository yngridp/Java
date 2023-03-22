package machion_exe;

import java.util.Scanner;

public class LerCompraParcela {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double vCompra;
		int parc;
		//machion
		System.out.println("Digite o valor da compra :R$");
		vCompra = scanner.nextDouble();
		System.out.println("Em quantas parcelas deseja?1/2/3:");
		parc = scanner.nextInt();
		
		
		if(parc ==1) {
			System.out.println("O valor da compra a vista, você ganha 10% de cosconto, totalizando:R$"+ (vCompra-(0.1*vCompra)));
		}
		else if (parc ==2) {
			System.out.println("Valor da compra:R$"+vCompra+",valor da parcela R$"+vCompra/2);
		}
		else if (parc ==3) {
			System.out.println("O valor da compra em 3x tem um acrescimo de 10%,totalizando:R$"+(0.1*vCompra+vCompra)+",parcels de R$"+(0.1*vCompra+vCompra)/3);
			
		}
		else {
			System.out.println("numero de parcelar inválido.");
		}
		
       scanner.close();
	}

}
