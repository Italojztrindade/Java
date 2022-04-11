package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		/*
		 * While determinado porque existe um contador que me mostra quantas vezes
		 * será repetido o comando.
		 */
		int contador = 1;
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}
	}
}
