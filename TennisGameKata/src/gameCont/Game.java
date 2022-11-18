package gameCont;

public class Game {

	
	private Player player1;
	private Player player2;
	
	public Game(Player player1,Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		
	}
	public String getScore() {
		if(player1.getScore() > 3&& player2.getScore()>3) {
			return getLeadPlayer().getName() + " won";
		}else if (player1.getScore() == player2.getScore()) {
			return "Deuce";
		}
		else {
			return "Advantage "+ getLeadPlayer().getName();
		}
	}
	private Player getLeadPlayer() {
		// TODO Auto-generated method stub
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}
}
