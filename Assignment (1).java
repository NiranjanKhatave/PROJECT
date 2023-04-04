package day3;
/* given integer n perform following conditional action
1) if n is odd print weird
2 if n is even and in range of 2 to 5 print Not weird
3 if n is even and range 6 to 20 print weird 
4 if n  is even and greater than 20 print not weird 

input     8 
output weird 

*/
import java.util.*;
public class Assignment 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
        int n=s.nextInt();
        if(n%2==0)
        {
        	if(n>=2 && n<=5)       System.out.println("Not weird");
        	else if(n>=6 && n<=20) System.out.println(" weird");
        	else if(n>20)           System.out.println("Not weird");
        }
        else
        {
        	System.out.println("weird");
        }

        	
	}

}
