package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class rpsgame {

	public static void main(String[] args)
	{
		int userChoice,computerChoice, rock,paper,scissors;
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		
		rock =0;
		paper =1;
		scissors =2;
		
		System.out.println("Rock - Paper - Scissors Game");
		System.out.println("input 0 for rock");
		System.out.println("input 1 for Paper");
		System.out.println("input 2 for Scissors");
		
		userChoice = input.nextInt();
		while(userChoice > 2) {
			System.out.println("select input 0,1 or 2");
			userChoice = input.nextInt();
		}
		
		if (userChoice ==0){
			System.out.println("Player Selected Rock");
		}
		else if (userChoice ==1){
			System.out.println("Player Selected paper ");
		}
		else System.out.println("Player Selected Scissors");
		
		//random computer choice
		computerChoice = rand.nextInt(3);
		if (computerChoice ==0){
			System.out.println("Computer Selected Rock");
		}
		else if (computerChoice ==1){
			System.out.println("Computer Selected paper ");
		}
		else System.out.println("Computer Selected Scissors");
		
		if(userChoice ==computerChoice) {
			System.out.println("Draw");
			break;
		}
		if(userChoice == 0) {
			if(computerChoice == 1) {
				System.out.println("Computer Wins");
				
			}
			else if(computerChoice == 2) {
				System.out.println("Player Wins");
				
			}	
		}
		
		if(userChoice == 1) {
			if(computerChoice == 0) {
				System.out.println("Computer Wins");
			}
			else if(computerChoice == 1) {
				System.out.println("Player Wins");
			}	
		}
		
		if(userChoice == 3) {
			if(computerChoice == 1) {
				System.out.println("Computer Wins");
			}
			else if(computerChoice == 0) {
				System.out.println("Player Wins");
			}	
		}
	}
	
	

}
