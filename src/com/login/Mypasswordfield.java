package com.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JPasswordField;

public class Mypasswordfield extends JPasswordField implements KeyListener {

	public Mypasswordfield() {

		setHorizontalAlignment(LEFT);
		setFont(new Font("Cooper Black", Font.BOLD, 12));
		setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {

		char key = e.getKeyChar();

		Object src = e.getSource();
		try {
			if (src.equals(DBConnect.greg.password_field)) {
				if (DBConnect.greg.password_field.getText().toString()
						.matches("^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{7,9})$")) // pass min 8 ,max 10
																							// characters long
				{
					DBConnect.greg.password_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				} else {
					DBConnect.greg.password_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				}
			} else if (src.equals(DBConnect.greg.confirm_password_field)) {
				if (DBConnect.greg.confirm_password_field.getText().toString()
						.matches("^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{7,9})$")) // pass min 8 ,max 10
																							// characters long
				{
					DBConnect.greg.confirm_password_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				} else {
					DBConnect.greg.confirm_password_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				}
			}

		} catch (Exception ex) {

		}
		try {
			if (src.equals(DBConnect.glog.password_field)) {
				if (DBConnect.glog.password_field.getText().toString()
						.matches("^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{7,9})$")) // pass min 8 ,max 10
																							// characters long
				{
					DBConnect.glog.password_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				} else {
					DBConnect.glog.password_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				}
			}
		} catch (Exception ex) {

		}
	}

}
