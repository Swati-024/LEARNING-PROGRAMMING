package Tax;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the purchase amount:");
     double purchaseamount=scan.nextDouble();
     System.out.print("Enter the tax rate: ");
     double taxrate=scan.nextDouble();
	System.out.println( calculateTotalWithTax(purchaseamount,taxrate));
	}
	
	public static double calculateTotalWithTax(double purchaseamount,double taxrate)
	{
		return (purchaseamount*taxrate)+purchaseamount;
	}

}
