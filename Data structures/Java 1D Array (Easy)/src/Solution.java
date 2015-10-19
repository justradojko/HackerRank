import java.util.Scanner;

public class Solution {
	private int[] anArray;
	private int numberOfSubarrays = 0;
	
	public void calculate(){
		int sum = 0;
		for(int i = 0; i < anArray.length; i++){
			sum = 0;
			for(int j = i; j < anArray.length; j++){
				sum += anArray[j];
				if (sum < 0){
					System.out.println("["+i+":"+j+"]");
					numberOfSubarrays++;
				}
			}
		}
		System.out.println(numberOfSubarrays);
	}
	
	private void dataInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = Integer.parseInt(sc.nextLine());

		anArray = new int[n];
		
		for(int i = 0; i < n; i++){
			anArray[i] = sc.nextInt();
		}
		sc.close();
	}

	
	public void go(){
		this.dataInput();
		this.calculate();
	}
	
	public static void main(String[] args) {
	
		Solution solution = new Solution();
		solution.go();
	}

}
