package exe03;

import java.time.LocalDate;

public class Jogo extends Produto{
	
	public Jogo(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.categoria = categoria;
	}
	private int categoria;

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void visulizar() {
		super.visualizar();
		System.out.println("Categoria do jogo: " + this.categoria);
	}

}
