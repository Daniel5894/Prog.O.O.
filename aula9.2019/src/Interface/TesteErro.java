package Interface;

public class TesteErro {

	public static void main(String[] args) 
	{
		int[] vet = new int[4];
		
		try
		{
			vet [0] = 10;
			vet [4] = 9;
			
			System.out.println("Fim do programa");
		}
		catch(Exception e)
		{
			System.out.println("Erro ao acessar o vetor! Verifique ");
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
