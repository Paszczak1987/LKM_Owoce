package lkm;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Gui.ByleJakaKlasa;

public class Main extends JPanel {
	public static void main(String[] args) throws FileNotFoundException {
		JFrame window = new JFrame("LKM_Owoce");
		JPanel panel = new JPanel();
		
		ByleJakaKlasa.makeList();
		panel.add(ByleJakaKlasa.getJList());
		
		window.setSize(250, 250);
		window.add(panel);
		
		
		Toolkit toolSet = Toolkit.getDefaultToolkit();
		
		int x = toolSet.getScreenSize().width/2 - panel.getPreferredSize().width/2;
		int y = toolSet.getScreenSize().height/2- panel.getPreferredSize().height/2;
		
		window.setLocation(x,y);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
