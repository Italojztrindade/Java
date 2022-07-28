package lambdas;

@FunctionalInterface
//Só permite usar um método/função abstrato na interface 
//com exceção de metodo padrão(default) e static

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
