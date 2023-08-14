package ladder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter score");
      int score = scan.nextInt();
      
      Grade.gradeGiven(score);
	}

}
