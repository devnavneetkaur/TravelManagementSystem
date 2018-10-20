package com.login;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Menu_Item extends JPanel implements MouseListener{
	
	Color color1;
	Color color2;
	Mylabel text = new Mylabel(null);

	Menu_Item() {
		Font font = new Font("Cooper Black", Font.BOLD, 15);
		setFont(font);
		setLayout(null);
		setBounds(0, 0, 120, 80);
		setBackground(new Color(0, 0, 0, 0));
		add(text);
		addMouseListener(this);
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
		g2D.setPaint(gp);
		g2D.fillOval(20, 10, 100, 60);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.toString().contains("A_Menu"))
		{
			TMapp.as.setVisible(true);
			TMapp.ud.setVisible(false);
			TMapp.booking.setVisible(false);
		}
		else if(e.toString().contains("P_Menu"))
		{
			TMapp.as.setVisible(false);
			TMapp.ud.setVisible(true);
			TMapp.booking.setVisible(false);
		
			
		}
		else if(e.toString().contains("B_Menu"))
		{
			TMapp.as.setVisible(false);
			TMapp.ud.setVisible(false);
			TMapp.booking.setVisible(true);
		
			
		}
		}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
