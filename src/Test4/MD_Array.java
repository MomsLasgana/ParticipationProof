package Test4;

public class MD_Array {

	public static void main(String[] args) {
		int[][] array1 = new int[5][5];
		
		// first for statement will assign row values
		// second for statement will assign column values
		
		for(int i=0; i<array1.length; i++) {
			for (int k=0; i<array1.length; k++) {
				array1[i][k] = (i*k) +k;
				
				System.out.println("Array row" + i + "Array column");				
			}
		}
		
	}
	
}
