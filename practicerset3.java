package bcs3rd;
import java.util.Scanner;
public class practicerset3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String:- ");
        //String str = sc.nextLine();
        //1. TO CONVERT STRING INTO LOWER CASE CHARACTER
		//str = str.toLowerCase();
		//System.out.println("LOWER CASE of the String is :-  " +str);
        //2. removing space by *
       // str = str.replace(" ","*");
        //System.out.println("by removing space by * of the String becomes :-  " +str);
        //namne replacement
        //String letter = "Dear <|name|>, Thanks a lot!";
        //letter = letter.replace("<|name|>", "Sachin");
        //System.out.println(letter);
        //program to detect double and triple spaces in a string
		String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

     }
                           }