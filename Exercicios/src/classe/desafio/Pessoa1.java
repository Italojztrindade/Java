package classe.desafio;

public class Pessoa1 {

	String nome;
	double peso;

	Pessoa1(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;

	}

	void comer(Comida1 comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresentar() {
		return "Ol�, eu sou  o " + nome + " e tenho " + peso + "Kg.";
	}
}
