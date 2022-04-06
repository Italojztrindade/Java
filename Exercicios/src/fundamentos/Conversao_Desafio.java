package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Conversao_Desafio {
	public static void main(String[] args) {
		//Com Scanner
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro salário: ");
		String numero1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo salário: ");
		String numero2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salário: ");
		String numero3 = entrada.next().replace(",", ".");
		
		//com JOptionPane
//		String numero1 = JOptionPane.showInputDialog("Informe o primeiro salário: ").replace(",", ".");
//		String numero2 = JOptionPane.showInputDialog("Informe o segundo salário: ").replace(",", ".");
//		String numero3 = JOptionPane.showInputDialog("Informe o terceiro salário: ").replace(",", ".");
		
		double salario1 = Double.parseDouble(numero1);
		double salario2 = Double.parseDouble(numero2);
		double salario3 = Double.parseDouble(numero3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média dos últimos três salários é: " + media);
		entrada.close();
	}
}
