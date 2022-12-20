import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.println("*".repeat(k) + "x".repeat(k) + "*".repeat(k));
		}
		for (int i = 0; i < k; i++) {
			System.out.println(" ".repeat(k) + "x".repeat(2 * k));
		}
		for (int i = 0; i < k; i++) {
			System.out.println("*".repeat(k) + " ".repeat(k) + "*".repeat(k));
		}
		sc.close();
	}
}