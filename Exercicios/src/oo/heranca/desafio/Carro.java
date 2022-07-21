package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;

	boolean acelerar() {
		velocidadeAtual += 5;
		return true;
	}

	boolean frear() {
		if (velocidadeAtual == 0) {
			return false;
		} else {
			velocidadeAtual -= 5;
			return true;
		}
	}

}
