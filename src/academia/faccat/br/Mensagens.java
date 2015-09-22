package academia.faccat.br;

import java.awt.BorderLayout;
import javax.swing.*;


	public class Mensagens extends JFrame {
	JLabel label;
	JPanel panel;
	
	
	public void mensagemPopUp(String mensagem){
		JFrame J = new JFrame("Academia");
		panel = new JPanel();
		label = new JLabel(mensagem, SwingConstants.CENTER);
		J.add(label);
		J.setSize(400,100);
        getContentPane().add(panel, BorderLayout.CENTER);
        J.setLocationRelativeTo(getFocusCycleRootAncestor());
        J.setAlwaysOnTop(true);
        J.setVisible(true);
	}
	
}

