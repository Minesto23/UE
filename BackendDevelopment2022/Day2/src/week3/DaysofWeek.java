package week3;

public class DaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dayNumber = Integer.parseInt(args[0]);
		
		//if (dayNumber == 1) {
		//	System.out.println("Monday");
	//	}
		switch (dayNumber) {
		
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Day number not valid");
				break;
			
		}
	}

}
