package bcs3rd;
import java.util.Scanner;
public class f_to_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit to be converted into Celsius :-");
		f=sc.nextInt();
		c=((f-32)*5)/9;
		System.out.println("Temperature in Celsius is :- "+ c +" Degree Celsius" );

		

	}

}
