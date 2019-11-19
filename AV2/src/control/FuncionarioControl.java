package control;

import java.util.ArrayList;
import java.util.List;

import dao.FuncionarioDAO;
import model.Funcionario;

public class FuncionarioControl {
	
	public void create (Funcionario funcionario)
	{
		try
		{
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.create(funcionario);
		}
		finally
		{
			System.out.println("Fim da inserção!");
		}
	}

	public void delete(Funcionario funcionario)
	{		
		try 
		{
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.delete(funcionario);
		} 
		finally 
		{
			System.out.println("Fim da remoção!");
		}	
	}
	public void update(Funcionario funcionario)
	{	
		try 
		{
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.update(funcionario);
		} 
		finally 
		{
			System.out.println("Fim da edição!");
		}	
	}
	
	public List<Funcionario> readAll()
	{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		try
		{
			FuncionarioDAO dao = new FuncionarioDAO();
			funcionarios = dao.readAll();
		}
		finally
		{
			System.out.println("Fim da leitura");
		}
		return funcionarios;
	}

}
