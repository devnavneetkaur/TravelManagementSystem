package com.login;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;

import org.jdesktop.swingx.JXDatePicker;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.synth.Region;

public class Register extends JFrame {
	
	JLabel register_label, first_name_label, last_name_label, dob_label, sex_label, email_label, phoneno_label,
			country_label, city_label, pincode_label, question_label, password_label, confirm_pswd_label, cross_label;

	JTextField first_name_textfield, last_name_textfield, sex_textfield, email_textfield, phoneno_textfield,
			country_textfield, city_textfield, pincode_textfield, question_textfield;
	JXDatePicker picker;
	static JRadioButton male_rbtn, female_rbtn, other_rbtn;
	ButtonGroup btngrp;
	JComboBox country_combo, city_combo, question_combo;
	JPasswordField password_field, confirm_password_field;
	JButton register_btn, already_register_btn;
	String security_que[] = { "what is your best friend name ?", "what is your mother's maiden name ?",
			"what is your favourite hangout place ?", "what is your favourite book ?" };

//	static String gender = "";
	public String[] getAllCountries() {
		String[] countries = new String[Locale.getISOCountries().length];
		String[] countryCodes = Locale.getISOCountries();
		for (int i = 0; i < countryCodes.length; i++) {
			Locale obj = new Locale("", countryCodes[i]);
			countries[i] = obj.getDisplayCountry();
		}
		return countries;
	}

