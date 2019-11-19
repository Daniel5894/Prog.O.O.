package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Estoquista;


public class EstoquistaDAO {
	public void create(Estoquista estoquista)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO estoquista(login, senha) VALUES (?,?)";
		
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, estoquista.getLogin());
			stmt.setString(2, estoquista.getSenha());
			
			stmt.executeUpdate();
			System.out.println("Estoquista incluido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir estoquista");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public void delete(Estoquista estoquista)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM estoquista WHERE login = ?";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, estoquista.getLogin());
			
			stmt.executeUpdate();
			System.out.println("Estoquista removido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar remover estoquista");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public void update(Estoquista estoquista)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
        String sql = "UPDATE estoquista SET senha= ? WHERE login= ? ";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, estoquista.getLogin());
			stmt.setString(2, estoquista.getSenha());
			
			stmt.executeUpdate();
			System.out.println("Estoquista alterado com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar alterar estoquista");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public List<Estoquista> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select login, senha FROM estoquista";
		List<Estoquista> estoquistas = new ArrayList<Estoquista>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Estoquista estoquista = new Estoquista();
				estoquista.setLogin(rs.getString("login"));
				estoquista.setSenha(rs.getString("senha"));
				
				estoquistas.add(estoquista);
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
		return estoquistas;
	}

}
