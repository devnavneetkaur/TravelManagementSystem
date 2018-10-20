package com.login;
import java.awt.*;
import javax.swing.*;

public class Mypanel extends JPanel {
	Color color1;
	Color color2;
	Mypanel() {
		setLayout(null);

        //setLayout (new GridLayout(8, 2));
		setBounds(0, 100, 800, 600);
		setVisible(false);
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
		g2D.setPaint(gp);
		g2D.fillRect(0, 0, getWidth(), getHeight());
	}
}
