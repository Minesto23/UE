package week4;

public class DoubleSizedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = 
			{
				{4,7,-1},
				{5,0,-3},
			};

		for (int i = 0; i<2;i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		

	}

}
