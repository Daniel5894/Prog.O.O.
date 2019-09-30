package Polimorfismo;

public abstract class Animal  //precisa p�r o "abstract" para funcionar// Animal � uma superclasse
{
//SOBREPOSI��O - POLIMORFISMO
	private float peso;
	private int idade;
	private int qtdMembros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
	public float getPeso() 
	{
		return peso;
	}
	public void setPeso(float peso) 
	{
		this.peso = peso;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public int getQtdMembros() 
	{
		return qtdMembros;
	}
	public void setQtdMembros(int qtdMembros) 
	{
		this.qtdMembros = qtdMembros;
	}

	
	
}
