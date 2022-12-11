package bcs3rd;
import java.util.*;
class OverloadDemo
{
    void area(double x , double y)
    {
    	double c=(x*y)*0.5;
        System.out.println("the area of the Triangle is "+c+" sq units");
    }
    void area(int a, int b)
    {
        System.out.println("the area of the rectangle is "+a*b+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}

public class Overload {
	 public static void main(String args[]) 
		{
		 double r,b,h;
		 int c,d;
		 Scanner in = new Scanner(System.in);
		 
		  System.out.print("Enter radius :-");
		  r=in.nextDouble();
		  System.out.print("Enter base of triangle :-");
		  b=in.nextDouble();
		  System.out.print("Enter height of triangle :-");
		  h=in.nextDouble();
		  System.out.print("Enter length of rectangle:-");
		  c=in.nextInt();
		  System.out.print("Enter breadth of rectangle:-");
		  d=in.nextInt();
		   OverloadDemo ob = new OverloadDemo();
		   ob.area(r);
		   ob.area(b,h);
		   ob.area(c,d);
		   }

}
