package aula_exceptions1;

public class ExcecaoSimples extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//serialVersion identificar qual verszao da classe o objeto vai criar
	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
}
