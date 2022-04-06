package package1;

public class TypeConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 7.9;
		double b =  8.1;
		int  c;
		double d = 9.9;
		double f;
		
		// Using brackets in JAVA
		f =  a * (b + d);
		System.out.println(f);
		
		// From Double to Int
		c = (int)a + (int)b;
		System.out.println(c);
		
		c = (int)(a + b);
		System.out.println(c);
		
		// From Int to double
		f = c;
		System.out.println(f);
		
		// From string to int
		String str1 = "123";
		c = Integer.parseInt(str1) + 99;
		System.out.println(c);

		// From string to double
		String str2 = "12.6";
		f = Double.parseDouble(str2) + 99;
		System.out.println(f);
		
		// From int, double to String
		str1 = a + "";
		System.out.println(str1);
	}

}
