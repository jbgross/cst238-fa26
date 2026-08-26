package sec1.week01;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random(-7);
        Scanner in = new Scanner(System.in);
//        System.out.println(generateRandomNumber(rand));
//        int x = 5;
//        int r = x; // + generateRandomNumber();
//        r = 12;
//        System.out.println(x);
        int secret = generateRandomNumber(rand);
        System.out.println(secret);
        int answer = -1;
        int [] guesses = new int[4];
        int count = 0;

        for (count = 0;
             count < guesses.length && answer != secret;
             count++) {
//        while (secret != answer && count < 4) {
//            System.out.print("Enter a number (1-10): ");
//            answer = in.nextInt();
//
//            if(hasGuessBeenUsed(count, guesses, answer)) {
//                continue;
//            }
            answer = getUserGuess(count, guesses, in);

            guesses[count] = answer;
//            count = count + 1;
            if (answer == secret) {
                System.out.println("Correct!");
                break;
//                count = guesses.length;
            } else if (answer > secret) {
                System.out.println("Wrong! Too high.");
            } else {
                System.out.println("Wrong! Too low.");
            }
        }
        printGuesses(count, guesses);
    }

    public static int getUserGuess(int count, int [] guesses, Scanner in) {
        int answer;
        do {
            System.out.print("Enter a number (1-10): ");
            answer = in.nextInt();
        } while(answer < 1 || answer > 10 || hasGuessBeenUsed(count, guesses, answer) );
        return answer;
    }

    public static boolean hasGuessBeenUsed(int count, int [] guesses,  int answer) {
        for (int i = 0; i < count; i++) {
            if (answer == guesses[i]) {
                return true;
            }
        }
        return false;
    }

    public static void printGuesses(int count, int [] guesses) {
        for (int i = 0; i < count; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    public static int generateRandomNumber(Random rand) {
//        Random rand = new Random(0);
        return Math.abs(rand.nextInt()) % 10 + 1;
    }
}
