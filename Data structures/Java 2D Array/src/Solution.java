import java.util.Scanner;

public class Solution {
	private int[][] matrix = new int[6][6];
	
	public void go(){
		loadInput();
		analize();
	}
	
	private void loadInput(){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
	}
	
	private void analize(){
		int maxSum = -100;
		int temp;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(maxSum < ( temp = getHourglass(i, j))){
					maxSum = temp;
				}
			}
		}
		System.out.println(maxSum);
	}
		
	private int getHourglass(int i, int j){
		int sum = 0;
		sum += matrix[i][j];
		sum += matrix[i][j+1];
		sum += matrix[i][j+2];
		sum += matrix[i+1][j+1];
		sum += matrix[i+2][j];
		sum += matrix[i+2][j+1];
		sum += matrix[i+2][j+2];
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		solution.go();
	}

}
