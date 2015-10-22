import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int lastInput;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				lastInput = scanner.nextInt();
				
				if (i == j)
					sum1 += lastInput;
				if ( (i + j) == (n + 1) )
					sum2 += lastInput;
			}
		}
		System.out.println(Math.abs(sum1 - sum2));
	}

}
