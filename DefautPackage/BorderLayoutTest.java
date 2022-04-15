package DefautPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Application");
		frame.setSize(400,300);
		
		//Pour utiliser gestionnaire ou layout
		frame.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		
		//lier les buttons avec fenetre
		frame.getContentPane().add(btn1, BorderLayout.NORTH); // fo9
		frame.getContentPane().add(btn2, BorderLayout.SOUTH); // Taht
		frame.getContentPane().add(btn3, BorderLayout.WEST); // 3lz lissar
		frame.getContentPane().add(btn4, BorderLayout.EAST); // 3la liman
		frame.getContentPane().add(btn5, BorderLayout.CENTER); // wast
		
		btn1.setPreferredSize(new Dimension(200, 50)); // specifier taille de btn1 ( il prende en consideration seil le hauteur)
		
		
		
		//afficher notre  formulaire
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
