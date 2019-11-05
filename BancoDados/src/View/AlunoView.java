package View;

import java.util.Scanner;

import Control.AlunoControl;
import Model.Aluno;

public class AlunoView 
{

	public void create()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		AlunoControl control = new AlunoControl();
		
		System.out.println("Entre com a matricula");
		aluno.setMatricula(sc.nextLine());
		
		System.out.println("Entre com o nome");
		aluno.setNome(sc.nextLine());
		
		control.create(aluno);
		}
	    catch(Exception e)
	    {
		System.out.println("Erro na tela de cadastro!");
	    }
    }
	
	public void readAll()
	{
		AlunoControl control = new AlunoControl();
		
		System.out.println("Listagem de alunos");
		System.out.println("********************");
		for(Aluno aluno:control.readAll())
		{
			System.out.println("Matricula: " + aluno.getMatricula());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("------------------------------");
		}
	}
	
	public static void main(String[] args) 
	{
		AlunoView crud = new AlunoView();
		crud.readAll();
    }
}
