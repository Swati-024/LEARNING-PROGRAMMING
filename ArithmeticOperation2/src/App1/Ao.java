package App1;

import java.util.Scanner;

public class Ao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     
     System.out.println("Enter the number");
     int num=scan.nextInt();
     System.out.println(doubleTheNumer(num));

	}
	public static int doubleTheNumer(int num)
	{
		return num*2;
	}

}
