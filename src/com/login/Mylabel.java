package com.login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Mylabel extends JLabel {
	
	

	Mylabel(String s) {
		setText(s);
		Font font = new Font("Cooper Black", Font.BOLD, 15);
		setForeground(Color.BLACK);
		setFont(font);
		setHorizontalAlignment(LEFT);
		setVerticalAlignment(BOTTOM);
		setVisible(true);
	}

	
}
