package Polimorfismo;

public class Ave extends Animal
{

	@Override
	public void locomover() 
	{
		System.out.println("Ave est� voando!");
		
	}

	@Override
	public void alimentar() 
	{
		System.out.println("Ave est� se alimentando");
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Ave est� cantando");
		
	}

	public void fazerNinho()
	{
		System.out.println("Ave concluiu o seu ninho!");
	}
}
