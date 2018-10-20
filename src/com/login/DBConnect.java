package com.login;

import java.sql.Connection;
import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class DBConnect {
	static Connection con;
	static Statement st;
	static Register greg;
	static Login glog;
	static User_detail user;

	static void login_userDB() {

		String sql = "select password from register where email = '" + glog.email_textfield.getText() + "'";

		try {
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				// System.out.println(sql);
				System.out.println(rs.getString(1));
				System.out.println(glog.password_field.getPassword());
				if (glog.password_field.getText().equals(rs.getString(1))) {
					System.out.println("password matched");
					DBConnect.glog.dispose();
					con.close();
					new DBConnect("Project", new TMapp());
				} else {
					System.out.println("password  not matched");
					new DBConnect("Project", new Login());
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("exit");

	}

	static void register_userDB() {
		int value_joptionpane;
		String gender = "";
		if (greg.male_rbtn.equals("Male")) {
			gender = gender + "Male";

		} else if (greg.female_rbtn.equals("Female")) {
			gender = gender + "Female";

		} else if (greg.other_rbtn.equals("Other")) {
			gender = gender + "Other";

		}

		String sql = "insert into register(first_name, last_name, birthdate, sex, email, phoneno, country, city, pincode, question, answer, password)"
				+ " values('" + greg.first_name_textfield.getText() + "', '" + greg.last_name_textfield.getText() + "',"
				+ " '" + greg.picker.getDate().toString().replace("00:00:00 IST ", "") + "', '" + gender + "', '"
				+ greg.email_textfield.getText() + "', '" + greg.phoneno_textfield.getText() + "'," + " '"
				+ greg.country_combo.getSelectedItem().toString() + "', '" + "none" + "'," + " '"
				+ greg.pincode_textfield.getText() + "', '" + greg.question_combo.getSelectedItem().toString() + "',"
				+ " '" + greg.question_textfield.getText() + "', '" + greg.password_field.getText() + "')";
		System.out.println(sql);

		try {
			int z = ((java.sql.Statement) st).executeUpdate(sql);
			if (z == 1) {
				System.out.println("values inserted");
			}
			value_joptionpane = JOptionPane.showOptionDialog(null, "Do you want to login?", "Registration complete",
					JOptionPane.YES_NO_OPTION, 0, null, null, null);
			System.out.println(value_joptionpane);

			switch (value_joptionpane) {

			case 0:
				con.close();
				greg.dispose();
				new DBConnect("Project", new Login());

				break;
			case 1:
				con.close();
				greg.dispose();

				break;
			default:
				con.close();
				JOptionPane.showMessageDialog(null, "Thank you ");
				greg.dispose();

			}

		}

		catch (SQLException e) {

			e.printStackTrace();
		}

	}

	static void user_detail_db(TMapp app) {
		System.out.println("hello");

		String getemail = "dev.navneetkaur@gmail.com";//glog.email_textfield.getText();// DBConnect.user.email_textfield.getText();
		
		String sql = "select * from register where email = '" + getemail + "'";
		System.out.println(sql);
		try {
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {

				System.out.println(rs.getString(5));

				if (getemail.equals(rs.getString(5))) {
					System.out.println("email matched");
					app.ud.first_name_value.setText(rs.getString(1));
					app.ud.last_name_value.setText(rs.getString(2));
					app.ud.dob_value.setText(rs.getString(3));
					app.ud.sex_value.setText(rs.getString(4));
					app.ud.email_value.setText(rs.getString(5));
					app.ud.phoneno_value.setText(rs.getString(6));
					app.ud.country_value.setText(rs.getString(7));
					app.ud.pincode_value.setText(rs.getString(9));

				} else {
					System.out.println("email not matched");

				}
			}

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public DBConnect(String s, Register register) {
		greg = register;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + s, "admin", "root");
			st = (Statement) con.createStatement();

		} catch (Exception e) {

		}

	}

	public DBConnect(String s, Login login) {
		glog = login;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + s, "admin", "root");
			st = (Statement) con.createStatement();

		} catch (Exception e) {

		}

	}

	public DBConnect(String s, TMapp app) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + s, "admin", "root");
			st = (Statement) con.createStatement();
			user_detail_db(app);

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {

		//new DBConnect("Project", new Register());
		new DBConnect("Project", new TMapp());

	}

}
