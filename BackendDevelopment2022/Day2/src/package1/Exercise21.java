package package1;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5;
		double f;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		
		x = obj.nextDouble();
		
		f = 3 * Math.pow(x, 3) - 5 * Math.sqrt(Math.abs(x)) + 3 * Math.pow(x, 2) - Math.exp(-3*x);
		
		System.out.println(f);

	}

}
