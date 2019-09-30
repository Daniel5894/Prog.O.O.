package Calculadora;

public class CalculadoraTester 
{
//SOBRECARGA - POLIMORFISMO
	public static void main(String[] args) 
	{
		Calculadora calcu = new Calculadora();
		
		System.out.println("Somar(Inteiro)= " + calcu.somar(1,10));
		System.out.println("Somar(Float)= " + calcu.somar(1.5f,10.8f));
		System.out.println("Somar(String)= " + calcu.somar("Kaiser ", "Daniel"));
		System.out.println("Somar(3Float)= " + calcu.somar(8,10,7));

	}

}
