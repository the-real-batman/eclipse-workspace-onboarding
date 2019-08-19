package com.amdocs;

import java.util.HashMap;

public class Contacts {
	
	private HashMap<String, String> contacts;

	public static void main(String[] args) {
		

	}

	public Contacts() {
		this.contacts = new HashMap<String,String>();
	}
	
	public void addContact(String name, String mobile) {
		contacts.put(mobile, name);
	}
	
	public String findNameByMobile(String mobileno) {
		String name = contacts.get(mobileno);
		if (name==null)
			return mobileno;
		else
			return name;
	}

}




