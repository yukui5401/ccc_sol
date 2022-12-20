import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), e = 0, f = 0;
		sc.nextLine();
		while (n-- > 0) {
			String k = sc.nextLine().trim().toLowerCase();
			for (int i = 0; i < k.length(); i++) {
				if (k.charAt(i) == 's') {
					f++;
				} else if (k.charAt(i) == 't') {
					e++;
				}
			}
		}
		if (e > f) {
			System.out.println("English");
		} else {
			System.out.println("French");
		}
		sc.close();
	}
}