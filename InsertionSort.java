import java.util.Random;

// inefficient algorithm
// worst case  O(n^2) 
// best case  O(n) 

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		//generate 999 numbers between 1 and 1000, store in array
		int[] array = random.ints(999,1,1000).toArray();
		
		long startTime = System.nanoTime(); //start time
		print(sort(array));
		long stopTime = System.nanoTime(); //end time
		System.out.println("\nExecution time : " + (stopTime - startTime)/100000 + " milli secs");	
	}
	
	public static int[] sort(int[] array) {
	
		for(int i = 1; i < array.length;i++) { //starting from 1 to length
			int key = array[i]; // key value to compare
			int prevIndex = i-1; // index of previous number in array
			
			//index 0..n and value at index > key
			//swap the value at index+1 with value at index
			while( prevIndex >= 0 && array[prevIndex] > key) { 
				array[prevIndex + 1] = array[prevIndex];
				prevIndex--;
			}
			array[prevIndex + 1] = key; //key is next value
		}
		return array;
	}
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
