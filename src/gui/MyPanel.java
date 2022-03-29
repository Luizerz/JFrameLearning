package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
		
	final int PANEL_WIDHT = 500;
	final int PANEL_HEIGHT = 500;
	Image pikaxu;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 50;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDHT,PANEL_HEIGHT));
		this.setBackground(Color.white);
		pikaxu = new ImageIcon("/home/luiz/Documentos/GitHub/JFrameLearning/src/pikaxu.png").getImage();
		timer = new Timer(1000, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(pikaxu, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x = x + xVelocity;
		if (x < 500) {
			repaint();
		}
	}
}
