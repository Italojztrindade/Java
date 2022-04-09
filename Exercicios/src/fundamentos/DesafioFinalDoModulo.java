package fundamentos;

import javax.swing.JOptionPane;

public class DesafioFinalDoModulo {
	public static void main(String[] args) {

		/*
		 * capturar dois números informados pelo usuário e também a operação que ele
		 * deseja realizar. Obs: Usar apenas o que foi ensinado até então.
		 */

		String valor1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
		Double numero1 = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog("Informe o segundo numero: ");
		Double numero2 = Double.parseDouble(valor2);

		String operador = JOptionPane.showInputDialog("Informe o operador(+,-,*,/,%): ");
		
		
		double calculo = "+".equals(operador) ? numero1 + numero2 : 0;
		calculo = "-".equals(operador) ? numero1 - numero2 : calculo;
		calculo = "*".equals(operador) ? numero1 * numero2 : calculo;
		calculo = "/".equals(operador) ? numero1 / numero2 : calculo;
		calculo = "%".equals(operador) ? numero1 % numero2 : calculo;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, calculo);
		
		
	}

}
