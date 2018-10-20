package com.login;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MyComboBox extends JComboBox implements ActionListener {
	static String country, city, question;

	public MyComboBox(String[] s) {
		super(s);
		
		setVisible(true);
	}

	public MyComboBox() {
		super();
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().toString().contains("country")) {
			country = getSelectedItem().toString();
			System.out.println("country elected" + country);
		} else if (e.getSource().toString().contains("city")) {
			city = getSelectedItem().toString();
			System.out.println("city elected" + city);
		}

		else if (e.getSource().toString().contains("question")) {
			question = getSelectedItem().toString();
			System.out.println("question elected" + question);
		}
	}

}
