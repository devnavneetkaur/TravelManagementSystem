package com.login;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Menu extends Mypanel {
	Menu()
	{
		setBounds(0, 0, 800, 100);
		add(new A_Menu());
		add(new B_Menu());
		add(new P_Menu());
		color1 = Color.BLACK;
		color2 = Color.cyan;
		setVisible(true);
	}
	
}
