package bcs3rd;

import java.util.*;


 class prime
 {
	void check(int p) {
		for(int i=2;i<p;i++) {
			if(p%i==0) {
				System.out.println (p +" is not prime");
				System.exit(0);
			}
		
			
		}
		System.out.println(p +" is prime");
			
		}
	
 }

public class practical6 {
	//To check if a number is prime or not, by taking the number as input from the keyboard
	public static void main(String [] args) {
		prime p=new prime();
	Scanner	 in = new Scanner(System.in);
		System.out.print("Enter number to be checked:-");
		 int n= in.nextInt();
		p.check(n);
		
		
	}

}
