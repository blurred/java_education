
public class ArraysDemo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		int d[][] = { 				//jagged arrays
				{1,2,3,4},
				{2,4,6},
				{5,6,7,8,9}
		};
		
		for (int i=0;i<d.length;i++) {
			for (int j=0;j<d[i].length;j++) {
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		
	}

}
