import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeAM_PM = sc.nextLine();
		String[] timeElements = new String[3];
		
		timeElements = timeAM_PM.split(":");
		
		if(timeElements[2].charAt(2) == 'P'){
			if(!timeElements[0].equals("12"))
				System.out.println(( Integer.parseInt(timeElements[0]) + 12 )+":"+timeElements[1]+":"+timeElements[2].substring(0, 2));
			else
				System.out.println("00:"+timeElements[1]+":"+timeElements[2].substring(0, 2));
		} else
			System.out.println(timeElements[0]+":"+timeElements[1]+":"+timeElements[2].substring(0, 2));
	}

}
