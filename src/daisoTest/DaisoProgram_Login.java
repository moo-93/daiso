package daisoTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class DaisoProgram_Login extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	
	public DaisoProgram_Login() {
		setTitle("\uB85C\uADF8\uC778");
		setBounds(100, 100, 274, 220);	
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(33, 12, 24, 18);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(14, 54, 85, 18);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(104, 9, 116, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLoginButton = new JButton("\uB85C\uADF8\uC778");
		btnLoginButton.setBounds(14, 97, 105, 27);
		getContentPane().add(btnLoginButton);
		
		JButton btnSignUpButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnSignUpButton.addActionListener(new ButtonLogin());
		btnSignUpButton.setBounds(133, 97, 105, 27);
		getContentPane().add(btnSignUpButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 51, 116, 24);
		getContentPane().add(passwordField);
	}
/*	public static void main(String[] args) {
		DaisoProgram_Login test = new DaisoProgram_Login();
		test.setVisible(true);
	}*/
	
}
