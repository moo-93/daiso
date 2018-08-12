package daisoTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class DaisoProgram_SignUp extends JFrame{
	private JTextField textIDField;
	private JTextField textNameField;
	private JTextField textPhoneField;
	private JPasswordField passwordField;
	private JPasswordField password2Field;
	public DaisoProgram_SignUp() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setBounds(100,100,256,329);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(14, 20, 62, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label.setBounds(14, 60, 62, 18);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		label_1.setBounds(14, 100, 97, 18);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setBounds(14, 140, 62, 18);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setBounds(14, 180, 62, 18);
		getContentPane().add(label_3);
		
		textIDField = new JTextField();
		textIDField.setBounds(109, 17, 116, 24);
		getContentPane().add(textIDField);
		textIDField.setColumns(10);
		
		textNameField = new JTextField();
		textNameField.setColumns(10);
		textNameField.setBounds(109, 137, 116, 24);
		getContentPane().add(textNameField);
		
		textPhoneField = new JTextField();
		textPhoneField.setColumns(10);
		textPhoneField.setBounds(109, 177, 116, 24);
		getContentPane().add(textPhoneField);
		
		JButton btnSelButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnSelButton.setBounds(120, 224, 105, 27);
		btnSelButton.addActionListener(new ButtonSel());///회원가입 이벤트 발생란
		getContentPane().add(btnSelButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 57, 116, 24);
		getContentPane().add(passwordField);
		
		password2Field = new JPasswordField();
		password2Field.setBounds(109, 97, 116, 24);
		getContentPane().add(password2Field);
		
		JButton btnCanButton = new JButton("\uCDE8\uC18C");
		btnCanButton.setBounds(6, 224, 105, 27);
		btnCanButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(btnCanButton);
	}
}
