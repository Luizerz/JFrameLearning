package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
		
	final int PANEL_WIDHT = 1000;
	final int PANEL_HEIGHT = 500;
	Image pikaxu;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 4;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	int aux = 0;
	
	void trainAnimation(){
		if (aux == 0) {
			pikaxu = new ImageIcon("/home/luiz/Área de Trabalho/trem_sprite/train1_indo.png").getImage();
			aux++;
		}else if (aux == 1) {
			pikaxu = new ImageIcon("/home/luiz/Área de Trabalho/trem_sprite/train2_indo.png").getImage();
			aux++;
		}else if (aux == 2) {
			pikaxu = new ImageIcon("/home/luiz/Área de Trabalho/trem_sprite/train3_indo.png").getImage();
			aux++;
		}else {
			pikaxu = new ImageIcon("/home/luiz/Área de Trabalho/trem_sprite/train1_indo.png").getImage();
			aux = 0;
		}
	}
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDHT,PANEL_HEIGHT));
		this.setBackground(Color.white);
		pikaxu = new ImageIcon("/home/luiz/Documentos/GitHub/JFrameLearning/src/pikaxu.png").getImage();
		timer = new Timer(30, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(pikaxu, x, y, null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x < 1000) {
			x = x + xVelocity;
			repaint();
			trainAnimation();
			getToolkit().sync();
		}
		else {
			System.out.print("chegou");
//			x = x - xVelocity;
//			repaint();
		}
	}
}
