package principal;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class InterfaceDoJogo extends JFrame {

	private JRadioButton pedra, papel, tesoura;
	private JLabel myLabel;
	private RadioButtonHandler handler;

	public InterfaceDoJogo() {
		setLayout(new FlowLayout());
		
		handler = new RadioButtonHandler();
		myLabel = new JLabel("Escolha:");
		pedra = new JRadioButton("Pedra", false);
		papel = new JRadioButton("Papel", false);
		tesoura = new JRadioButton("Tesoura", false);

		add(myLabel);
		add(pedra);
		add(papel);
		add(tesoura);

		pedra.addItemListener(handler);
		papel.addItemListener(handler);
		tesoura.addItemListener(handler);
	}
	public int getComputador() {

		int computador = (int) (Math.random() * 3 + 1);
		return computador;
	}
	private class RadioButtonHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(pedra.isSelected()) {
				
				if(getComputador()==1) {
					JOptionPane.showMessageDialog(null,"Empatou");
				} else if(getComputador() == 2) {
					JOptionPane.showMessageDialog(null,"Perdeu");
				} else {
					JOptionPane.showMessageDialog(null,"Ganhou");
				}
			}else if(papel.isSelected()) {
				if(getComputador()==1) {
					JOptionPane.showMessageDialog(null,"Ganhou");
				} else if(getComputador() == 2) {
					JOptionPane.showMessageDialog(null,"Empatou");
				} else {
					JOptionPane.showMessageDialog(null,"Perdeu");
				}
			}else if(tesoura.isSelected()){
				if(getComputador()==1) {
					JOptionPane.showMessageDialog(null,"Perdeu");
				} else if(getComputador() == 2) {
					JOptionPane.showMessageDialog(null,"Ganhou");
				} else {
					JOptionPane.showMessageDialog(null,"Empatou");
				}
			}
			
		}
		
	}

}
