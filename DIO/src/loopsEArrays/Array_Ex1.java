package loopsEArrays;

public class Array_Ex1 {

	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/
	public static void main(String[] args) {
		
		int[] vetor = {2, -2,-5,5,80,0 };
		
		
		for (int i = (vetor.length-1); i >=0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
	}
}
