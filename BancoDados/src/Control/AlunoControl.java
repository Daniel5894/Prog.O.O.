package Control;

import java.util.ArrayList;
import java.util.List;

import DAO.AlunoDAO;
import Model.Aluno;

public class AlunoControl 
{
	public void create (Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.create(aluno);
		}
		finally
		{
			System.out.println("Fim da inser��o!");
		}
	}

	public List<Aluno> readAll()
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		try
		{
		 AlunoDAO dao = new AlunoDAO();
		 alunos = dao.readAll();
		}
		finally
		{
			System.out.println("Fim da leitura");
		}
		return alunos;
	}
}
