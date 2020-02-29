package buoi2;

import java.util.Scanner;

public class btap1 {
	public static void main(String[] args) {
		Student student = new Student("SV01", "Hoang Viet", 24, true);
		Scanner sc = new Scanner(System.in);
		while (true) {
			studentManagement();
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				student.showInfo();
				break;
			case 2:
				student.editInfo(sc);
				break;
			case 3:
				enterInfo(sc);
				break;
			}
		}
	}

	private static void studentManagement() {
		System.out.println("Student management");
		System.out.println("1 : Print student’s information to screen");
		System.out.println("2 : Edit student’s information");
		System.out.println("3 : Inputs a list of student from keyboard");
	}

	public static void enterInfo(Scanner sc) {
		while(true) {
			Student student = new Student();
			int i;
			String next;
			System.out.println("Enter Info");
			System.out.println("Enter student code:");
			student.setStudentCode(sc.next());
			System.out.println("Enter student name:");
			student.setStudentName(sc.next());
			System.out.println("Enter student age");
			student.setStudentAge(sc.nextInt());
			System.out.println("Enter student sex(1: male or 2 : female)");
			i = sc.nextInt();
			if (i == 1) {
				student.setStudentSex(true);
			} else {
				student.setStudentSex(false);
			}	
			System.out.println("bạn có muốn tiếp tục ko?(n- exit)");
			next = sc.next();
			if (next.equalsIgnoreCase("n")) {
				return;
			}
		}
	}
}
