package com.login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Mytextfield extends JTextField implements KeyListener {
	Mytextfield() {
		setHorizontalAlignment(LEFT);
		setFont(new Font("Cooper Black", Font.BOLD, 12));
//		setCursor());
		setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {

		char key = e.getKeyChar();

		Object src = e.getSource();
		try {

			if (src.equals(DBConnect.greg.first_name_textfield)) {

				if (!((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z'))) {
					e.consume();
					DBConnect.greg.first_name_textfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else if (DBConnect.greg.first_name_textfield.getText().toString().length() > 31) {
					e.consume();
				} else {
					DBConnect.greg.first_name_textfield.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
			} else if (src.equals(DBConnect.greg.last_name_textfield)) {
				if (!((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z'))) {
					e.consume();
					DBConnect.greg.last_name_textfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else if (DBConnect.greg.last_name_textfield.getText().toString().length() > 31) {
					e.consume();
				} else {
					DBConnect.greg.last_name_textfield.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}

			} else if (src.equals(DBConnect.greg.phoneno_textfield)) {
				if (!(key >= '0' && key <= '9')) {
					e.consume();
				} else if (DBConnect.greg.phoneno_textfield.getText().toString().length() > 9) {
					e.consume();
				}

			} else if (src.equals(DBConnect.greg.pincode_textfield))

			{
				if (!(key >= '0' && key <= '9')) {
					e.consume();
				} else if (DBConnect.greg.pincode_textfield.getText().toString().length() > 5) {
					e.consume();
				}

			} else if (src.equals(DBConnect.greg.email_textfield)) {
				if (DBConnect.greg.email_textfield.getText().toString()
						.matches("^[(a-z-A-Z-0-9-\\_\\.)]+@[(a-zA-Z)]+\\.[(a-zA-Z)]{2,3}$")) {
					System.out.println("valid");
				} else {
					System.out.println("invalid ");
				}

			} else if (src.equals(DBConnect.greg.question_textfield)) {

				if (!((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z') || (key >= '0' && key <= '9'))) {
					e.consume();
					DBConnect.greg.question_textfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else if (DBConnect.greg.first_name_textfield.getText().toString().length() > 20) {
					e.consume();
				} else {
					DBConnect.greg.question_textfield.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			if (src.equals(DBConnect.glog.email_textfield)) {
				if (DBConnect.glog.email_textfield.getText().toString()
						.matches("^[(a-z-A-Z-0-9-\\_\\.)]+@[(a-zA-Z)]+\\.[(a-zA-Z)]{2,3}$")) 
				{
					System.out.println("valid");
					DBConnect.glog.email_textfield.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					
				} else {
					System.out.println("invalid ");
					DBConnect.glog.email_textfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
			}
		} catch (Exception ex1) {
			System.out.println(ex1);

		}
	}
}
