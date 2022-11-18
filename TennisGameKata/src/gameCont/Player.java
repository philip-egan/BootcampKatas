package gameCont;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Player {

	
	public static final List<String> pointsDescription = Arrays.asList("Love","15","30","40");
	
	private int score;
	
	int getScore() {
		return score;
	}
	
	String name;
	public String getName() {
		return name;
	}
	
	public void winBall() {
		this.score = this.score +1;
	}
	public Player(String name) {
		this.name = name;
	}
	public String getScoreDescription() {
		return pointsDescription.get(score);
	}
	
}
