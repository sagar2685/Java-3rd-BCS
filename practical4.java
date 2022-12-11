package bcs3rd;
import java.util.*;

public class practical4 {
public static void main(String [] args)
{
	//To learn use of length in case of a two dimensional array
	int [][]a;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter row and column for 2d array:-");
	int r=in.nextInt();
	int c=in.nextInt();
	a=new int[r][c];
	System.out.print("Enter elements in array :-");
	int i;
	int j;
	for(i=0;i<r;i++) {
		for(j=0;j<c;j++) {
			a[i][j]=in.nextInt();}}
	System.out.println("length is"+a.length);
	System.out.println("Elements in array are :");
	for(i=0;i<r;i++) {
for(j=0;j<c;j++) {
    System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);}}
}
}
