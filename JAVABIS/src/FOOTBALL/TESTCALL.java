package FOOTBALL;

import java.util.Arrays;

public class TESTCALL {
	public static void main(String[]args){
		YAYA_SANAGO R = new YAYA_SANAGO();
		String a = R.getName();
		String x = R.getPosition();
		String[] y = R.getfriend();
		System.out.println("NAME : " +a);
		System.out.println("POSITION : " + x);
		System.out.println("FRIEND : " +Arrays.toString(y));
		
		
	}
}
