package buoi2;

import java.util.Scanner;

public class btap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter from keyboard");
		int month =sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("January has 31 days");
			break;
		case 2:
			System.out.println("February has 28 days");
			break;
		case 3:
			System.out.println("March has 31 days");
			break;
		case 4:
			System.out.println("April has 30 day");
			break;
		case 5:
			System.out.println("May has 31 day");
			break;
		case 6:
			System.out.println("June has 30 day");
			break;
		case 7:
			System.out.println("July has 31 day");
			break;
		case 8:
			System.out.println("August has 31 day");
			break;
		case 9:
			System.out.println("September has 30 day");
			break;
		case 10:
			System.out.println("October has 31 day");
			break;
		case 11:
			System.out.println("November has 30 day");
			break;
		case 12:
			System.out.println("December has 31 day");
			break;
		default:
			System.out.println("You entered is not valid");
			break;
		}
	}
}