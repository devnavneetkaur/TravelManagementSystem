package com.login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
//import java.beans.Statement;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame/* implements ActionListener */ {

	JPanel panel;
	JLabel login_label, email_label, password_label;
	static JTextField email_textfield;
	static JPasswordField password_field;
	JButton login_btn, forgot_email_btn, forgot_pswd_btn, create_account_btn;

	Login() {

		login_label = new Mylabel("login");
		Font font = new Font("Cooper Black", Font.BOLD, 30);
		login_label.setFont(font);
		login_label.setBounds(140, 10, 150, 50);
		login_label.setOpaque(true);
		login_label.setForeground(Color.WHITE);
		login_label.setBackground(Color.BLUE);
		login_label.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		login_label.setHorizontalAlignment(login_label.CENTER);
		add(login_label);

		email_label = new Mylabel("Enter Email");
		email_label.setBounds(10, 100, 120, 25);
		add(email_label);
		email_textfield = new Mytextfield();
		email_textfield.setBounds(140, 100, 150, 25);
		add(email_textfield);
		email_textfield.addKeyListener((KeyListener) email_textfield);

		forgot_email_btn = new JButton("Forgot email?");
		forgot_email_btn.setForeground(Color.BLUE);
		forgot_email_btn.setContentAreaFilled(false);
		forgot_email_btn.setBorder(null);
		add(forgot_email_btn);
		forgot_email_btn.setBounds(10, 130, 80, 35);

		password_label = new Mylabel("Enter password");
		password_label.setBounds(10, 170, 120, 25);
		add(password_label);
		password_field = new Mypasswordfield();
		password_field.setEchoChar('*');
		password_field.setBounds(140, 170, 150, 25);
		add(password_field);
		password_field.addKeyListener((KeyListener) password_field);

		forgot_pswd_btn = new JButton("Forgot pswd?");
		forgot_pswd_btn.setForeground(Color.BLUE);
		forgot_pswd_btn.setContentAreaFilled(false);
		forgot_pswd_btn.setBorder(null);
		add(forgot_pswd_btn);
		forgot_pswd_btn.setBounds(10, 200, 80, 35);

		create_account_btn = new MyButton("Create Account");
		create_account_btn.setForeground(Color.BLUE);
		create_account_btn.setContentAreaFilled(false);
		Font f = new Font("Cooper Black", Font.BOLD, 15);
		create_account_btn.setFont(f);
		create_account_btn.setBorder(null);
		add(create_account_btn);
		create_account_btn.setBounds(10, 260, 130, 35);
		create_account_btn.addActionListener((ActionListener) create_account_btn);


		login_btn = new MyButton("login");
		login_btn.setForeground(Color.WHITE);
		login_btn.setBackground(getBackground().BLUE);
		login_btn.setFont(new Font("Cooper Black", Font.BOLD, 15));
	    login_btn.addActionListener((ActionListener) login_btn);

		add(login_btn);
		login_btn.setBounds(160, 260, 90, 35);

		setLayout(null);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 500);
		setLocation((int) (d.width / 2 - getSize().getWidth() / 2), (int) (d.height / 2 - getSize().getHeight() / 2));
	}

	public static void main(String[] args) {

		
		new DBConnect("Project",new  Login());
		

	}


}
