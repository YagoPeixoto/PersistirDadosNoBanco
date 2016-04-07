package model;

public class TesteInsereEstudante {

	public static void main(String[] args) {
		
		Estudante estudent1 = new Estudante();
		estudent1.setNome("LuizBixona");
		
		Estudante estudent2 = new Estudante();
		estudent2.setNome("Ligerim");
		
		EstudanteDAO estudantedao = new EstudanteDAO();
		estudantedao.adicionaImp(estudent1);
		estudantedao.adicionaImp(estudent2);
	
		System.out.println("AlunoAdd");
		
		
	}
}
