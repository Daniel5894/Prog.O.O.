package Polimorfismo;

public class AnimalTester {

	public static void main(String[] args) 
	{
		System.out.println("MAMIFERO");
		Mamifero m = new Mamifero();
		m.locomover();
		m.alimentar();
		m.emitirSom();
		System.out.println("*********************************");
		
		System.out.println("REPTIL");
		Reptil r = new Reptil();
		r.locomover();
		r.alimentar();
		r.emitirSom();
		System.out.println("*********************************");
		
		System.out.println("PEIXE");
		Peixe p = new Peixe();
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolhas();
		System.out.println("*********************************");
		
		System.out.println("AVE");
		Ave a = new Ave();
		a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("*********************************");
	}

}
