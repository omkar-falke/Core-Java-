package com.app.Student_Information;
public class Stud
{
	 public static void main(String[] args) 
	{
		System.out.println("Student Information");
	 	Student s1=new Student();
	 	s1.roll_no=101;
	 	s1.name="Omkar";
	 	s1.address="Near Shivaji Chowk Vadgaon Pune";
		s1.display();
		String mo=s1.m2();
		System.out.println("Mobile no="+mo);
		System.out.println("Main End ---");
	}

}