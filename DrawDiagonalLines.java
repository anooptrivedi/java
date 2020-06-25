import java.util.Scanner;

// Program draws diagonal lines
// takes an input higher than 3

public class DrawDiagonalLines {

	public static void main(String[] args) {
	
		int n; //number of lines, should be more than 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 3 or higher: ");
		n = sc.nextInt();
		
		while(n < 3) { //line should be at least 3 characters
			System.out.print("Number should be more than 3, try again: ");
			n = sc.nextInt();
		}

		// diagonal line coordinates are where i == j or
		// i + j = n -1
		for(int i =0; i < n; i++) { //columns
			for(int j = 0; j < n; j++) { //rows
				if(i==j || i + j == n-1) { // conditions to match
					System.out.print("*");										
				} else {
					System.out.print(" ");										
				}
			}
			System.out.println();
		}
		System.exit(0);
	}
}
