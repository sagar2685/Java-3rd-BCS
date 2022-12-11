package bcs3rd;

public class practical8 {

	public static void main(String[] args) {
		
      String s1=new String("Sagar");
      String s2=new String("Chakrabarty");
      System.out.println("The concat() string is "+s1.concat(s2));
      StringBuffer s3=new StringBuffer("Sagar");
      StringBuffer s4=new StringBuffer("Chakrabarty");
      s3.append(s4);
      System.out.println("The append() string is "+s3);
      s3.insert(7, "Java");
      System.out.println("The insert() string is "+s3);
      s3.setLength(10);
      System.out.println("The setLength() string is "+s3);
      if(s1.equals(s2)) {
    	  System.out.println("The string are equal........");
    	  
      }
      else {
    	  System.out.println("The string are not equal........");
      }
      
      s4.setCharAt(3, 'x');
      
      System.out.println("The updated setCharAt() string is "+s4); 
	}

}
