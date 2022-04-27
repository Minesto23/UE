package week4;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = new int[19];
		
		myArray[0]= 9;
		myArray[1]= 10;
		
		List mylist =  new ArrayList();
		
		mylist.add(9);
		mylist.add("My name");
		mylist.add(8.9);
		mylist.add(true);
		
		for(int i = 0; i < mylist.size(); i++) {
			
			System.out.println(mylist.get(i));
		}
		
		
		

	}

}
