package demo;
import java.util.Scanner;

public class test4_game2 {

	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
		int count = 1;
		
		System.out.println("Input a number (between 1-1000)");
		int goal = (int)(Math.round(Math.random() * 1000 + 1));
		int userInput = inputValue.nextInt();
		
		while (userInput != goal) {
			
			if (userInput > goal) {
				System.out.println("My number is less than [" + userInput+ "], try again.");
			}
			else {
				System.out.println("My number is more than [" + userInput+ "], try again.");
			}
			
			count++;
			userInput = inputValue.nextInt();
			
		}
		System.out.println("The number [" + goal+ "] you guess is correct. You win(๑•̀ㅂ•́)و✧");
		System.out.println("You take " + count + " steps.");

	}

}
