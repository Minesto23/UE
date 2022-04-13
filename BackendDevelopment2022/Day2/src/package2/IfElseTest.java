package package2;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 40.8;
		double y = 16.9;
		double z = 77.9;
		double max = 0;
		
		if (x > max) {
			max = x;
		} 
		if (y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		
		System.out.println("The maximun is " + max);
	}

}
