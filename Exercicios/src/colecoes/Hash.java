package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		System.out.println(usuarios.contains(new Usuario("Guilherme")));
		
		//Se remover o hashCode da classe usuário, vai dar false pois o contains não consegue
		//encontrar o guilherme pois o hashcode é false.
	
		
	}
}
