package week4;

public class Maximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[] = {3.5,7.9,0.0,-7.9,10.99,78.9,66.8,19.01,18.9,99.7};
		double maximum = x[0];
		
		for(int i=1;i<x.length;i++) {
			if (x[i]>maximum) {
				maximum = x[i];
			}
		}
		System.out.println("The maximum number inside the vector is " + maximum);
	}

}
