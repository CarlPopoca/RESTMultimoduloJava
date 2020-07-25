package com.microservicio.model;

import java.math.BigInteger;

public class Contact {
 private String id;
 private String name;
 private String gender;
 private int mobile;
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public Contact(String id, String name, String gender, int mobile) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.mobile = mobile;
}
 
}
