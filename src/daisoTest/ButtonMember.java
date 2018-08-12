package daisoTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonLoginWindow implements ActionListener{
	private DaisoProgram_Login Login = new DaisoProgram_Login();
	@Override
	public void actionPerformed(ActionEvent e) {
		Login.setVisible(true);
	}
	
}
class ButtonLogin implements ActionListener{
	private DaisoProgram_SignUp SignUp = new DaisoProgram_SignUp();
	@Override
	public void actionPerformed(ActionEvent e) {
		SignUp.setVisible(true);
	}
}

class ButtonSel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


