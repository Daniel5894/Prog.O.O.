package Interface;

public class Retangulo implements IShape, IShow
{
    private float base;
    private float altura;
    
    
    public Retangulo(float base, float altura)
    {
    	setBase(base);
    	setAltura(altura);
    }
    
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float getArea() 
	{
		return this.base * this.altura;
	}

	@Override
	public float getPerimetro() 
	{
        return 2 * (this.base + this.altura);
	}

	@Override
	public void Imprimir() 
	{
		System.out.println("Area do Retangulo = " +  getArea() );
		
		System.out.println("Perimetro do Retangulo = " + getPerimetro() );
		
	}
	
}
