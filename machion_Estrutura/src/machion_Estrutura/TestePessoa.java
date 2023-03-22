package machion_Estrutura;

public class TestePessoa {

	    public static void main(String[] args) {
	        Pessoa p1;

	        p1 = new Pessoa(2002, "Yngrid");

	        Pessoa p2 = new Pessoa(2005, "Eliana");

	        System.out.println(p1.getNome());

	        p1.setNome("Gabriel");

	        System.out.println(p1.getBff());
	        p1.setBff(p2);

	        System.out.println(p1.getBff().getNome());

	    }

	}

