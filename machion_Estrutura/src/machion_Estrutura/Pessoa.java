package machion_Estrutura;

public class Pessoa{
    //Atributos encapsulados   
    private int anoNasc;
    private String nome;
    private Pessoa bff;
    
    //Construtor  testa classe , seguindo a regra de negocio
    //com sobrecarga(conjunto de parametros diferente
    public Pessoa(int anoNasc, String nome){
    
         this.nome = nome; //this esta dizendo "este atributo recebe este valor"    
         this.anoNasc = anoNasc;
    }
    public Pessoa(String nome) {
    	this.nome = nome;
    }
    public Pessoa() {} //reconstruindo o construtor padrão

    
    //Métodos de acesso -getters  
    public String getNome(){
        return this.nome; //This só é necessário quando se tem AMBIGUIDADE  ref. ao objeto 
        
    }
    public int getAnoNasc(){
        return this.anoNasc;
    }
    public Pessoa getBff(){
        return this.bff;
    }
    
    //Métodos de modificadores -setters  
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }
    public void setBff(Pessoa bff){
        this.bff = bff;
    }
    @Override
    
    //sobreescrita do metodo
    //representação textual de um objeto :toString
    public String toString() {
    	String s =  "Pessoa:[nome:" + nome + ",ano de nascimento: " + anoNasc + ", melhor amigo:" ;
    	if(bff != null && bff.getNome() != null) {
    		s = s + bff.getNome() + "]";
    	}
    	else {
    		s = s + "ainda não tem amigo]";
    	}
    	return s;
    }
}