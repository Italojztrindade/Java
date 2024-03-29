package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Throwable e) {

			System.out.println(e.getMessage());
		}

		System.out.println("Fim");

	}

	// N�o checada ou n�o verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// exce��o checada ou verificada 
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");

	}

	/*
	 * Tamb�m � poss�vel tratar o erro dentro do m�todo static void geraErro2() {
	 * try { throw new Exception("Ocorreu um erro bem legal #02!"); } catch
	 * (Exception e) { System.out.println("Que legal! "); }
	 * 
	 * }
	 */

}
