package Demo;

import java.util.Scanner;

public class JpurneyCalculator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the values for speed and time");s
	     double speed=scan.nextDouble();
	     double time=scan.nextDouble();
	     System.out.println(calculateDistance(speed,time));
		
	}
	public static double calculateDistance(double speed,double time)
	{
		return speed*time;
	}

}
