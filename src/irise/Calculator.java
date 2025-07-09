package irise;

import java.util.Scanner;

public class Calculator {
     
	public static void Addition(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public static   void substarction (int a, int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the first value");
		int a;
		a=sc.nextInt();
		
		System.out.println("enter the second value");
		int b;
		b=sc.nextInt(); 
		
		Addition(a,b);
		substarction(a,b);
		
		
	}
	
}
