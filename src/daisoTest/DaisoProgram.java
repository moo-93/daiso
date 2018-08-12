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
import java.awt.Component;
import javax.swing.Box;

public class DaisoProgram extends JFrame {
	private JPanel contentPane;
	private JTextField Search;
	private JButton btnSearch;
	private ImageIcon ImageDaiso;
	private ImageIcon ImageDaiso2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaisoProgram frame = new DaisoProgram();
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
	public DaisoProgram() {
		setTitle("\uB2E4\uC774\uC18C \uBB34\uC778\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 432);
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ButtonLoginWindow());
		btnLogin.setBounds(671, 68, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnBuy = new JButton("\uAD6C\uB9E4");
		btnBuy.addActionListener(new ButtonBuyWindow());
		btnBuy.setBounds(671, 136, 97, 23);
		contentPane.add(btnBuy);
		
		Search = new JTextField();
		Search.setBounds(503, 12, 135, 21);
		contentPane.add(Search);
		
		btnSearch = new JButton("\uC81C\uD488\uC870\uD68C");
		btnSearch.setBounds(671, 12, 97, 23);
		contentPane.add(btnSearch);
		
		JComboBox BigcomboBox = new JComboBox();
		BigcomboBox.setBounds(74, 13, 143, 21);
		contentPane.add(BigcomboBox);
		
		JComboBox MidcomboBox = new JComboBox();
		MidcomboBox.setBounds(298, 13, 143, 21);
		contentPane.add(MidcomboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(24, 70, 342, 253);
		contentPane.add(textArea);
		
		ImageDaiso =new ImageIcon("D:\\class\\daisotest\\daisoimage.PNG");
		Image img = ImageDaiso.getImage();
		
		JLabel ImageLabel = new JLabel("\uC0AC\uC9C4");
		ImageLabel.setBackground(Color.WHITE);
		ImageLabel.setBounds(671, 194, 97, 81);
		
		ImageDaiso2 = new ImageIcon(img.getScaledInstance
				(ImageLabel.getWidth(), ImageLabel.getWidth(), java.awt.Image.SCALE_SMOOTH));
		ImageLabel.setIcon(ImageDaiso2);
		contentPane.add(ImageLabel);
		
		JLabel DasioMapLabel = new JLabel("\uC9C0\uB3C4\uB780");
		DasioMapLabel.setForeground(Color.BLACK);
		DasioMapLabel.setBackground(Color.WHITE);
		DasioMapLabel.setBounds(380, 70, 277, 253);
		contentPane.add(DasioMapLabel);
		
		JLabel label = new JLabel("\uB300\uBD84\uB958");
		label.setBounds(14, 14, 46, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC911\uBD84\uB958");
		label_1.setBounds(238, 14, 46, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC0C1\uC138");
		label_2.setBounds(461, 14, 28, 18);
		contentPane.add(label_2);
		
	}
}

