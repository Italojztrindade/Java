package principal;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainV2 {

	public static void main(String[] args) {
		InterfaceDoJogo radioButtonFrame = new InterfaceDoJogo();
		radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButtonFrame.setSize(350, 100);
		radioButtonFrame.setVisible(true);
		radioButtonFrame.setLayout(new GridBagLayout());
		radioButtonFrame.setTitle("Jokenpo");
		radioButtonFrame.setLocationRelativeTo(null);
		radioButtonFrame.setIcon();
	}

}

//JFrame miJFrame = new JFrame("Jokenpo");
//miJFrame.setLocationRelativeTo(null);
//// DISPOSE_ON_CLOSE = 2
//miJFrame.setDefaultCloseOperation(2);
//miJFrame.setSize(450, 450);
//miJFrame.setLayout(new GridBagLayout());
//miJFrame.setVisible(true);