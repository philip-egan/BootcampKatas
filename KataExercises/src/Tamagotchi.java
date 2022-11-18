import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tamagotchi extends Thread{
    private int hungriness, fullness, tiredness, happiness;

    public Tamagotchi() {
        this.hungriness = 0;
        this.fullness = 0;
        this.tiredness = 0;
        this.happiness = 100;
    }

    public void feed(){
        hungriness -= 10;
        fullness += 10;
        System.out.println("Tamagotchi was fed");
        printStatuses();
    }

    public void play(){
        happiness += 10;
        tiredness += 10;
        System.out.println("Tamagotchi was played");
        printStatuses();
    }

    public void sleep(){
        tiredness -= 10;
        System.out.println("Tamagotchi slept");
        printStatuses();
    }

    public void poop(){
        fullness -= 10;
        System.out.println("Tamagotchi pooped");
        printStatuses();
    }

    public void printStatuses(){
        System.out.println("Hungriness: " + this.hungriness);
        System.out.println("Fullness: " + this.fullness);
        System.out.println("Tiredness: " + this.tiredness);
        System.out.println("Happiness: " + this.happiness);

    }

    @Override
    public void run() {
        while(true){
            tiredness += 10;
            hungriness += 10;
            happiness -= 10;

            try {
                sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.start();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        while(true){
            String input = reader.readLine();

            switch (input){
                case "check":
                    tamagotchi.printStatuses();
                    break;
                case "feed":
                    tamagotchi.feed();
                    break;
                case "sleep":
                    tamagotchi.sleep();
                    break;
                case "poop":
                    tamagotchi.poop();
                    break;
                case "play":
                    tamagotchi.play();
                    break;
                case "exit":
                    return;
            }
        }
    }
}
