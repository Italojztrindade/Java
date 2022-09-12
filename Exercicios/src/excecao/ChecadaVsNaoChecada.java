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

	// Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// exceção checada ou verificada 
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");

	}

	/*
	 * Também é possível tratar o erro dentro do método static void geraErro2() {
	 * try { throw new Exception("Ocorreu um erro bem legal #02!"); } catch
	 * (Exception e) { System.out.println("Que legal! "); }
	 * 
	 * }
	 */

}
