package bcs3rd;

public class practical1 {

	public static void main(String[] args) {
		// To find the sum of any number of integers entered as command line arguments
		int c,n,s=0;
		c=args.length;
		for(int i=0;i<c;i++)
		{
			n=Integer.parseInt(args[i]);
			s=s+n;
	
		}
		System.out.println("sum is:-"+ s);
	}

}
