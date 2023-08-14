package ControlConstructor;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number");
     int marks = scan.nextInt();
     System.out.println("Welcom to KodNest");	
     check(marks);
     }

	public static void check(int marks)
	{
		if(marks >= 80)
		{
			System.out.println("Welcome to Tech Club");
		}
	}
}
