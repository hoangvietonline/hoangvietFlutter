package buoi2;

import java.util.Scanner;

public class Student {
	private String studentCode;
	private String studentName;
	private int studentAge;
	private boolean studentSex;

	public Student() {
	}

	public Student(String studentCode, String studentName, int studentAge, boolean studentSex) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSex = studentSex;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public boolean isStudentSex() {
		return studentSex;
	}

	public void setStudentSex(boolean studentSex) {
		this.studentSex = studentSex;
	}

	public void showInfo() {
		System.out.println("Student Info:");
		System.out.println("Code: " + this.studentCode);
		System.out.println("Name: " + this.studentName);
		System.out.println("Age: " + this.studentAge);
		if (studentSex) {
			System.out.println("Sex: male");
		} else {
			System.out.println("Sex: female");
		}
	}

	public void editInfo(Scanner sc) {
		int i;
		System.out.println("Edit Info");
		System.out.println("Edit student code:");
		setStudentCode(sc.next());
		System.out.println("Edit student name:");
		setStudentName(sc.next());
		System.out.println("Edit student age");
		setStudentAge(sc.nextInt());
		System.out.println("Edit student sex(1: male or 2 : female)");
		i = sc.nextInt();
		if (i == 1) {
			setStudentSex(true);
		} else {
			setStudentSex(false);
		}
	}
	
}
