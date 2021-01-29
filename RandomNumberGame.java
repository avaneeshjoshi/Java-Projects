import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner gameDifficulty = new Scanner(System.in);
        System.out.println("This is a Random Number Guessing Game.");
        System.out.println("Please Choose Your Difficulty... Easy, Normal or Hard");
        System.out.println("Easy being a number between 1 and 10; Normal being a number between 1 and 100; Hard being a number between 1 and 1000");
        System.out.println("Enter your difficulty in all lower case");
        System.out.println("You have 5 attempts");
        String difficulty = gameDifficulty.next();
        if (difficulty.equals("easy")) {
            double myNum = Math.ceil(Math.random() * 10);
            int skip = 0;
            Scanner gameGuess = new Scanner(System.in);
            System.out.println("My number is a number between 1 and 10... make a guess");
            while (skip < 5) {
                double myGuess = gameGuess.nextInt();
                if (myNum == myGuess) {
                    System.out.println("Good Job, You guessed my number. My number is " + myNum + ".");
                } else if (myNum < myGuess) {
                    System.out.println("You guessed too high. Guess again but this time lower.");
                } else if (myNum > myGuess) {
                    System.out.println("You guessed too low. Guess again but this time higher.");
                }
                skip++;
            }
            System.out.println("You Failed... Try Again Later");
        } else if (difficulty.equals("normal")) {
            double myNum = Math.ceil(Math.random() * 100);
            int skip = 0;
            Scanner gameGuess = new Scanner(System.in);
            System.out.println("My number is a number between 1 and 100... make a guess");
            while (skip < 5) {
                double myGuess = gameGuess.nextInt();
                if (myNum == myGuess) {
                    System.out.println("Good Job, You guessed my number.. My number is " + myNum + ".");
                } else if (myNum < myGuess) {
                    System.out.println("You guessed too high.. Guess again but this time lower.");
                } else if (myNum > myGuess) {
                    System.out.println("You guessed too low.. Guess again but this time higher.");
                }
                skip++;
            }
            System.out.println("You Failed... Try again later");
        } else if (difficulty.equals("hard")) {
            double myNum = Math.ceil(Math.random() * 1000);
            int skip = 0;
            Scanner gameGuess = new Scanner(System.in);
            System.out.println("My number is a number between 1 and 1000... make a guess");
            while (skip < 5) {
                double myGuess = gameGuess.nextInt();
                if (myNum == myGuess) {
                    System.out.println("Good Job, You guessed my number... My number is " + myNum + ".");
                } else if (myNum < myGuess) {
                    System.out.println("You guessed too high... Guess again but this time lower.");
                } else if (myNum > myGuess) {
                    System.out.println("You guessed too low... Guess again but this time higher.");
                }
                skip++;
            }
            System.out.println("You Failed... Try Again later");
        } else
            System.out.println("Try Again Later");
    }
}
