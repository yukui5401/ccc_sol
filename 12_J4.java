import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		String ans = "";
		int A = (int) 'A';
		int Z = (int) 'Z';
		for (int i = 0; i < s.length(); i++) {
			int x = (int) s.charAt(i);
			x -= 3 * (i + 1) + k;
		 	if (x < A) {
		 		int d = (A - x) % 26;
				if (d > 0) {
					x = Z - (d - 1);
				} else {
					x = A;
				}
		 	}
			ans += Character.toString(x);
		}
		System.out.println(ans);
		
		sc.close();
	}
}