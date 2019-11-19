package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.ProdEsport;

public class ProdEsportDAO {
	
	public void create(ProdEsport prod_esport)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO prod_esport(idprod_esport, nome, desc, valor, quantidade) VALUES (?,?)";
		
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, prod_esport.getIdProd());
			stmt.setString(2, prod_esport.getNome());
			stmt.setString(3, prod_esport.getDesc());
			stmt.setFloat(4, prod_esport.getValor());
			stmt.setInt(5, prod_esport.getQuantidade());
						
			stmt.executeUpdate();
			System.out.println("Produto esportivo incluido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir produto esportivo!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public void delete(ProdEsport prod_esport)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM funcionario WHERE idprod_esport = ?";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, prod_esport.getIdProd());
			
			stmt.executeUpdate();
			System.out.println("Produto esportivo removido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar remover produto esportivo!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public void update(ProdEsport prod_esport)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
        String sql = "UPDATE prod_esport SET nome=?, desc=?, valor=?, quantidade=? WHERE idprod_esport= ? ";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, prod_esport.getIdProd());
			stmt.setString(2, prod_esport.getNome());
			stmt.setString(3, prod_esport.getDesc());
			stmt.setFloat(4, prod_esport.getValor());
			stmt.setInt(5, prod_esport.getQuantidade());
			
			stmt.executeUpdate();
			System.out.println("Produto esportivo alterado com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar alterar produto esportivo!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public List<ProdEsport> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select idprod_esport, nome, desc, valor, quantidade from prod_esport";
		List<ProdEsport> prod_esports = new ArrayList<ProdEsport>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				ProdEsport prod_esport = new ProdEsport();
				prod_esport.setIdProd(rs.getInt("idoprod_esport"));
				prod_esport.setNome(rs.getString("nome"));
				prod_esport.setDesc(rs.getString("desc"));
				prod_esport.setValor(rs.getInt("valor"));
				prod_esport.setQuantidade(rs.getInt("quantidade"));
				
				prod_esports.add(prod_esport);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler a tabela");
		}
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}
		return prod_esports;
	}

}
