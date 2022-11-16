package br.com.cod3r.cm.visao;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		Scanner entrada = new Scanner(System.in);
		
		String SLinha = JOptionPane.showInputDialog("Informe o número de linhas");
		int linha = Integer.parseInt(SLinha);
		String SColuna = JOptionPane.showInputDialog("Informe o número de coluna");
		int coluna = Integer.parseInt(SColuna);
		String SMina = JOptionPane.showInputDialog("Informe o número de SMina");
		int mina = Integer.parseInt(SMina);
		
		Tabuleiro tabuleiro = new Tabuleiro(linha, coluna, mina);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setVisible(true);
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		entrada.close();
	}
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}
}
