
public class Caneta 
{
//cria��o de atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar()
	{
		if (tampada)
		{
			System.out.println("Erro! Caneta est� tampada");
		}
		else
		{
			System.out.println("Rabiscando...");
		}
	}
    void tampar()
    {
    	tampada = true;
    }
    void destampar()
    {
    	tampada = false;
    }
    
    void status()
    {
    	System.out.println("\nClasse da Caneta");
    	System.out.println("Modelo da caneta:" + modelo);
    	System.out.println("Cor:" + cor);
    	System.out.println("Ponta:" + ponta);
    	System.out.println("Carga:" + carga);
    	System.out.println("Tampada:" + tampada);
    }
    
}



