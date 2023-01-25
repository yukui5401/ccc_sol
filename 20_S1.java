import java.util.*;

public class Main {
	
	public static void sortbyColumn(int arr[][], int col) {
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] first, int[] second) {
				if (first[col] > second[col]) 
					return 1;
				else 
					return -1;
			}
		});
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double max = 0;
		int[][] a = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
		sortbyColumn(a, 0);
		
		for (int i = 0; i < n - 1; i++) {
			double s = Math.abs(a[i + 1][1] - a[i][1]);
			s /= a[i + 1][0] - a[i][0];
			if (s > max) {
				max = s;
			}
		}
		
		System.out.println(max);
		
		
		sc.close();
	}
}	