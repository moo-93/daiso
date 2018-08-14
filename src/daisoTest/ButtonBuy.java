package daisoTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

class ButtonBuyWindow implements ActionListener{
	private DaisoProgram_Buy buy = new DaisoProgram_Buy();
	@Override
	public void actionPerformed(ActionEvent e) {
		buy.setVisible(true);
	}
}

/*class ButtonSearch implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}*/

class ButtonProductAdd implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
