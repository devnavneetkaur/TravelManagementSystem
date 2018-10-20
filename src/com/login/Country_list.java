package com.login;

import java.text.*;
import java.util.*;

public class Country_list {

	List<Country> countries = new ArrayList<Country>();

	Country_list() {

		Locale[] locales = Locale.getAvailableLocales();
		for (Locale locale : locales) {
			try {
				String iso = locale.getISO3Country();
				String code = locale.getCountry();
				String name = locale.getDisplayCountry();
				if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
					countries.add(new Country(iso, code, name));
				}
			} catch (MissingResourceException e) {

			}
		}

	}

	public List get_list() {
		return countries;

	}
}

class Country {
	private String iso;

	private String code;

	public String name;

	Country(String iso, String code, String name) {
//		this.iso = iso;
//		this.code = code;
		this.name = name;
	}

	public String toString() {
		return name.toUpperCase();
	}
}
