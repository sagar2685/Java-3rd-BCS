package bcs3rd;
import java.util.*;
public class practical7 {

	public static void main(String[] args) {
		/*To find the sum of any number of integers interactively, i.e., entering every number from the 
		keyboard, whereas the total number of integers is given as a command line argument*/
		int s=0;
		int n= Integer.parseInt(args[0]);
		int []a= new int[n];
		System.out.println("Enter the number one by one :-");
		Scanner	 in = new Scanner(System.in);
		for(int i =0;i<n;i++) {
			a[i]=in.nextInt();
			s=s+a[i];
		}
		
		System.out.println("Sum is :-"+s);
	}

}
