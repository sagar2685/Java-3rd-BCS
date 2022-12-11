package bcs3rd;

public class cmdline {

	public static void main(String args[]) {
		int c, i=0;
		 String str;
		c = args.length;
		 System.out.println("Lenght of the string"+ c);
		 while(i<c){
		 str= args[i];   
		  System.out.println("args "+ i + " "+str);
		 i++;
		 }

	}

}
