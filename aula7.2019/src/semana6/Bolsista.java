package semana6;

public class Bolsista extends Aluno 
{
  private float bolsa;
  
  public void renovarBolsa()
  {
	  System.out.println("Bolsa renovada!");
  }
  
  public void pagarMensalidade(float valor)
  {
	  System.out.println("Valor recebido foi de " + valor);
	  System.out.println("Valor da mensalidade é de " + (valor + bolsa));
  }
  
//Getters and Setters
  
public float getBolsa() {
	return bolsa;
}

public void setBolsa(float bolsa) {
	this.bolsa = bolsa;
}

@Override
public String toString() {
	return "Bolsista [bolsa=" + bolsa + "]";
}
    
}
