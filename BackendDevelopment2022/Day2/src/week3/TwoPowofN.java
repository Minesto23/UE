package week3;

public class TwoPowofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		int i = 0;
		double pow = 1;
		
		while(i<N) {
			pow*=2;
			i++;
		}
		
		System.out.println(pow);
		

	}

}