	Register() {
		// register label start
		register_label = new Mylabel("Register");
		Font font = new Font("Cooper Black", Font.BOLD, 35);
		register_label.setFont(font);
		register_label.setBounds(150, 10, 200, 50);
		register_label.setOpaque(true);
		register_label.setForeground(Color.WHITE);
		register_label.setBackground(Color.BLUE);
		register_label.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		register_label.setHorizontalAlignment(register_label.CENTER);
		add(register_label);
		// register label end

		first_name_label = new Mylabel("First Name");
		first_name_label.setBounds(10, 100, 80, 25);
		add(first_name_label);
		first_name_textfield = new Mytextfield();
		first_name_textfield.setBounds(100, 100, 80, 25);
		add(first_name_textfield);

		last_name_label = new Mylabel("Last Name");
		last_name_label.setBounds(210, 100, 80, 25);
		add(last_name_label);
		last_name_textfield = new Mytextfield();
		last_name_textfield.setBounds(310, 100, 80, 25);
		add(last_name_textfield);

		dob_label = new Mylabel("Birth Date");
		dob_label.setBounds(10, 130, 80, 25);
		add(dob_label);
		picker = new JXDatePicker();
		picker.setDate(Calendar.getInstance().getTime());
		picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
		picker.setBounds(100, 125, 100, 25);
		add(picker);

		sex_label = new Mylabel("Sex");
		sex_label.setBounds(210, 130, 30, 25);
		add(sex_label);
		male_rbtn = new JRadioButton("Male");
		male_rbtn.setFont(new Font("Cooper Black", Font.BOLD, 15));
		male_rbtn.setBounds(250, 130, 60, 25);
		male_rbtn.setOpaque(false);
		add(male_rbtn);
		female_rbtn = new JRadioButton("Female");
		female_rbtn.setFont(new Font("Cooper Black", Font.BOLD, 15));
		female_rbtn.setBounds(320, 130, 80, 25);
		female_rbtn.setOpaque(false);
		add(female_rbtn);
		other_rbtn = new JRadioButton("Other");
		other_rbtn.setFont(new Font("Cooper Black", Font.BOLD, 15));
		other_rbtn.setBounds(410, 130, 80, 25);
		other_rbtn.setOpaque(false);
		add(other_rbtn);
		btngrp = new ButtonGroup();
		btngrp.add(male_rbtn);
		btngrp.add(female_rbtn);
		btngrp.add(other_rbtn);

		email_label = new Mylabel("Email");
		email_label.setBounds(10, 160, 60, 25);
		add(email_label);
		email_textfield = new Mytextfield();
		email_textfield.setBounds(100, 160, 80, 25);
		add(email_textfield);

		phoneno_label = new Mylabel("Phone no");
		phoneno_label.setBounds(210, 160, 70, 25);
		add(phoneno_label);
		phoneno_textfield = new Mytextfield();
		phoneno_textfield.setBounds(310, 160, 80, 25);
		add(phoneno_textfield);

		country_label = new Mylabel("Country");
		country_label.setBounds(10, 190, 70, 25);
		add(country_label);
		country_combo = new MyComboBox();
		country_combo.setBounds(100, 190, 80, 25);
		country_combo.addActionListener(country_combo);
		country_combo.setName("country");
		List countries = new Country_list().get_list();
		for (Object country : countries) {

			country_combo.addItem(country);

		}

		add(country_combo);

		city_label = new Mylabel("City");
		city_label.setBounds(210, 190, 70, 25);
		add(city_label);
		city_combo = new MyComboBox();
		city_combo.setName("city");
		city_combo.addActionListener(city_combo);
		city_combo.setBounds(310, 190, 80, 25);
		add(city_combo);

		pincode_label = new Mylabel("PinCode");
		pincode_label.setBounds(10, 220, 70, 25);
		add(pincode_label);
		pincode_textfield = new Mytextfield();
		pincode_textfield.setBounds(100, 220, 80, 25);
		add(pincode_textfield);

		question_label = new Mylabel("Select Security Question");
		question_label.setBounds(10, 250, 200, 25);
		add(question_label);
		question_combo = new MyComboBox(security_que);
		question_combo.addActionListener(question_combo);
		question_combo.setName("question");
		question_combo.setBounds(210, 250, 220, 25);
		add(question_combo);
		question_textfield = new Mytextfield();
		question_textfield.setBounds(10, 280, 420, 25);
		add(question_textfield);

		password_label = new Mylabel("Choose Password");
		password_label.setBounds(10, 310, 150, 25);
		add(password_label);
		password_field = new Mypasswordfield();
		password_field.setEchoChar('*');
		password_field.setBounds(150, 310, 80, 25);
		add(password_field);

		confirm_pswd_label = new Mylabel("Confirm Password");
		confirm_pswd_label.setBounds(10, 340, 150, 25);
		add(confirm_pswd_label);
		confirm_password_field = new Mypasswordfield();
		confirm_password_field.setEchoChar('*');
		confirm_password_field.setBounds(150, 340, 80, 25);
		add(confirm_password_field);

		register_btn = new MyButton("Register");
		register_btn.setBounds(195, 390, 110, 30);
		add(register_btn);
		register_btn.addActionListener((ActionListener) register_btn);

		already_register_btn = new MyButton("Already Registered? Log in");
		already_register_btn.setContentAreaFilled(false);
		already_register_btn.setBorder(null);
		already_register_btn.setForeground(Color.BLUE);
		add(already_register_btn);
		already_register_btn.setBounds(270, 430, 200, 35);
		already_register_btn.addActionListener((ActionListener) already_register_btn);

		first_name_textfield.addKeyListener((KeyListener) first_name_textfield);
		last_name_textfield.addKeyListener((KeyListener) last_name_textfield);
		phoneno_textfield.addKeyListener((KeyListener) phoneno_textfield);
		pincode_textfield.addKeyListener((KeyListener) pincode_textfield);
		email_textfield.addKeyListener((KeyListener) email_textfield);
		question_textfield.addKeyListener((KeyListener) question_textfield);
		password_field.addKeyListener((KeyListener) password_field);
		confirm_password_field.addKeyListener((KeyListener) confirm_password_field);
		
		setLayout(null);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, 500, 600);
		setLocation((int) (d.width / 2 - getSize().getWidth() / 2), (int) (d.height / 2 - getSize().getHeight() / 2));
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
