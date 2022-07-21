package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
// 	Não precisa instanciar porque está herdando.
// 	O acesso é pela herança e não por instancia. 
// 	Ana mae = new Ana();

	void testeAcessos() {
		// System.out.println(segredo); private
		// System.out.println(facoDentroDeCasa); //default, não está dentro do mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
