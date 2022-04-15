package DefautPackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


// les bouton affiches sur m ligne (comme BoxLayot) mais cet fois ci on reponsivité
public class FlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Application");
		frame.setSize(400,300);
		
		frame.setLayout(new java.awt.FlowLayout());
		
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
