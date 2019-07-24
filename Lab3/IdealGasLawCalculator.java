//Mitchell Morrison 47634734 Lab 3

import java.util.Scanner;


public class IdealGasLawCalculator
{ //open class

static double r = 0.08205;
static Scanner input = new Scanner(System.in);


public static void main(String[] args)
{ //open main


double moles = applyIdealGasLaw();
System.out.printf("Number of Moles is %1.5f moles \n" , moles);




}//close main

public static double applyIdealGasLaw()
{ //open applyIdealGasLaw()


System.out.println("In Ideal Gas Law, the relationship between pressure (P), volume (V), number of moles (n), and temperature (T) is expressed as PV = nRT. \n");

System.out.println("Enter the following values for P (atm), V (L), and T (K), and let's find n (moles). \n");

System.out.println("The units of the values are inside the parentheses. \n");


double P , V , n , T;
P = input.nextDouble();
V = input.nextDouble();
T = input.nextDouble();

System.out.printf("You entered: %.1f for P \n" , P);
System.out.printf("You entered: %.1f for V \n" , V);
System.out.printf("You entered: %.1f for T \n" , T);


return getNumberOfMoles(P, V, T);


} //close applyIdealGasLaw()


public static double getNumberOfMoles(double P, double V, double T)

{ //open last method


return ((P*V) / (r*T));




}//close last method



}//close class
