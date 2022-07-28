package lambdas;

@FunctionalInterface
//S� permite usar um m�todo/fun��o abstrato na interface 
//com exce��o de metodo padr�o(default) e static

// dica das funcionalidades 
//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
public interface Calculo {

	double executar(double a, double b);
	
//	default String legal() {
//		return "legal";
//	}
//	static String muitoLegal() {
//		return "muitoLegal";
//	}
	
}
