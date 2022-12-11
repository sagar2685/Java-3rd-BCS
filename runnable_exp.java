package bcs3rd;
class tA implements Runnable{
	public void run() {
	for(int i=1;i<=5;i++)
		System.out.println("i= "+i);
		}
}
class tB implements Runnable{
	public void run() {for(int j=1;j<=5;j++)
		System.out.println("j= "+j);
	
		}
}
class tC implements Runnable{
	public void run() {
	for(int k=1;k<=5;k++)
		System.out.println("k= "+k);
		}
}
public class runnable_exp 
{
    public static void main(String[] args)
         {
		tA A=new tA();
		Thread a= new Thread(A);
		tB B=new tB();
		Thread b= new Thread(B);
		tC C=new tC();
		Thread c= new Thread(C);
		a.start();
		b.start();
		c.start(); 

	    }
 }
