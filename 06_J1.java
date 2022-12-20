import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int cal = 0;
		if (a == 1) {
			cal += 461;
		} else if (a == 2) {
			cal += 431;
		} else if (a == 3) {
			cal += 420;
		}
		if (b == 1) {
			cal += 100;
		} else if (b == 2) {
			cal += 57;
		} else if (b == 3) {
			cal += 70;
		}
		if (c == 1) {
			cal += 130;
		} else if (c == 2) {
			cal += 160;
		} else if (c == 3) {
			cal += 118;
		}
		if (d == 1) {
			cal += 167;
		} else if (d == 2) {
			cal += 266;
		} else if (d == 3) {
			cal += 75;
		}
		System.out.println("Your total Calorie count is " + cal + ".");
		sc.close();
	}
}