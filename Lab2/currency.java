//Mitchell Morrison 47634734 Lab2-Spring 2019 UPDATED

import java.util.Scanner;
public class currency
{
public static void main(String[] args)
{

    
//Display table of currencies
    System.out.println("");
    System.out.println("CURRENCY RATES");
    System.out.println("");
    System.out.printf("%-10s  %-6s %14s\n", "Country", "Currency", "Rate");
    System.out.printf("%-10s  %-6s %16.2f\n", "USA", "USD", 1.00);
    System.out.printf("%-10s  %-6s %16.2f\n", "UK", "GBP", 0.77);
    System.out.printf("%-10s  %-6s %16.2f\n", "Europe", "EU", 0.88);
    System.out.printf("%-10s  %-6s %16.2f\n", "Japan", "Yen", 109.59);
    System.out.printf("%-10s  %-6s %16.2f\n", "Mexico", "Peso", 19.13);
    System.out.printf("%-10s  %-6s %,16.2f\n", "Vietnam", "Dong", 23195.50);
    System.out.println("");

//USD Begins
Scanner input=new Scanner(System.in);
System.out.print("Enter USD: ");
   

double a = input.nextDouble();
     System.out.println("");
String amt = "Amount";
System.out.printf("%11s %18s\n" , "Currency", amt);
double GBP1 = 0.77;
System.out.printf("%11s %,18.2f\n " , "GBP:" , (a * GBP1));
double EU1 = 0.88;
System.out.printf("%10s %,18.2f\n " ,  "EU:" , (a * EU1));
double Yen1 = 109.59;
System.out.printf("%10s %,18.2f\n " ,  "Yen:" , (a * Yen1));
double Peso1 = 19.11;
System.out.printf("%10s %,18.2f\n " ,  "Peso:" , (a * Peso1));
double Dong1 = 23195.5;
System.out.printf("%10s %,18.2f\n " ,  "Dong:" , (a * Dong1));
System.out.printf("\n");
    

//USD Conversions end
//GBP Begin

Scanner input2=new Scanner(System.in);
System.out.print("Enter GBP: ");
double b = input2.nextDouble();
     System.out.println("");
System.out.printf("%11s %18s\n" ,"Currency" , amt);
double USD2 = 1.298;
System.out.printf("%11s %,18.2f\n" ,  "USD:" , (b * USD2));
double EU2 = 1.142;
System.out.printf("%11s %,18.2f\n" ,  "EU:" , (b * EU2));
double Yen2 = 142.324;
System.out.printf("%11s %,18.2f\n" ,  "Yen:" , (b * Yen2));
double Peso2 = 28.844;
System.out.printf("%11s %,18.2f\n" ,  "Peso:" , (b * Peso2));
double Dong2 = 30124.026;
System.out.printf("%11s %,18.2f\n" ,  "Dong:" , (b * Dong2));
System.out.printf("\n");
    

//GBP Ends
//Peso Begins

Scanner input3=new Scanner(System.in);
System.out.print("Enter Peso: ");
double c = input3.nextDouble();
    System.out.println("");
System.out.printf("%11s %18s\n" , "Currency", amt);
double USD3 = .052;
System.out.printf("%11s %,18.2f\n" ,  "USD:" , (c * USD3));
double GBP3 = .04;
System.out.printf("%11s %,18.2f\n" ,  "GBP:" , (c * GBP3));
double EU3 = .046;
System.out.printf("%11s %,18.2f\n" ,  "EU:" , (c * EU3));
double Yen3 = 5.728;
System.out.printf("%11s %,18.2f\n" ,  "Yen:" , (c * Yen3));
double Dong3 = 1212.52;
System.out.printf("%11s %,18.2f\n" ,  "Dong:" , (c * Dong3));
System.out.printf("\n");
    
    System.out.println("End of conversions");

//Peso ends

}//Main end
}//Class end
