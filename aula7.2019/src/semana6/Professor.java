package semana6;

public class Professor extends Pessoa 
{
	private String especialidade;
	private float salario;
	
	public void receberAumento(float valor)
	{
		float aumento = salario + valor;
		System.out.println("Seu aumento salarial foi de" + aumento);
	}

	//Setters e Getters
	
	public String getEspecialidade() 
	{
		return especialidade;
	}

	public void setEspecialidade(String especialidade) 
	{
		this.especialidade = especialidade;
	}

	public float getSalario() 
	{
		return salario;
	}

	public void setSalario(float salario) 
	{
		this.salario = salario;
	}
	
	

}
