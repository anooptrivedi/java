import java.util.Scanner;

public class PrimeNumberGeneratorVersion2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer number up to find prime, e.g. 100 : ");
		
		int total = sc.nextInt(); //input

		long startTime = System.nanoTime(); //start time
		String listOfPrimeNumbers = ""; //store found prime numbers as a String
		for(int i = 2; i <= total; i++) { //start with 2 to total
			
			boolean isPrime = true;
			
			for(int check = 2; check < i; check++) {
				if(i % check == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				listOfPrimeNumbers = listOfPrimeNumbers + i + " ";
			}
		}
		System.out.println("Prime number from 1 to " + total + " are : " + listOfPrimeNumbers + "\n");
		long stopTime = System.nanoTime(); //end time
		System.out.println("\nExecution time : " + (stopTime - startTime)/100000 + " milli secs");
		System.exit(0);
	}
}
