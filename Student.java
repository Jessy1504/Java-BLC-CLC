package com.bls.cls;

	public class Student {
			private String name;
			private int rollNumber;
			private double percentage;

	public void setStudentDetails(String nm, int roll, double perc) {
			this.name = nm;
			this.rollNumber = roll;
			this.percentage = perc;
	}
	public String getStudentDetails() {
			return "Student Name  : " + name + "\nroll " + rollNumber +"\npercentage " +  percentage ;
			
	}
}
