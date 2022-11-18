import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public HashMap<Integer, String> returnWordForValue;

    public FizzBuzz() {
        returnWordForValue = new HashMap<>();

        returnWordForValue.put(3, "fizz");
        returnWordForValue.put(5, "buzz");
        returnWordForValue.put(7, "pop");
    }

    public String getResult(int number){
        StringBuilder returnValue = new StringBuilder();
        for(Map.Entry<Integer, String> entry : returnWordForValue.entrySet()) {
            if (number % entry.getKey() == 0){
                returnValue.append(entry.getValue()).append(" ");
            }
        }

        if (returnValue.isEmpty())
            return String.valueOf(number);
        else
            return returnValue.toString();
    }

    public void replaceWordForValue(int number, String word){
        if (returnWordForValue.containsKey(number)){
            returnWordForValue.replace(number, word);
        } else {
            returnWordForValue.put(number, word);
        }
    }

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz();
        game.replaceWordForValue(2, "fuzz");
        game.replaceWordForValue(3, "bizz");
        System.out.println(game.getResult(12));

    }
}
