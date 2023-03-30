package hamburgueria.model;

public class VisualizarCardapio {
	
	    public static void main(String[] args) {
	        // Cria��o do card�pio
	        Lancamentos cardapio = new Lancamentos(null, null, 0);

	        // Adicionando pratos
	        cardapio.addLanches(new Lancamentos("Hamb�rguer Infantil", "Carne, alface, tomate e queijo", 10.0));
	        cardapio.addLanches(new Lancamentos("Hamb�rguer Bob Molho Suave", "Carne, Mussarela, tomate, alface, molho bob", 12.0));
	        cardapio.addLanches(new Lancamentos("Hamb�guer Patrick", "Carne, cheddar, presunto, queijo, ovo ", 15.0));

	        // Imprimindo card�pio
	        cardapio.visualizar();
	    }
	}

