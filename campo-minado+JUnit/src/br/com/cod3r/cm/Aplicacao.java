package br.com.cod3r.cm;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;


public class Aplicacao extends JFrame{
	
	private JPanel contentPane;
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
	}
	
}
