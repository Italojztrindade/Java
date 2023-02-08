//open abre o modulo para realizar alterações vindas de fora.

module app.calculo {
	
	//transitive o que você recebeu de um modulo pode ser passado para outro de modo transitivo
	requires transitive app.logging;
	exports br.com.cod3r.app.calculo;
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro;
	
	opens br.com.cod3r.app.calculo to app.financeiro;
}