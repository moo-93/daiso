package daisoTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class daisoProgram extends JFrame {

	private JPanel contentPane;
	private JTextField Search;
	private JButton button;
	private ImageIcon ImageDaiso;
	private ImageIcon ImageDaiso2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daisoProgram frame = new daisoProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public daisoProgram() {
		setTitle("\uB2E4\uC774\uC18C \uBB34\uC778\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 432);
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(494, 10, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnBuy = new JButton("\uAD6C\uB9E4");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuy.setBounds(494, 138, 97, 23);
		contentPane.add(btnBuy);
		
		Search = new JTextField();
		Search.setBounds(342, 107, 135, 21);
		contentPane.add(Search);
		Search.setColumns(10);
		
		button = new JButton("\uC81C\uD488\uC870\uD68C");
		button.setBounds(494, 105, 97, 23);
		contentPane.add(button);
		
		JComboBox BigcomboBox = new JComboBox();
		BigcomboBox.setBounds(49, 107, 143, 21);
		contentPane.add(BigcomboBox);
		
		JComboBox MidcomboBox = new JComboBox();
		MidcomboBox.setBounds(196, 107, 143, 21);
		contentPane.add(MidcomboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 137, 290, 226);
		contentPane.add(textArea);
		
		ImageDaiso =new ImageIcon("D:\\class\\daisotest\\daisoimage.PNG");
		Image img = ImageDaiso.getImage();
		
		JLabel ImageLabel = new JLabel("\uC0AC\uC9C4");
		ImageLabel.setBackground(Color.WHITE);
		ImageLabel.setBounds(35, 10, 56, 56);
		
		ImageDaiso2 = new ImageIcon(img.getScaledInstance
				(ImageLabel.getWidth(), ImageLabel.getWidth(), java.awt.Image.SCALE_SMOOTH));
		ImageLabel.setIcon(ImageDaiso2);
		contentPane.add(ImageLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(404, 262, 73, 22);
		contentPane.add(spinner);
		
		JButton btn_add = new JButton("\uC81C\uD488\uCD94\uAC00");
		btn_add.setBounds(494, 261, 97, 23);
		contentPane.add(btn_add);
		
	}
}
