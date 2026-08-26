package sec2.week02;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
//        int x = 5;
//        int y = x;
//        x = 12;
//        System.out.println(y);
        Random rand = new Random(-7);
        int secret = generateRandomNumber(rand);
        System.out.println(secret);
        Scanner in = new Scanner(System.in);

        int guess = -1;

        int [] guesses = new int[4];
        int count = 0;


        while (guess != secret) {
            System.out.print("Enter a guess (1-20): ");
            guess = in.nextInt();
            guesses[count++] = guess;
//            count = count + 1; // count += 1; // count++;

//        if (secret == guess) {
            if (guess == secret) {
                System.out.println("Correct!");
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }

//        System.out.println(generateRandomNumber(rand));
    }

    public static int generateRandomNumber(Random rand) {
//        Random rand = new Random(-7);
        int max = 20;
        int r = Math.abs(rand.nextInt() % max) + 1;
        return r;
    }
}
