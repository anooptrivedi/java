package ps;

import java.util.Scanner;

public class DrawCircleOnConsole {

	public static void main(String[] args) {
		System.out.print("What is radius of circle as an integer ? e.g. 2 : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		
		DrawCircle(radius);
	}
	
	//not perfect but draws somewhat
	//similar circles on the console
	public static void DrawCircle(int radius) {
		
		int x = radius; // x position
		int y = radius*3; // y position
		
		for(int i=0; i <= x + radius; i++) { //x position + radius
			for(int j=1; j <= y + radius; j++) { //y position + radius
				int xSquared = (i - x)*(i - x);
				int ySquared = (j - y)*(j - y);
				if(Math.abs(xSquared + ySquared - (radius*radius)) < radius) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
