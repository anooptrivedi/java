import java.util.Scanner;

public class PrimeNumberGeneratorVersion3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer number up to find prime, e.g. 100 : ");
		
		int max = sc.nextInt(); //input

		long startTime = System.nanoTime(); //start time
		for(int i =2; i < max; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}	
		}
		long stopTime = System.nanoTime(); //end time
		System.out.println("\nExecution time : " + (stopTime - startTime)/100000 + " milli secs");
	}
	
	// iterate only over odd numbers, because all multiples of 2, except 2 is composite
	// eliminate i*i ; 2 * 2 product will not be prime, same for 3*3 and so forth
	public static boolean isPrime(int n) {
		
		for(int i=2; i * i <= n; i++) {
			if( n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
