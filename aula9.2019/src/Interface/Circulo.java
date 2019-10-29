package Interface;

public class Circulo implements IShape, IShow
{
	private float raio;
	
    public Circulo(float raio)
    {
    	setRaio(raio);
    }
	
    
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public void Imprimir() 
	{
		System.out.println("Area do Circulo = " + getArea());
		System.out.println("Perimetro do Circulo = " + getPerimetro() );
		
	}

	@Override
	public float getArea() 
	{
		return 3.14f * (this.raio * this.raio);
	}

	@Override
	public float getPerimetro() 
	{
		return (2* 3.14f) * this.raio;
	}


}
