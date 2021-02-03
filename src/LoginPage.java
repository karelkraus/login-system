import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
	
	ImageIcon icon = new ImageIcon("key.png");
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User: ");
	JLabel userPasswordLabel = new JLabel("Password: ");
	JLabel messageLabel = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	
	LoginPage(HashMap<String,String> loginInfoOriginal) {
		
		logininfo = loginInfoOriginal;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setTitle("Login");
		this.setIconImage(icon.getImage());
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.pink);
		this.setLayout(null);
		this.setResizable(false);
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font("Arial", Font.ITALIC, 25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		
		this.add(messageLabel);
		this.add(userIDLabel);
		this.add(userPasswordLabel);
		this.add(userIDField);
		this.add(userPasswordField);
		this.add(loginButton);
		this.add(resetButton);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login succesful");
					this.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				} else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Incorrect password");
				}
			} else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("User not found");
			}
		}
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
	}

}
