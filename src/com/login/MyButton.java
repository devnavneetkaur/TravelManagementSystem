package com.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class MyButton extends JButton implements ActionListener {
	public MyButton(String s) {
		setForeground(Color.WHITE);
		setBackground(getBackground().BLUE);
		setFont(new Font("Cooper Black", Font.BOLD, 15));
		setText(s);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Register")) {
			DBConnect.register_userDB();

		} else if (e.getActionCommand().equals("Already Registered? Log in")) {
			System.out.println("already registerd");
			try {
				DBConnect.con.close();
				DBConnect.greg.dispose();
				new DBConnect("Project", new Login());
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		} else if (e.getActionCommand().equals("login")) {
			DBConnect.login_userDB();
			System.out.println("login");
			DBConnect.glog.dispose();
		} else if (e.getActionCommand().equals("Create Account")) {
			try {
				DBConnect.con.close();
				DBConnect.glog.dispose();
				new DBConnect("Project", new Register());
			} catch (SQLException e1) {

				e1.printStackTrace();
			}

		}

	}

}
