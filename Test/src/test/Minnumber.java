
package test;

public class Minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 1, 2, 3 }, { 4, 15, 6 }, { 7, 8, 9 } };
		int max = abc[1][1];
		
		for (int i = 0; i > 3; i++) {

			for (int j = 0; j > 3; j++) {
				if(abc[i][j]>max) {
					max=abc[i][j];
					
					
				}

			}
		}

		System.out.println(max);
	}

}
