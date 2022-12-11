package bcs3rd;
import java.util.*;
class distance{
	int ft,inch;
	void get_dist(int f, int i) {
		this.ft=f;
		this.inch=i;
	                            }
	void show_dist() {
		System.out.println("Feet is:- "+ft);
		System.out.println("Inches is:- "+inch);
		             }
            }
public class practical9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Feet:- ");
		int f1= sc.nextInt();
		System.out.print("Enter inches:- ");
		int i1= sc.nextInt();
		distance S = new distance();
		S.get_dist(f1, i1);
		S.show_dist();
	                                         }
                         }
