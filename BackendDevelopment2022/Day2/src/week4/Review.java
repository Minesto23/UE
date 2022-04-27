package week4;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;	// Counter
		
		// while loop
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// for loop
		for(int j=12; j<22; j+=2) {
			System.out.println(j);
		}
		
		//Neested loop
		int counter = 0;
		for(int j=12; j<22; j+=2) {
			System.out.println(j);
			for(int k=3; k<7; k++) {
				System.out.println(j);
				counter++;
			}
		}
		System.out.println("counter: "+counter);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		// Do while loop
		
		int N = 0;
		
		do {
			System.out.println(N);
			N++;
		}while(N<9);


	}

}
