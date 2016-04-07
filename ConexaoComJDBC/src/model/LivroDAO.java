package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LivroDAO {
   
	private Connection connection;

    public LivroDAO() {
        this.connection = new ConnectionFactory().getConnection() ;
    }

    public void adiciona(List<Livro> livros, Long id_estudante){
        for (Livro livro : livros) {
            String sql = "insert into livro(nome, id_estudante) values(?,?)";
            try {
                PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

                stmt.setString(1, livro.getNome());
                stmt.setLong(2, id_estudante);

                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
}