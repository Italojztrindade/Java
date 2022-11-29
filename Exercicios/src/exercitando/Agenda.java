package exercitando;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	String nome;
	String idade;
	String altura;
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	public Agenda(String nome, String idade, String altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	

	//public void getLista() {
//		System.out.println(armazenaPessoa(nome, idade, altura));
//	}
	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}

	public String getAltura() {
		return altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	
	
	
	
	

}
