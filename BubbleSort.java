package ps;

import java.util.Random;

// Most Basic Sort, using swap technique
// inefficient but works
// worst case  O(n^2) 
// best case  O(n) 

public class BubbleSort {

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
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false; //waiting for swap
			for(int i=0; i < array.length-1;i++) {
				if(array[i] > array[i + 1]) { //sort in ascending order
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					flag = true;
				}
			}
		}
		return array;
	}
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
