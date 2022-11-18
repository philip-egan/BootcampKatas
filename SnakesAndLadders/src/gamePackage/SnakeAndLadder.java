package gamePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

	final static int WINPOINT =100;
	static Map<Integer,Integer> snake = new HashMap<>();
	static Map<Integer,Integer> ladder = new HashMap<>();
	{
		snake.put(99, 60);
		snake.put(75, 64);
		snake.put(68, 43);
		snake.put(34, 11);
		ladder.put(4, 25);
		ladder.put(23, 54);
		ladder.put(45, 76);
		
	}
	public int rollDice() {
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return( n == 0 ? 1:n);
	}
	public int CalcPlayerValue(int playerPosition,int diceValue) {
		int playerNewPosition = playerPosition +diceValue;
		
		if(playerNewPosition == WINPOINT) {
			return playerNewPosition;
		}
		if(null != snake.get(playerNewPosition)) {
			System.out.println("Eaten By Snake");
			playerNewPosition = snake.get(playerNewPosition);
		}
		if(null != ladder.get(playerNewPosition)) {
			System.out.println("Climb the Ladder");
			playerNewPosition = ladder.get(playerNewPosition);
		}
		return playerNewPosition;
	}
	
	public boolean isWin(int playerPosition) {
		return WINPOINT == playerPosition;
	}
	
	
	
	public void startGame() {
		// TODO Auto-generated method stub
		int player1Position =0,player2Position =0;
		int currentPlayer = -1;
		Scanner scan = new Scanner(System.in);
		String pressed;
		
		int diceValue=0;
		
		do {
			System.out.println(currentPlayer == -1 ? "First Players Turn" : "Second Players Turn");
			System.out.println("press R to roll the dice");
			pressed = scan.next();
			diceValue = rollDice();
			if(currentPlayer ==-1) {
				player1Position = CalcPlayerValue(player1Position, diceValue);
				System.out.println("first Player Position: "+ player1Position);
				System.out.println("Second Player Position: "+ player2Position);
				System.out.println("_________________________");
				if(isWin(player1Position)) {
					System.out.println("Player 1 Wins");
					return ;
				}
			}
			else {
				player1Position = CalcPlayerValue(player2Position, diceValue);
				System.out.println("first Player Position: "+ player1Position);
				System.out.println("Second Player Position: "+ player2Position);
				System.out.println("_________________________");
				if(isWin(player2Position)) {
					System.out.println("Player 2 Wins");
					return ;
				}
			}currentPlayer = -currentPlayer;
		
		
	}while("r".equals(pressed));
		
		
	}

}
