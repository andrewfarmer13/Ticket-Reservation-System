package ticketSystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ticket System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(701,401));
		frame.setContentPane(new MainPanel());
		frame.pack();
		frame.setVisible(true);
	}

}
