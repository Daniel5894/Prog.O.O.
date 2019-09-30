package Polimorfismo;

public class Mamifero extends Animal 
{
	
	private String corPelo;

	@Override
	public void locomover()
	{
	System.out.println("O mamifero est� correndo!");	
		
	}

	@Override
	public void alimentar() 
	{
		System.out.println("O mamifero est� mamando!");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("O mamifero est� uivando!");
		
	}
	

}
