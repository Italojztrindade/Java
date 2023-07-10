package br.com.cod3r.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank
	private String nome;

	@Min(0)
	private double preco;

	@Min(0)
	@Max(1)
	private double desconto;

	public Produto() {

	}

	public Produto(@NotBlank String nome, @Min(0) double preco, @Min(0) @Max(1) double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	
	public Produto(int id, @NotBlank String nome, @Min(0) double preco, @Min(0) @Max(1) double desconto) {
		super();
		this.id = id;
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

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	
}
