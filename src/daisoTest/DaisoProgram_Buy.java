package daisoTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.ListSelectionModel;

public class DaisoProgram_Buy extends JFrame {
	private JTextField textField_Search;
	private JTable ListTable;
	private JTable BuyListTable;

	/**
	 * Create the panel.
	 */
	public DaisoProgram_Buy() {
		setTitle("\uAD6C\uB9E4\uCC3D");
		setBounds(100,100,827,400);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uB300\uBD84\uB958");
		label.setBounds(36, 13, 46, 18);
		getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 12, 143, 21);
		getContentPane().add(comboBox);
		
		JLabel label_1 = new JLabel("\uC911\uBD84\uB958");
		label_1.setBounds(267, 15, 46, 18);
		getContentPane().add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(327, 14, 143, 21);
		getContentPane().add(comboBox_1);
		
		JLabel label_2 = new JLabel("\uC0C1\uC138");
		label_2.setBounds(484, 16, 28, 18);
		getContentPane().add(label_2);
		
		textField_Search = new JTextField();
		textField_Search.setColumns(10);
		textField_Search.setBounds(526, 14, 135, 21);
		getContentPane().add(textField_Search);
		
		JButton btnSearButton = new JButton("\uC81C\uD488\uC870\uD68C");
//		btnSearButton.addActionListener(l);
		btnSearButton.setBounds(687, 11, 97, 23);
		getContentPane().add(btnSearButton);
		
		ProductBuyDAO dao = new ProductBuyDAO();
		Vector<TestDTO> arr= new Vector<>();
		Vector<String> columName = new Vector<>();
		arr= dao.Selectsql();
		columName = dao.ColHedaer();
		DefaultTableModel table = new DefaultTableModel(arr,columName);
		
		ListTable = new JTable(table);
		ListTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListTable.setBounds(14, 58, 312, 240);
		getContentPane().add(ListTable);
		
		BuyListTable = new JTable();
		BuyListTable.setBounds(382, 58, 312, 240);
		getContentPane().add(BuyListTable);
		
		JButton btnBuyButton = new JButton("\uAD6C\uB9E4");
		btnBuyButton.setBounds(708, 63, 76, 66);
		getContentPane().add(btnBuyButton);
		
		JButton btnTotButton = new JButton("\uC804\uCCB4");
		btnTotButton.setToolTipText("\r\n");
		btnTotButton.setBounds(708, 230, 76, 66);
		getContentPane().add(btnTotButton);
		
		JSpinner spinner_add = new JSpinner();
		spinner_add.setBounds(334, 90, 31, 24);
		getContentPane().add(spinner_add);
		
		JButton btnAddButton = new JButton("\u25B6");
		btnAddButton.addActionListener(new ButtonProductAdd());
		btnAddButton.setBounds(330, 120, 47, 23);
		getContentPane().add(btnAddButton);
		
		JButton btnDelButton = new JButton("\u25C0");
		btnDelButton.setBounds(330, 230, 47, 23);
		getContentPane().add(btnDelButton);
		
		JSpinner spinner_can = new JSpinner();
		spinner_can.setBounds(334, 197, 31, 24);
		getContentPane().add(spinner_can);
		
		JFormattedTextField formattedTextField_Total = new JFormattedTextField();
		formattedTextField_Total.setBackground(Color.WHITE);
		formattedTextField_Total.setEditable(false);
		formattedTextField_Total.setText("\uCD1D\uC561 :");
		formattedTextField_Total.setBounds(24, 310, 289, 24);
		getContentPane().add(formattedTextField_Total);

	}
}
