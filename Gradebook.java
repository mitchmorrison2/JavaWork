//Mitchell Morrison 47634734 Lab2-Spring 2019 UPDATED

import java.util.Scanner;
public class Gradebook
{//open class
public static void main(String[]args) 
{//open main
Scanner input = new Scanner(System.in);
int n, sum = 0;
float average;
float quizzes;
float labs;
float exams;
float participation;
int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, o=0, p=0, q=0; 

/* define a variable for every assignment that will be put in*/
//see note below about loops

{//open commands that rely on the variables above
System.out.printf("Quiz 1: ");
a = input.nextInt ();
System.out.printf("Quiz 2: ");
b = input.nextInt ();
System.out.printf("Quiz 3: ");
c = input.nextInt ();
System.out.printf("Quiz 4: ");
d = input.nextInt ();
System.out.printf("Quiz 5: ");
e = input.nextInt ();

System.out.printf("Lab 1: ");
f = input.nextInt ();
System.out.printf("Lab 2: ");
g = input.nextInt ();
System.out.printf("Lab 3: ");
h = input.nextInt ();
System.out.printf("Lab 4: ");
i = input.nextInt ();
System.out.printf("Lab 5: ");
j = input.nextInt ();
System.out.printf("Lab 6: ");
k = input.nextInt ();
System.out.printf("Lab 7: ");
l = input.nextInt ();
System.out.printf("Lab 8: ");
m = input.nextInt ();

System.out.printf("Exam 1: ");
n = input.nextInt ();
System.out.printf("Exam 2: ");
o = input.nextInt ();
System.out.printf("Exam 3: ");
q = input.nextInt ();

System.out.printf("Participation: ");
p = input.nextInt ();

/*I created this program before we learned on while and for loops so I did it the long way by defining every variable. Otherwise I would have just created a loop that would create a variable for every entry and a trigger that would move from say quizzes to labs once the number of quizzes has been reached by the inputs.*/

int NQ = 5;
quizzes = (a + b + c + d + e) / NQ ;
int NL = 8;
labs = (f + g + h + i + j + k + l + m) / NL ; 
int NE = 3;
exams = (n + o + q) / NE ;
int NP = 1;
participation = (p) / NP ;

//take sum of each category and divide by number of inputs for average
//NQ is # of Quizzes, NL is # of labs..., etc.//

    System.out.println("");
System.out.printf("Average of quizzes %4.2f\n" , quizzes);
System.out.printf("Average of labs %4.2f\n" , labs);
System.out.printf("Average of exams %4.2f\n" , exams);
System.out.printf("Average of participation %4.2f\n" , participation);


double QW = .10;
double LW = .35;
double EW = .50;
double PW = .05;

/*QW is Quiz Weight, LW is Labs weight..., etc.*/
/*Multiplying by their weights to add to 100*/

    System.out.println("");
    
double OA = ((quizzes * QW) + (labs * LW) + (exams * EW) + (participation * PW));
    System.out.printf("Final Grade: %4.2f\n" , OA);
System.out.println("\n"); 

//OA is overall average

}//close functions

}//close main
}//close class




