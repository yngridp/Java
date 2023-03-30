package hamburgueria.model;

public class VisualizarCardapio {
	
	    public static void main(String[] args) {
	        // Criação do cardápio
	        Lancamentos cardapio = new Lancamentos(null, null, 0);

	        // Adicionando pratos
	        cardapio.addLanches(new Lancamentos("Hambúrguer Infantil", "Carne, alface, tomate e queijo", 10.0));
	        cardapio.addLanches(new Lancamentos("Hambúrguer Bob Molho Suave", "Carne, Mussarela, tomate, alface, molho bob", 12.0));
	        cardapio.addLanches(new Lancamentos("Hambúguer Patrick", "Carne, cheddar, presunto, queijo, ovo ", 15.0));

	        // Imprimindo cardápio
	        cardapio.visualizar();
	    }
	}

