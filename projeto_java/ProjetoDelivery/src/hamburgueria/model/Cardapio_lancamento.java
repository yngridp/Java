package hamburgueria.model;
import java.util.ArrayList;

public class Cardapio_lancamento {
	

	    private ArrayList<Lancamentos> lanches;

	    public Cardapio_lancamento() {
	        lanches = new ArrayList<>();
	    }

	    public void addLanches1(Cardapio_lancamento p) {
	    	Cardapio_lancamento.add(p);
	    }


		private static void add(Cardapio_lancamento p) {
		
		}

		public void visualizar() {
	        for (Lancamentos p : lanches) {
	            System.out.println(p.getNome() + ": " + p.getDescricao() + " - R$" + p.getPreco());
	        }
	    }
	}


