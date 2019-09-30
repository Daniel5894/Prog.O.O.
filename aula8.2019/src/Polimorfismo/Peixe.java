package Polimorfismo;

public class Peixe extends Animal
{
	private String corEscama;
	

	@Override
	public void locomover() 
	{
		System.out.println("Peixe est� nadando!");	
	}

	@Override
	public void alimentar() 
	{
		System.out.println("Peixe est� comendo");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Peixe est� emitindo som!");
		
	}
	
	public void soltarBolhas()
	{
		System.out.println("Peixe est� soltando bolhas!");
	}

}
