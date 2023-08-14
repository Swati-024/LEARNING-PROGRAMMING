package SJ;

import java.util.Scanner;

public class JS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the string");
     
     String str1=scan.nextLine();
     String str2=scan.nextLine();
    
     System.out.println(str1+ ", " +str2);
	}
	public static String joinStrings(String str1,String str2) 
	{
		return str1+str2;
	}

}
