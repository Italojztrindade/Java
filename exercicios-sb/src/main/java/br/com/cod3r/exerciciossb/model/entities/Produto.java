package br.com.cod3r.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	private double preco;

	private double desconto;

	public Produto() {

	}

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}
	}

	public void setDesconto(double desconto) {
		if (desconto >= 0 && desconto <= 100) {
			this.desconto = desconto;
		}
	}

}
