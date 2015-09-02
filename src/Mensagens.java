import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class Mensagens extends JFrame {
	JLabel msg;
	JFrame J = new JFrame("Meu primeiro frame em Java");
	JPanel panel;
	public void incluidoSucesso (){
		panel = new JPanel();
		msg = new JLabel ("Incluido com sucesso!");
		
		panel.add(msg);        
		J.setSize(300,200);
        getContentPane().add(panel, BorderLayout.CENTER);
        J.setLocationRelativeTo(getFocusCycleRootAncestor());
        J.setVisible(true);
	      
	    }
}

