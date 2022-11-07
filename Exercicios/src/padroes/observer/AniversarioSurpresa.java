package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservadores(namorada);
		
		//usando lambda j� que a interface s� tem um m�todo
		porteiro.registrarObservadores(e -> System.out.println("SURPRESA usando lambda!!"));
		porteiro.monitorar();
		
		
	}
}
