package Polimorfismo;

public class Peixe extends Animal
{
	private String corEscama;
	

	@Override
	public void locomover() 
	{
		System.out.println("Peixe está nadando!");	
	}

	@Override
	public void alimentar() 
	{
		System.out.println("Peixe está comendo");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Peixe está emitindo som!");
		
	}
	
	public void soltarBolhas()
	{
		System.out.println("Peixe está soltando bolhas!");
	}

}
