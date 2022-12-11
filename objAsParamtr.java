package bcs3rd;

class complex
{
	int real,img;
	complex(int m,int n)//parametized constructor
	{
		real=m;
		img=n;
	}
	void add(complex c1, complex c2) // function with object as argument
	{
		complex c= new complex(0,0);
		c.real=c1.real+c2.real;
		c.img=c1.img+c2.img;
		System.out.println("Real ="+c.real+" || Imaginary ="+c.img);
		
	}
}

public class objAsParamtr {
	public static void main(String[] args) {
	// program to demonstrate passing object as argument
		complex C1,C2,C3;
		C1=new complex(12,23);
		C2=new complex(45,56);
		C3=new complex(0,0);
		C3.add(C1, C2);
	}

}
