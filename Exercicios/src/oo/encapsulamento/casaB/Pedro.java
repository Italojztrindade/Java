package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
// 	N�o precisa instanciar porque est� herdando.
// 	O acesso � pela heran�a e n�o por instancia. 
// 	Ana mae = new Ana();

	void testeAcessos() {
		// System.out.println(segredo); private
		// System.out.println(facoDentroDeCasa); //default, n�o est� dentro do mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
