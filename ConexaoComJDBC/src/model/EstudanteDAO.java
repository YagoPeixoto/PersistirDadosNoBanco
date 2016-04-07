package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EstudanteDAO {

	private Connection connection;
	//metodo construtor
	public EstudanteDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	/*
	public Long getUltimoIdPorNome(String nome){
		String sql = "select max(id) id from estudante where nome = ?";
		try {
			PreparedStatement stmt = (PreparedStatement)connection.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			
			Long id = rs.getLong("id");
			
			rs.close();
			stmt.close();
			return id;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	*/
	public void adicionaImp (Estudante estudante){
		String sql = "insert into estudante (nome) values (?)";
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, estudante.getNome());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	
}