import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] ltr = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}, 
			{'j','k','l'}, {'m', 'n', 'o'}, {'p','q','r','s'}, 
				{'t','u','v'}, {'w','x','y','z'}};
		
		while (true) {
			String s = sc.next();
			int time = 0;
			
			if (s.equals("halt")) {
				break;
			} 
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < 8; j++) {
					int index = 0;
					for (char e : ltr[j]) {
						if (i != 0 && s.charAt(i - 1) == e) {
							index += 2;
						}
					}
					for (char e : ltr[j]) {
						index++;
						if (s.charAt(i) == e) {
							time += index;
							break;
						}
					}
				}
			}
			
			System.out.println(time);
		}
	
		sc.close();
	}
}