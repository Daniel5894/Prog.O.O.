package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Funcionario;

public class FuncionarioDAO {
	
	public void create(Funcionario funcionario)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO funcionario(matricula, nome, funcao, tel) VALUES (?,?)";
		
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getFuncao());
			stmt.setInt(4, funcionario.getTel());
						
			stmt.executeUpdate();
			System.out.println("Funcionário incluido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir funcionário!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	public void delete(Funcionario funcionario)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM funcionario WHERE matricula = ?";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, funcionario.getMatricula());
			
			stmt.executeUpdate();
			System.out.println("Funcionário removido com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar remover funcionário!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public void update(Funcionario funcionario)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
        String sql = "UPDATE funcionario SET nome= ?, funcao=?, telefone=? WHERE matricula= ? ";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getFuncao());
			stmt.setInt(4, funcionario.getTel());
			
			stmt.executeUpdate();
			System.out.println("Funcionário alterado com sucesso!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar alterar funcionário!");
	    }
		finally
		{
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
	
	public List<Funcionario> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select matricula, nome, funcao, tel from funcionario";
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Funcionario funcionario = new Funcionario();
				funcionario.setMatricula(rs.getInt("matricula"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setFuncao(rs.getString("funcao"));
				funcionario.setTel(rs.getInt("tel"));
				
				funcionarios.add(funcionario);
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
		return funcionarios;
	}

}
