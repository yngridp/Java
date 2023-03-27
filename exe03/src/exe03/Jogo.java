package exe03;

import java.time.LocalDate;

public class Jogo extends Produto{
	
	public Jogo(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.categoria = categoria;
	}

	private int categoria;

}
