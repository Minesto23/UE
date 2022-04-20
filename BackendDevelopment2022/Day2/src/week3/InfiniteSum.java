package week3;

public class InfiniteSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = Integer.parseInt(args[0]);
		int result = 0;
		
		for(int i = 0; i<=N ;i++) {
			result +=i;
		}
		System.out.println(result);
	}

}
