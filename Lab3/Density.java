import java.util.Scanner;
public class Density 
{
public static void main(String[] args)
{


Scanner input=new Scanner(System.in);

System.out.printf("Enter mass (g) and volume (ml) separated by spaces ");
int m = input.nextInt(); //captures mass
int v = input.nextInt(); //captures volume
/*white space is used to separate the 2 integers*/

double density = m / v; //calculates density
System.out.printf("Density is %.4f g/ml" , density); //prints answer
System.out.println(""); //new line

}
}
