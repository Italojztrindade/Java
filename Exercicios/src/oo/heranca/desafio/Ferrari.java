package oo.heranca.desafio;

public class Ferrari extends Carro{

	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 150;
	}
	
	
//	@Override //Para sobre escrever um m�todo, voc� tem que manter o n�vel de visibilidade
//	ou aumentar.
//	public void acelerar() {
//		velocidadeAtual += 15;
//		
//	}

	
}
