package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Conversao_Desafio {
	public static void main(String[] args) {
		//Com Scanner
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro sal�rio: ");
		String numero1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo sal�rio: ");
		String numero2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro sal�rio: ");
		String numero3 = entrada.next().replace(",", ".");
		
		//com JOptionPane
//		String numero1 = JOptionPane.showInputDialog("Informe o primeiro sal�rio: ").replace(",", ".");
//		String numero2 = JOptionPane.showInputDialog("Informe o segundo sal�rio: ").replace(",", ".");
//		String numero3 = JOptionPane.showInputDialog("Informe o terceiro sal�rio: ").replace(",", ".");
		
		double salario1 = Double.parseDouble(numero1);
		double salario2 = Double.parseDouble(numero2);
		double salario3 = Double.parseDouble(numero3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A m�dia dos �ltimos tr�s sal�rios �: " + media);
		entrada.close();
	}
}
