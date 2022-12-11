package bcs3rd;
import java.util.*;
public class practical5  {
       public static void main(String[] args) {
		int[] a= new int[1000];
		int n,r,i = 0;
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter decimal number :-");
			n= in.nextInt();
			System.out.print("Binary number of "+n+" is :-");
		
		        while (n > 0) 
		        {    
		          r=n%2;
		         
		          n=n/2;
		          a[i]=r;
		          i++;
		        }
		   for (int j = i - 1; j >= 0; j--)
		            System.out.print(a[j]);
	           }
		catch(Exception e) {}
}}
