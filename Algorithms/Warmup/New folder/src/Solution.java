import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int lastInt;
		int negativeCounter = 0;
		int zeroCounter = 0;
		int positiveCounter = 0;
		
		scanner.nextLine();
		
		for (int i = 0; i < n; i++) {
			lastInt = scanner.nextInt();
			
			switch (Integer.signum(lastInt)) {
			case -1:
				negativeCounter++;
				break;
			case 0:
				zeroCounter++;
				break;
			case 1:
				positiveCounter++;
				break;
			default:
				break;
			}
		}
		//POSITIVE
		System.out.format("%.3f", (float) positiveCounter/n);
		System.out.println();
			
		//NEGATIVE
		System.out.format("%.3f", (float) negativeCounter/n);
		System.out.println();
		
		//ZEROS
		System.out.format("%.3f", (float) zeroCounter/n);		

	}

}
