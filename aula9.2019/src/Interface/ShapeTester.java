package Interface;

public class ShapeTester {

	public static void main(String[] args) 
	{
		System.out.println("RETANGULO");
		Retangulo ret = new Retangulo (7,6);
		//System.out.println("Area = " +  ret.getArea() );
		//System.out.println("Perimetro = " +  ret.getPerimetro() );
		ret.Imprimir();

		System.out.println("TRIANGULO");
		Triangulo tri = new Triangulo (7,5,6);
		tri.Imprimir();
		
		
		System.out.println("CIRCULO");
		Circulo cir = new Circulo (7);
		cir.Imprimir();
	}

}
