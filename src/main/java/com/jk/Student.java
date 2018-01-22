package com.jk;

public class Student {
	private int roll;
	private String name;
	private String email;
	private String stream;
	//Empty constructor
	public Student(){}
	//Parameterized constructor
	public Student(int rollNo, String stName, String emailId, String subjectStram){
		roll = rollNo;
		name = stName;
		email = emailId;
		stream = subjectStram;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", stream=" + stream + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
}
