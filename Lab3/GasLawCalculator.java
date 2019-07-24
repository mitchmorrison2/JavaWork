import java.util.Scanner;
public class GasLawCalculator 
{ //open class

static double r = 0.08205;
static int mmHgToAtm = 760;
static int mlToL = 1000;
static int cToK = 273;
static Scanner input = new Scanner(System.in);

public static void main(String [] args) 
{ //open main
while (true)
{

System.out.println("Welcome to the Gas Laws Calculator \nPlease choose one of the following options by inputing a single number");

int option = displayMenu();

if (option == 1) 
{ 
displayTableOfUnitsAndConversions();
double Volume2 = applyBoylesLaw();
System.out.printf("V2 is %.5f L\n", Volume2);
break;
}
else if (option == 2)
{
displayTableOfUnitsAndConversions();
double Temperature2 = applyCharlesLaw();
System.out.printf("T2 is %.5f K\n", Temperature2);
break;
}
else if (option == 3)
{
displayTableOfUnitsAndConversions();
double Pressure2 = applyGayLussacsLaw();
System.out.printf("P2 is %.5f atm\n", Pressure2);
break;
}
else if (option == 4)
{
displayTableOfUnitsAndConversions();
double numMoles = applyIdealGasLaw();
System.out.printf("Number of Moles is %.5f moles \n", numMoles);
break;
}
else if (option == 9)
{
System.out.println("Goodbye!");
break;
}//end else if

}//end while
} //close method
    

public static int displayMenu()
{//open display method
System.out.println("1. Boyle's Law");
System.out.println("2. Charles' Law");
System.out.println("3. Gay-Lussac's Law");
System.out.println("4. Ideal Gas Law");
System.out.println("9. Exit");
int choice;
choice = input.nextInt();
System.out.printf("Option number %d chosen \n", choice);
System.out.println("");
return choice;
} // close display method



public static void displayTableOfUnitsAndConversions()
{ //open table method
System.out.println("|---------------------------------TABLE OF UNITS AND CONVERSIONS--------------------------------|");
System.out.println("|V = volume in liters (L)       | P = pressure in atmosphere (atm)  | R = ideal gas constant    |");
System.out.println("|T = temperature in Kelvin (K)  | n = number of moles               |                           |");
System.out.println("|-----------------------------------------------------------------------------------------------|");
System.out.println("|1 liter = 1000 milliliters  | 1 Celcius = 273 Kelvin | 1 atm = 760 milliliter of mercury (mmHg)|");
System.out.println("|R = 0.08205                 |                                                                  |");
System.out.println("|-----------------------------------------------------------------------------------------------|");
}//close table method

public static double applyBoylesLaw()
{//open method
System.out.print("In Boyle's Law, the relationship between pressure (P1 and P2) and Volume (V1 and V2) is expressed as P1V1 = P2V2.\n");
System.out.print("Enter the following values for P1 (mmHg), V1(ml), and P2 (atm), and let's find V2 (L).\n");
System.out.print("The units of the values are provided inside the parentheses.\n");
double P1 = input.nextDouble(); //captures 1st pressure
double V1 = input.nextDouble(); //captures 1st volume
double P2 = input.nextDouble(); //captures 2nd Pressure
double V2 = getVolumeInLiters(P1, P2, V1);
//P1V1 = P2V2 formula
System.out.printf("You entered: %.1f for P1\n", P1);
System.out.printf("You entered: %.1f for V1\n", V1);
System.out.printf("You entered: %.1f for P2\n", P2);
return V2; 
}//close boyles law method

public static double getVolumeInLiters(double P1, double P2, double V1)
{//open volume method
V1 = V1 / mlToL;
P2 = P2 * mmHgToAtm;
double Volume2 = ((P1 * V1) / P2);
return Volume2;
}//close get volume method

public static double applyCharlesLaw()
{
System.out.print("In Charles' Law, the relationship between temperature (T1 and T2) and volume (V1 and V2) is expressed as V1/T1 = V2/T2.\n");
System.out.print("Enter the following values for T1 (C), V1 (L), and V2 (ml), and let's find T2 (K).\n");
System.out.print("The units of the values are provided inside the parentheses.\n");
//(V1/T1 = V2/T2) Charles' Law
double T1 = input.nextDouble(); //captures 1st temperature
double V1 = input.nextDouble(); //captures 1st volume
double V2 = input.nextDouble(); //captures 2nd volume
double T2 = getTemperatureInKelvin(T1, V1, V2);

System.out.printf("You entered: %.1f for T1\n", T1);
System.out.printf("You entered: %.1f for V1\n", V1);
System.out.printf("You entered: %.1f for V2\n", V2);
return T2;
} //close Charles' Law method

public static double getTemperatureInKelvin(double T1, double V1, double V2)
{//open getPressure method
T1 = T1 + cToK; //C to K
V1 = V1;
V2 = V2 / mlToL; //ml to L
double temperature2 = (((V2*T1))/(V1));
return temperature2;
}//close getPressure method

public static double applyGayLussacsLaw()
{//open Gay Lussacs method
System.out.println("In Gay-Lussac's Law, the relationship between pressure (P1 and P2) and temperature (T1 and T2) is expressed as P1/T1 = P2/T2.");
System.out.println("Enter the following values for P1 (mmHg), T1 (C), and T2 (C), and let's find P2 (atm).\n");
System.out.println("The units of the values are provided inside the parentheses.\n");
//P1/T1 = P2/T2

double P1 = input.nextDouble(); //captures 1st pressure
double T1 = input.nextDouble(); //captures 1st Temperature
double T2 = input.nextDouble(); //captures 2nd Temperature
double P2 = getPressureInATM(P1, T1, T2);

System.out.printf("You entered: %.1f for P1\n", P1);
System.out.printf("You entered: %.1f for T1\n", T1);
System.out.printf("You entered: %.1f for T2\n", T2);
return P2;
}//end Gay Lussacs law

public static double getPressureInATM(double P1, double T1, double T2)
{//open ATM method
P1 = P1 / mmHgToAtm;
T1 = T1 + cToK;
T2 = T2 + cToK;
double P2;
P2 = (P1 * T2)/T1;
return P2;
}//close ATM method

public static double applyIdealGasLaw()
{
System.out.println("In Ideal Gas Law, the relationship pressure (P), volume (V), number of moles (n), and temperature (T) is expressed by PV = nRT.");
System.out.println("Enter the following values for P (atm), V (L), and T (K), and let's find n (moles).");
System.out.println("The units of the values are provided inside the parentheses.");

double P = input.nextInt();
double V = input.nextInt();
double T = input.nextInt();
double n = getNumberOfMoles(P, V, T);

System.out.printf("You entered: %.1f for P\n", P);
System.out.printf("You entered: %.1f for V\n", V);
System.out.printf("You entered: %.1f for T\n", T);
return n;
}//end Ideal method

public static double getNumberOfMoles(double P, double V, double T) 
{
double r = 0.08205;
double moles = (P * V) / (r * T);
return moles;

}


}//end class



