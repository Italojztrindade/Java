package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdeDeAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int qtdeDeNotas = entrada.nextInt();
		
		double total = 0;
		double media = 0;
		
		double[][] notasDaTurma = new double[qtdeDeAlunos][qtdeDeNotas];
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d:", (nota + 1), (aluno + 1));
				
				notasDaTurma[aluno][nota] = entrada.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}
		
		media = total / (qtdeDeAlunos * qtdeDeNotas);
		
		System.out.println("A média da turma é: " + media);
		
		for (double[] ds : notasDaTurma) {
			System.out.println(Arrays.toString(ds));
		}
		entrada.close();
	}
}
