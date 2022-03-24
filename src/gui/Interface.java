package gui;

import java.awt.Color;

	import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Interface extends JFrame{
	Interface(){
		this.setTitle("Aprendendo JFrame GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //O progama encerra quando apertado o x. Por Default vem como HIDE_ON_CLOSE
		this.setResizable(false); //Previnir do usuario fazer resize da window
		this.setSize(420, 420);
		this.setVisible(true);
//		ImageIcon image = new ImageIcon("logo.png");
//		this..setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(123,50,250)); //Trocando o fundo do pane
	}
}