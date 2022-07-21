package oo.heranca.desafio;

public class Ferrari extends Carro{

	boolean acelerar() {
		velocidadeAtual += 15;
		return true;
	}

	boolean frear() {
		if (velocidadeAtual == 0) {
			return false;
		} else {
			velocidadeAtual -= 15;
			return true;
		}
	}
}
