package jp;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fahrenheit temperature");
		double fahrenheit=scan.nextDouble();
		TempConvertor temperaturConverter= new TempConvertor();
		double celcius=temperaturConverter.convertFahreneitTocelcius(fahrenheit);
		System.out.println(celcius);
	}

}