import java.awt.Font;

import javax.swing.*;

public class WelcomePage extends JFrame {
	
	JLabel welcomeLabel = new JLabel();
	
	WelcomePage(String userID) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		welcomeLabel.setText("Welcome " + userID);
		
		
		this.add(welcomeLabel);
		this.setVisible(true);
	}

}
