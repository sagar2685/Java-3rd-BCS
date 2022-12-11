package bcs3rd;// i have use bcs3rd as my package name you can us any sort of name
import java.util.*;
public class practical2 {

	public static void main(String[] args) {
		//To find the factorial of a given number 
		  int n,fact;
		     Scanner s= new Scanner(System.in);
		     try {
		     System.out.print("input a number :-");
		     n=s.nextInt();
		     fact=1;
		     for(int i=1;i<=n;i++)
		     {
		       fact=fact*i;
		     }
		     System.out.println("Factorial of "+n+" is "+fact);
		     }
		     catch(Exception ea) {}
	}

}

