package control;

import java.util.ArrayList;
import java.util.List;

import dao.EstoquistaDAO;
import model.Estoquista;

public class EstoquistaControl {
	
	public void create (Estoquista estoquista)
	{
		try
		{
			EstoquistaDAO dao = new EstoquistaDAO();
			dao.create(estoquista);
		}
		finally
		{
			System.out.println("Fim da inser��o!");
		}
	}

	public void delete(Estoquista estoquista)
	{		
		try 
		{
			EstoquistaDAO dao = new EstoquistaDAO();
			dao.delete(estoquista);
		} 
		finally 
		{
			System.out.println("Fim da remo��o!");
		}	
	}
	public void update(Estoquista estoquista)
	{	
		try 
		{
			EstoquistaDAO dao = new EstoquistaDAO();
			dao.update(estoquista);
		} 
		finally 
		{
			System.out.println("Fim da edi��o!");
		}	
	}
	
	public List<Estoquista> readAll()
	{
		List<Estoquista> estoquistas = new ArrayList<Estoquista>();
		try
		{
			EstoquistaDAO dao = new EstoquistaDAO();
		 estoquistas = dao.readAll();
		}
		finally
		{
			System.out.println("Fim da leitura");
		}
		return estoquistas;
	}

}
