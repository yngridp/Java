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
    public Pessoa() {} //reconstruindo o construtor padr�o

    
    //M�todos de acesso -getters  
    public String getNome(){
        return this.nome; //This s� � necess�rio quando se tem AMBIGUIDADE  ref. ao objeto 
        
    }
    public int getAnoNasc(){
        return this.anoNasc;
    }
    public Pessoa getBff(){
        return this.bff;
    }
    
    //M�todos de modificadores -setters  
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
    //representa��o textual de um objeto :toString
    public String toString() {
    	String s =  "Pessoa:[nome:" + nome + ",ano de nascimento: " + anoNasc + ", melhor amigo:" ;
    	if(bff != null && bff.getNome() != null) {
    		s = s + bff.getNome() + "]";
    	}
    	else {
    		s = s + "ainda n�o tem amigo]";
    	}
    	return s;
    }
}