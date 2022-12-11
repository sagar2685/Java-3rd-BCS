package bcs3rd;
import java.util.*;

public class vid25_cwh_prj {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*System.out.print("Enter number of st5arsw to be print :- ");
		int b=sc.nextInt();
		for(int i=b;i>0;i--)
		{
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		*/
//Sum of even numbers using while loop
		System.out.print("Enter value of evennumber to be added :- ");
		int n=sc.nextInt();
		int sum = 0;
		int i=2;
		while(i<n) {
			sum=sum+(2*i);
			i++;
		}
		System.out.print("sum of numbers are :- "+sum);
	}

}
