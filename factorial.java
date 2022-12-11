package bcs3rd;


import java.util.*;
public class factorial {
public void fact() {
	
	int n,fact;
		     Scanner s= new Scanner(System.in);
		     
		     System.out.println("Input a number :-");
		     n=s.nextInt();
		     fact=1;
		     for(int i=1;i<=n;++i)
		     {
		       fact=fact*i;
		     }
		     System.out.println("Factorial of "+n+" is "+fact);
		    
}   



}
	