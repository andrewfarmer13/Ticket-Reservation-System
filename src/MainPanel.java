package ticketSystem;

import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainPanel extends Container {
	public MainPanel() {
		setLayout(null);
		
		JLabel title = new JLabel("Ticket Reservation System");
		title.setFont(new Font("Rockwell", Font.BOLD, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(7, 18, 687, 17);
		add(title);
	}
}
