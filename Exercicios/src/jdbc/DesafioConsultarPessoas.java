package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Minha solução


public class DesafioConsultarPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome que deseja pesquisar: ");
		String getPalavra = entrada.nextLine();
		
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			if(nome.contains(getPalavra)) {
				pessoas.add(new Pessoa(codigo, nome));
			}
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		entrada.close();
		conexao.close();

	}
}
