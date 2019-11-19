package control;

import java.util.ArrayList;
import java.util.List;

import dao.ProdEsportDAO;
import model.ProdEsport;

public class ProdEsportControl {
	
	public void create (ProdEsport prod_esport)
	{
		try
		{
			ProdEsportDAO dao = new ProdEsportDAO();
			dao.create(prod_esport);
		}
		finally
		{
			System.out.println("Fim da inserção!");
		}
	}

	public void delete(ProdEsport prod_esport)
	{		
		try 
		{
			ProdEsportDAO dao = new ProdEsportDAO();
			dao.delete(prod_esport);
		} 
		finally 
		{
			System.out.println("Fim da remoção!");
		}	
	}
	public void update(ProdEsport prod_esport)
	{	
		try 
		{
			ProdEsportDAO dao = new ProdEsportDAO();
			dao.update(prod_esport);
		} 
		finally 
		{
			System.out.println("Fim da edição!");
		}	
	}
	
	public List<ProdEsport> readAll()
	{
		List<ProdEsport> prod_esports = new ArrayList<ProdEsport>();
		try
		{
			ProdEsportDAO dao = new ProdEsportDAO();
			prod_esports = dao.readAll();
		}
		finally
		{
			System.out.println("Fim da leitura");
		}
		return prod_esports;
	}


}
