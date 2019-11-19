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
			System.out.println("Fim da inser��o!");
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
			System.out.println("Fim da remo��o!");
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
			System.out.println("Fim da edi��o!");
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
