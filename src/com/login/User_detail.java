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

public class User_detail extends Mypanel {

	Mylabel user_detail_label, first_name_label, last_name_label, dob_label, sex_label, email_label, phoneno_label,
			country_label, pincode_label, question_label, password_label, cross_label,
			user_detail_value, first_name_value, last_name_value, dob_value, sex_value, email_value, phoneno_value,
			country_value, pincode_value, question_value, password_value, cross_value;
	Mylabel display_pic;
	
	
	User_detail() {
		
		color1 = Color.BLACK;
		color2 = Color.gray;

		Font font = new Font("Cooper Black", Font.BOLD, 20);
		
		//display_pic = new Mylabel();
		first_name_label = new Mylabel("First Name");
		first_name_label.setForeground(Color.WHITE);
		first_name_label.setBounds(30, 100, 250, 25);
		first_name_label.setFont(font);
		add(first_name_label);
		
		first_name_value = new Mylabel(null);
		first_name_value.setForeground(Color.WHITE);
		first_name_value.setBounds(150, 100, 250, 25);
		first_name_value.setFont(font);
		add(first_name_value);

		last_name_label = new Mylabel("Last Name");
		last_name_label.setForeground(Color.WHITE);
		last_name_label.setBounds(30, 140, 250, 25);
		last_name_label.setFont(font);
		add(last_name_label);

		last_name_value = new Mylabel(null);
		last_name_value.setForeground(Color.WHITE);
		last_name_value.setBounds(150, 140, 250, 25);
		last_name_value.setFont(font);
		add(last_name_value);
		
		dob_label = new Mylabel("Birth Date");
		dob_label.setForeground(Color.WHITE);
		dob_label.setBounds(30, 180, 400, 25);
		dob_label.setFont(font);
		add(dob_label);

		dob_value = new Mylabel(null);
		dob_value.setForeground(Color.WHITE);
		dob_value.setBounds(150, 180, 400, 25);
		dob_value.setFont(font);
		add(dob_value);
		
		sex_label = new Mylabel("Sex");
		sex_label.setForeground(Color.WHITE);
		sex_label.setBounds(30, 220, 400, 25);
		sex_label.setFont(font);
		add(sex_label);

		sex_value = new Mylabel(null);
		sex_value.setForeground(Color.WHITE);
		sex_value.setBounds(150, 220, 400, 25);
		sex_value.setFont(font);
		add(sex_value);
		
		email_label = new Mylabel("Email");
		email_label.setForeground(Color.WHITE);
		email_label.setBounds(30, 260, 400, 25);
		email_label.setFont(font);
		add(email_label);
		
		email_value = new Mylabel(null);
		email_value.setForeground(Color.WHITE);
		email_value.setBounds(150, 260, 400, 25);
		email_value.setFont(font);
		add(email_value);

		phoneno_label = new Mylabel("Phone no");
		phoneno_label.setForeground(Color.WHITE);
		phoneno_label.setBounds(30, 300, 400, 25);
		phoneno_label.setFont(font);
		add(phoneno_label);

		phoneno_value = new Mylabel(null);
		phoneno_value.setForeground(Color.WHITE);
		phoneno_value.setBounds(150, 300, 400, 25);
		phoneno_value.setFont(font);
		add(phoneno_value);
		
		country_label = new Mylabel("Country");
		country_label.setForeground(Color.WHITE);
		country_label.setBounds(30, 340, 400, 25);
		country_label.setFont(font);
		add(country_label);

		country_value = new Mylabel(null);
		country_value.setForeground(Color.WHITE);
		country_value.setBounds(150, 340, 400, 25);
		country_value.setFont(font);
		add(country_value);
		
		pincode_label = new Mylabel("PinCode");
		pincode_label.setForeground(Color.WHITE);
		pincode_label.setBounds(30, 380, 400, 25);
		pincode_label.setFont(font);
		add(pincode_label);
		
		pincode_value = new Mylabel(null);
		pincode_value.setForeground(Color.WHITE);
		pincode_value.setBounds(150, 380, 400, 25);
		pincode_value.setFont(font);
		add(pincode_value);

	}

}
