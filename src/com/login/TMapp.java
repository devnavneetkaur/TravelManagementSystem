package com.login;

import javax.swing.*;

public class TMapp extends JFrame{
	
	static User_detail ud = new User_detail();
	static Booking booking = new Booking();
	static AccountSettings as = new AccountSettings();
	Menu menu = new Menu();
	TMapp(){
		 
		setLayout(null);
		setBounds(0, 0, 800,600);
		add(menu);
		add(ud);
		add(booking);
		add(as);
		setVisible(true);
		
	}

}
