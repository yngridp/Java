package machion_Estrutura;

public class AppPessoa {

	public static void main(String[] args) {
		int i =10;
		String s = "oi";
		Pessoa p1;
		
		p1 = new Pessoa(2000,"Ana");
		System.out.println(p1.getNome());
		p1.setAnoNasc(2001);
		
		Pessoa p2 = new Pessoa("Gil");
		p2.setAnoNasc(1998);
		
		Pessoa p3 = new Pessoa(1999, "Caio");
		p3.setBff(p1);
		
		Pessoa p4 = new Pessoa();
		p1.setBff(p4);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);

	}

}
