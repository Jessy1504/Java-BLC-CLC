package com.bls.cls;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 =new Student();
		s1.setStudentDetails("ABC", 101, 85.5);
		String res =s1.getStudentDetails();
		System.out.println(res);
		
	}

}
