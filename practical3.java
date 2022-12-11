package bcs3rd;
import java.util.*;
public class practical3 {

	public static void main(String[] args) {
		//To learn use of single dimensional array by defining the array dynamically. 
		
		int n;
		Scanner in = new Scanner(System.in);
		try
		{
			
			int i;
			System.out.println("Enter how many elements :");
			n=in.nextInt();
			int []a=new int[n];
			System.out.println("Enter array elements");
			for(i=0;i<n;i++)
				a[i]=in.nextInt();
			System.out.println("Array elements are : ");
			for(i=0;i<n;i++)
				System.out.println(a[i]);
		}
		catch(Exception e) {}

	}

}
