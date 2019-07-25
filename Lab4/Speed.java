//Mitchell Morrison Lab 4 section 12

import java.util.Scanner;

public class Speed {
	
public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);	
double[] distanceArray = new double[3];
double[] timeArray = new double[3];
for (int x=0; x<= 2; x++) {	
	System.out.println("Enter distance in miles: ");
	 distanceArray[x] = input.nextDouble();
	System.out.println("Enter time in hours: ");
	 timeArray[x] = input.nextDouble();
} //end for
calculateSpeed(distanceArray, timeArray);	
} //end main

public static void calculateSpeed(double[] distanceArray, double[] timeArray ) {
	//calculate speed
	
	for(int i = 0; i <= 2; i++) {
		double speedArray = distanceArray[i] / timeArray[i];
		System.out.printf("The speed for distance %.2f miles and time %.2f hours is %.2f MPH \n", distanceArray[i], timeArray[i], speedArray);
	}
} //end method
} //end class



