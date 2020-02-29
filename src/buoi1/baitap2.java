package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class baitap2 {


	public static void main(String[] args) {
		float scoreMath = 0;
		float scorePhysic = 0;
		float scoreChemistry = 0;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("====XẾP LOẠI====");
		System.out.println("====VUI LÒNG NHẬP �?IỂM C�?C MÔN HỌC====");
		System.out.println("====NHẬP �?IỂM MÔN TO�?N(0 - 10)====");
		float i;
		while (a == true) {
			try {
				sc.nextLine();
				i = sc.nextFloat();
				if (checkScore(i)) {
					scoreMath = i;
					a = false;
				} else {
					System.out.println("nhập điểm từ 0 - 10");
				}
			} catch (Exception e) {
				System.out.println("lỗi rồi bạn ơi");
			}
		}
		System.out.println("====NHẬP �?IỂM MÔN VẬT L�?====");
		while (b == true) {
			try {
				i = sc.nextFloat();
				if (checkScore(i)) {
					scorePhysic = i;
					b = false;
				} else {
					System.out.println("nhập điểm từ 0 - 10");
				}
			} catch (Exception e) {
				System.out.println("lỗi rồi bạn ơi");
			}
		}
		System.out.println("====NHẬP �?IỂM MÔN HÓA HỌC====");
		while (c == true) {
			try {
				i = sc.nextFloat();
				if (checkScore(i)) {
					scoreChemistry = i;
					c = false;
				} else {
					System.out.println("nhập điểm từ 0 - 10");
				}
			} catch (Exception e) {
				System.out.println("lỗi rồi bạn ơi");
			}
		}
		System.out.println("XẾP LOẠI CỦA BẠN LÀ : " + avgScore(scoreMath, scorePhysic, scoreChemistry));

	}

	private static String avgScore(float scoreMath, float scorePhysic, float scoreChemistry) {
		float avgScore;
		avgScore = (scoreMath + scorePhysic + scoreChemistry) / 3;
		if (avgScore >= 8.0f) {
			return "A";
		} else if (avgScore >= 6.5f) {
			return "B";
		} else if (avgScore >= 5.0f) {
			return "C";
		} else {
			return "D";
		}
	}

	private static boolean checkScore(float score) {
		if (score >= 0 && score <= 10) {
			return true;
		} else {
			return false;
		}
	}
}
