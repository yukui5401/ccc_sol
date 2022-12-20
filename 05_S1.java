import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		while (t-- > 0) {
			String s = sc.next(), out = "";
			s = s.replace("-", "");
			s = s.substring(0, 10);
			for (int i = 0; i < s.length(); i++) {
				boolean alpha = true;
				char a = s.charAt(i);
				for (char c : num) {
					if (a == c) {
						alpha = false;
						break;
					} 
				}
				if (alpha) {
					if (a == 'A' || a == 'B' || a == 'C') {
						out += "2";
					} else if (a == 'D' || a == 'E' || a == 'F') {
						out += "3";
					} else if (a == 'G' || a == 'H' || a == 'I') {
						out += "4";
					} else if (a == 'J' || a == 'K' || a == 'L') {
						out += "5";
					} else if (a == 'M' || a == 'N' || a == 'O') {
						out += "6";
					} else if (a == 'P' || a == 'Q' || a == 'R' || a == 'S') {
						out += "7";
					} else if (a == 'T' || a == 'U' || a == 'V') {
						out += "8";
					} else {
						out += "9";
					}
				} else {
					out += a;
				}
			}
			out = out.substring(0,3) + "-" + out.substring(3,6) + "-" + out.substring(6);
			System.out.println(out);
		}
		
		sc.close();
	}
}