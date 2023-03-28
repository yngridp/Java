package exe_poo;


public class TestaCliente {
    
    public static void main(String[] args) {
        
          Exer01_Cliente tc = new Exer01_Cliente ("João" , 27, "Masculino" , "São paulo" , "(11 96719-5996");
          
          tc.visualizar();

    
          Exer01_Cliente  tc1 = new Exer01_Cliente ("Yngrid" , 23, "Feminino" , "Rio de Janeiro" , "(21 95734-5959");
          
          tc1.visualizar();
          
          PessoaFisica cpf = new PessoaFisica("Pedro" , 25, "Masculino" , "São Paulo" , "(11 95314-5899)", "448965321-12");
  		  cpf.visualizar();
  		  
  		  PessoaFisica cpf2 = new PessoaFisica("Michele" , 32, "Feminino" , "São Paulo" , "(11 99414-7499)", "568965321-14");
		  cpf2.visualizar();
		  
		  PessoaJuridica cnpj = new PessoaJuridica("Ana" , 32, "Feminino" , "São Paulo" , "(11 99114-8877)", "05.311.244/0001-09");
		  cnpj.visualizar();
		  
		  PessoaJuridica cnpj2 = new PessoaJuridica("Ana" , 32, "Feminino" , "São Paulo" , "(11 99114-8877)", "04.333.655/0001-07");
		  cnpj2.visualizar();
		  

    }
}