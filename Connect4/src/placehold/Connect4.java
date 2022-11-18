package placehold;

import java.util.Scanner;

public class Connect4 
{
	public static String[][] makeGrid(){
		String[][] grid = new String [7][15];
		
		for(int i =0; i<grid.length;i++) {
			for(int j =0; j<grid[i].length;j++) {
				if(j%2 ==0) {
					grid[i][j] = "|";
									
				}else grid[i][j] = " ";
				
				if(i == 6)grid[i][j] = "-";
			}
		}
		return grid;
	}
	
	public static void printGrid(String[][] grid) {
		for(int i =0; i<grid.length;i++) {
			for(int j =0; j<grid[i].length;j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void redTurn(String[][] grid){
		System.out.println("RED : enter a disk in a column 0-6");
		Scanner scan = new Scanner(System.in);
		
		int columnassignment = 2*scan.nextInt()+1;
		
		for(int i = 5; i> 0;i--) {
			if(grid[i][columnassignment]==" ") {
				grid[i][columnassignment] = "R";
				break;
			}
		}
	}
	
	public static void yellowTurn(String[][] grid){
		System.out.println("Yellow : enter a disk in a column 0-6");
		Scanner scan = new Scanner(System.in);
		
		int columnassignment = 2*scan.nextInt()+1;
		
		for(int i = 5; i> 0;i--) {
			if(grid[i][columnassignment]==" ") {
				grid[i][columnassignment] = "Y";
				break;
			}
		}
	}
	
	public static String checkWinner(String[][] grid) {
		for(int i =0;i<6;i++) {
			for(int j =0;j<7;j+=2) {
				if((grid[i][j+1] != " ")
					&& (grid[i][j+3] != " ")
					&& (grid[i][j+5] != " ")
					&& (grid[i][j+7] != " ")
					&& ((grid[i][j+1] == grid[i][j+3]))
					&& ((grid[i][j+3] == grid[i][j+5]))
					&& ((grid[i][j+5] == grid[i][j+7]))) {
					return grid[i][j+1];
				}
			}
		}
		
		for(int i =0;i<15;i+=2) {
			for(int j =0;j<3;j++) {
				if((grid[j][j+1] != " ")
					&& (grid[j+1][i] != " ")
					&& (grid[j+2][i] != " ")
					&& (grid[j+3][i] != " ")
					&& ((grid[j][i] == grid[j+1][i]))
					&& ((grid[j+1][i] == grid[j+2][i]))
					&& ((grid[j+2][i] == grid[j+3][i]))) {
					return grid[j][i];
				}
			}
		}
		
		for(int i =0;i<3;i++) {
			for(int j =0;j<9;j+=2) {
				if((grid[i][j] != " ")
					&& (grid[i+1][j+2] != " ")
					&& (grid[i+2][j+4] != " ")
					&& (grid[i+3][j+6] != " ")
					&& ((grid[i][j] == grid[i+1][j+2]))
					&& ((grid[i+1][j+2] == grid[i+2][j+4]))
					&& ((grid[i+2][j+4] == grid[i+3][j+6]))) {
					return grid[i][j];
				}
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =7;j<15;j+=2) {
				if((grid[i][j] != " ")
					&& (grid[i+1][j-2] != " ")
					&& (grid[i+2][j-4] != " ")
					&& (grid[i+3][j-6] != " ")
					&& ((grid[i][j] == grid[i+1][j+2]))
					&& ((grid[i+1][j-2] == grid[i+2][j-4]))
					&& ((grid[i+2][j-4] == grid[i+3][j-6]))) {
					return grid[i][j];
				}
			}
		}
		return null;
		
	}

	public static void main (String[] args) {
		String[][] grid = makeGrid();
		boolean loop = true;
		int count = 0;
		printGrid(grid);
		while(loop) {
			if(count %2 ==0) {
				redTurn(grid);
			}else yellowTurn(grid);
			count++;
			printGrid(grid);
			
			if(checkWinner(grid) != null) {
				if(checkWinner(grid) == "R") {
					System.out.println("RED PLAYER WIN");
				}
				else if(checkWinner(grid) == "Y") {
					System.out.println("Yellow PLAYER WIN");
				}
				
			}
		loop =false;
		}
		
		
	}
	

}
