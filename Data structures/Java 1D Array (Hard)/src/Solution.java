import java.util.Scanner;

public class Solution {
	private boolean[] results;
	private int[] pathway;
	private int m;
	private int p = 0;
	
	
	private void loadData(){
		int T, n;
		Scanner scanner = new Scanner(System.in);
		
		T = scanner.nextInt();
		
		for(int i = 0; i < T; i++){
			n = scanner.nextInt();
			m = scanner.nextInt();
			pathway = new int[n];
			for(int j = 0; j < n; j++){
				pathway[j] = scanner.nextInt();
			}
			this.analize(0);
		}
		scanner.close();
	}
	
	private void analize(int p){
		if ( pathway[p + m] == 0){
			analize( p + m);
		}
		if ( pathway[p + 1] == 0){
			analize( p + 1);	
		}
		if ( (p - 1 > 0) && (pathway[p - 1] == 0)){
			analize( p - 1);	
		}
	} 
	
	
	public void go(){
		this.loadData();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		solution.go();

	}

}
