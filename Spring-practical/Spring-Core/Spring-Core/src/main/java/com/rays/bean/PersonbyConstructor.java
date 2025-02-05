package com.rays.bean;

public class PersonbyConstructor {
	private String name = null;
	private String address = null;
	
	public PersonbyConstructor(String name,String address) {
		this.name = name ;
		this.address = address;
	
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	

}
