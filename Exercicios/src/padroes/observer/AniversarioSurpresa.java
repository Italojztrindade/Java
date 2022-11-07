package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservadores(namorada);
		
		//usando lambda já que a interface só tem um método
		porteiro.registrarObservadores(e -> System.out.println("SURPRESA usando lambda!!"));
		porteiro.monitorar();
		
		
	}
}
