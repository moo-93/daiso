package daisoTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonBuyWindow implements ActionListener{
	private DaisoProgram_Buy buy = new DaisoProgram_Buy();
	@Override
	public void actionPerformed(ActionEvent e) {
		buy.setVisible(true);
	}

}
