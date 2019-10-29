package Interface;

public class Triangulo implements IShape, IShow
{
    private float lado1;
    private float lado2;
    private float lado3;
	
    public Triangulo(float lado1, float lado2, float lado3)
    {
        setLado1(lado1);
        setLado1(lado2);
        setLado1(lado3);
    }
    
    public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
    
    
	@Override
	public void Imprimir() 
	{
		System.out.println("Area do Triangulo = " + getArea());
		System.out.println("Perimetro do Triangulo = " + getPerimetro() );
	}


	@Override
	public float getArea() 
	{
       return (this.lado1 + this.lado2  + this.lado3)/3;
	}

	@Override
	public float getPerimetro() {

		return this.lado1 + this.lado2  + this.lado3;
	}

	
	
}
