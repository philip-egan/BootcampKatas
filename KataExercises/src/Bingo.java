import java.util.*;

public class Bingo {
    Set<Integer> bingoNumbers;

    public Bingo() {
        this.bingoNumbers = new HashSet<>();
    }

    public void callBingo(int number){
        if (1 > number || number > 75){
            System.out.println("Your number is incorrect");
        }
        if (bingoNumbers.contains(number)){
            System.out.println("Your number was already called");
        }
        bingoNumbers.add(number);
        System.out.println("Your number was called");
    }

    public static HashMap<Integer, List<Integer>> generateBingoCard(){
        HashMap<Integer, List<Integer>> bingoCard = new HashMap<>();
        for(int i=0;i<5;i++){
            bingoCard.put(i, new ArrayList<>());
        }

        for(int i=0;i<5;i++) {
            List<Integer> column = bingoCard.get(i);

            for (int j = 0; j < 5; j++) {
                int randomNumber = randomNumberGenerator(1 + i * 15, 15 + i * 15);

                if (column.isEmpty()) {
                    column.add(randomNumber);
                } else {
                    while (column.contains(randomNumber)) {
                        randomNumber = randomNumberGenerator(1 + i * 15, 15 + i * 15);
                    }
                    column.add(randomNumber);
                }

            }

        }
        bingoCard.get(2).set(2,0);

        return bingoCard;
    }

    public static int randomNumberGenerator(int min, int max){
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public static void printCard(HashMap<Integer, List<Integer>> bingoCard){
        for(int i=0;i<5;i++){
            System.out.println(bingoCard.get(i).toString());
            System.out.println();
        }
    }

    public boolean checkCard(HashMap<Integer, List<Integer>> bingoCard){
        for(int i=0;i<5;i++){
            for(int numbers : bingoCard.get(i)){
                if (!bingoNumbers.contains(numbers)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printCard(generateBingoCard());
    }
}