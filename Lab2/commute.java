//Mitchell Morrison 47634734 Lab2-Spring 2019 UPDATED

import java.util.Scanner;

public class commute //class begin
{

public static void main(String args[]) //main begin

{
Scanner input = new Scanner(System.in);

int a = 0, b = 0, c = 0, d = 0;

System.out.printf("Distance in Miles: ");
a = input.nextInt ();
System.out.printf("Target Avg Speed in MPH: ");
b = input.nextInt ();
System.out.printf("Projected rainfall in Inches: ");
c = input.nextInt ();
System.out.printf("Number of accidents: ");
d = input.nextInt ();

//all necessary inputs above
//calculations for total program below

float r = .15F;
double rain = (r * (double)c);
float Num = .1F;
double accidents = ((double)d * Num);

/*r is rain factor and rain is in inches*/
/*Num is number of accidents and accidents is how much it will slow it down*/

double actualSpeed = ((b * (1 - (rain))) * (1 - accidents));
System.out.println("");
System.out.printf("Actual speed is %.1f" , actualSpeed);
System.out.printf(" MPH \n");

int m = 60; //covert to minutes
double time = ((((double)a / actualSpeed))*m) ;
System.out.printf("Time it takes in minutes is %.1f" , time);
System.out.printf(" Minutes \n");


}//end main
}//end class

