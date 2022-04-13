package package2;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		x = 10;
		y = 13;
		
		System.out.println("x = " + x + " y = " +  y);
		
		if(x > y) {
			int t = x;
			x = y;
			y = t;
			
			System.out.println("x = " + x + " y = " +  y);	
		}
		
		
	}

}
