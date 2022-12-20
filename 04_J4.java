import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String k = sc.next(); 
		sc.nextLine();
		String s = sc.nextLine().trim();
		
		s = s.replaceAll("[^A-Z]", ""); 
		int sl = s.length();
		
		for (int i = 0; i < k.length(); i++) {
			char l = k.charAt(i);
			int sh = (int) l;
			sh -= 65;
			for (int j = i; j < sl; j += k.length()) {
				char l2 = s.charAt(j);
				int sh2 = (int) l2;
				sh2 += sh;
				if (sh2 > 90) {
					sh2 = sh2 % 90 + 64;
				} 
				char f = (char) sh2;
				if (j < sl - 1) {
					s = s.substring(0,j) + f + s.substring(j + 1);
				} else {
					s = s.substring(0,j) + f;
				}
			}
		}
		System.out.println(s);
		
		
		
		sc.close();
	}
}