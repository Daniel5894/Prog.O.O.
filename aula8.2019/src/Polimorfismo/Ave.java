package Polimorfismo;

public class Ave extends Animal
{

	@Override
	public void locomover() 
	{
		System.out.println("Ave está voando!");
		
	}

	@Override
	public void alimentar() 
	{
		System.out.println("Ave está se alimentando");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Ave está cantando");
		
	}

	public void fazerNinho()
	{
		System.out.println("Ave concluiu o seu ninho!");
	}
}
