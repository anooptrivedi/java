import java.util.Scanner;

// if a year is divisible 4 and not by 100, it is a leap year
// if a year is divisible by 4, 100, and 400, it is a leap year
// for everything else, it is not a leap year.

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the year (or 0 to exit) : " );
			int year = sc.nextInt();
			boolean leap = false; //default, it is not a leap year
			
			if(year < 1) {
				System.out.println("bye");
				break;
			}
			
			if(year % 4 == 0) { //if divisible by 4
				if (year % 100 == 0) { // 
					if(year % 400 == 0) {
						leap = true; // divisible by 4, 100, and 400
					}
				}
				else {
					leap = true; // divisible by 4 but not 100
				}
		
				
			}
			if(leap) {
				System.out.println("It is a leap year");
				
			}else{
				System.out.println("It is not a leap year");
			}	
		}
	}	
}
  
