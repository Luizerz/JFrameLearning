package gui;

import java.awt.Color;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	MyPanel panel;
	MyFrame(){
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}