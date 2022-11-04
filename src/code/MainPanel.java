package ticketSystem;

import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class MainPanel extends Container {
	public MainPanel() {
		setLayout(null);
		
		JLabel title = new JLabel("Ticket Reservation System");
		title.setFont(new Font("Rockwell", Font.BOLD, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(7, 18, 687, 17);
		add(title);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 89, 90, 17);
		add(comboBox);
		
		JLabel lblFrom = new JLabel("FROM: ");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setBounds(28, 89, 75, 13);
		add(lblFrom);
		
		JLabel lblNewLabel = new JLabel("TO: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 121, 56, 17);
		add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 124, 90, 17);
		add(comboBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(338, 85, 47, 17);
		add(spinner);
		
		JLabel lblNumber = new JLabel("NUMBER: ");
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber.setBounds(256, 88, 75, 13);
		add(lblNumber);
		
		JRadioButton rdbtnChildren = new JRadioButton("CHILDREN");
		rdbtnChildren.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnChildren.setBounds(505, 84, 97, 21);
		add(rdbtnChildren);
		
		JRadioButton rdbtnNoChildren = new JRadioButton("NO CHILDREN");
		rdbtnNoChildren.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNoChildren.setBounds(505, 119, 134, 21);
		add(rdbtnNoChildren);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnChildren);
		group.add(rdbtnNoChildren);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 248, 642, 117);
		add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MainPanel.class.getResource("/ticketSystem/airplane1.jpg")));
		lblNewLabel_1.setBounds(267, 121, 145, 75);
		add(lblNewLabel_1);
		
		
	}
}
