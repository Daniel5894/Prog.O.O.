package Polimorfismo;

public class Reptil extends Animal
{
	private String corEscama;

	@Override
	public void locomover() 
	{
		System.out.println("Reptil está rastejando!");
		
	}

	@Override
	public void alimentar() 
	{
		System.out.println("Reptil está comendo!");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Reptil está emitando som!");
		
	}

}
