import java.util.Scanner;

public class PrimeNumberGeneratorVersion1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer number up to find prime, e.g. 100 : ");
		
		int total = sc.nextInt(); //input
		String listOfPrimeNumbers = ""; //store found prime numbers as a String
		
		for(int i = 1; i <= total; i++) { //start with 1 to total
			
			int count = 0; // if count increases to 2, number is prime
			
			for(int j=i; j >= 1; j--) { //set j to current value of i
				if(i % j == 0) { //if no remainder
					count++; //add counter
				}
			}
			if(count == 2) { //if count > 1, number is prime as conditions met
				listOfPrimeNumbers = listOfPrimeNumbers + i + ' ';
			}
		}
		System.out.println("Prime number from 1 to " + total + " are : " + listOfPrimeNumbers + "\n");
		System.exit(0);
	}
}
