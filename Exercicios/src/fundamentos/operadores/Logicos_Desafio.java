package fundamentos.operadores;

public class Logicos_Desafio {

	public static void main(String[] args) {
		
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean ComprouTv50 = trabalho1 && trabalho2;
		boolean ComprouTv32 = trabalho1 ^ trabalho2;
		boolean ComprouSorvete = trabalho1 || trabalho2;
		
		// Operador unárui!
		boolean maisSaudavel = !ComprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + ComprouTv50);
		System.out.println("Comprou TV 32\"? " + ComprouTv32);
		System.out.println("Comprou sorvete? " + ComprouSorvete);
	}
}
