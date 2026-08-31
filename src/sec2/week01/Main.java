package sec2.week01;
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


        for (count = 0;
             count < guesses.length && guess != secret;
             count++) {
            guess = getUserGuess(in, guesses, count);
//        while (guess != secret) {
//            System.out.print("Enter a guess (1-20): ");
//            guess = in.nextInt();

//            if(hasGuessBeenUsed(guess, guesses, count)) {
//                System.out.println("Guess has been used");
//                continue;
//            }

            guesses[count] = guess;
//            count = count + 1; // count += 1; // count++;

//        if (secret == guess) {
            if (guess == secret) {
                System.out.println("Correct!");
//                return;
//                break;
//                count = guesses.length;
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
            // the end of the loop body
        }
        System.out.println("game over");

//        System.out.println(generateRandomNumber(rand));
    }

    public static int getUserGuess(Scanner in, int [] guesses, int count) {
        int guess;
        do {
            System.out.print("Enter a number (1-20): ");
            guess = in.nextInt();
        } while (guess < 1 || guess > 20 || hasGuessBeenUsed(guess, guesses, count));
        return guess;
    }

    public static boolean hasGuessBeenUsed(int guess, int [] guesses, int count) {
        for (int i = 0; i < count; i++) {
            if (guess == guesses[i]) {
                return true;
            }
        }
        return false;
    }

    public static int generateRandomNumber(Random rand) {
//        Random rand = new Random(-7);
        int max = 20;
        int r = Math.abs(rand.nextInt() % max) + 1;
        return r;
    }
}
