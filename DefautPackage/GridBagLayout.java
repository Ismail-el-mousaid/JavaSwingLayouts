package DefautPackage;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridBagLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Application");
		frame.setSize(400,300);
		
//		frame.setLayout(new GridBagLayout()); // affiche les composant sur m ligne
		
		GridBagLayout gbl = new GridBagLayout();
		frame.setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();  // pour travailler avec les contraintes
		
		JButton btn1 = new JButton("Button 1");
		gbc.gridx = 0; //specifier indice de colonne
		gbc.gridy = 0; //specifier indice de ligna
		gbl.addLayoutComponent(btn1, gbc);
		
		JButton btn2 = new JButton("Button 2");
		gbc.gridx = 0; 
		gbc.gridy = 1; 
		gbl.setConstraints(btn2, gbc);
		
		JButton btn3 = new JButton("Button 3");
		gbc.gridx = 1; 
		gbc.gridy = 0; 
		gbc.gridwidth = 2; //specifier width
		gbl.setConstraints(btn3, gbc);
		
		JButton btn4 = new JButton("Button 4");
		gbc.gridx = 1; 
		gbc.gridy = 2; 
		gbl.setConstraints(btn4, gbc);
		
		JButton btn5 = new JButton("Button 5");
		gbc.gridx = 2; 
		gbc.gridy = 1; 
		gbl.setConstraints(btn5, gbc);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
