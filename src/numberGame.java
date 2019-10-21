import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

        int pickNumber;
        int guessedNumber;
        String guess;

        System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");
        pickNumber = (int) (Math.random() * 100) + 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(pickNumber);

        do {
                guessedNumber = keyboard.nextInt();

            if (guessedNumber < pickNumber) {
                System.out.println("Too low, guess again.");
                guess = "wrong";

                }

                else if (guessedNumber > pickNumber) {
                System.out.println("Too high, guess again.");
                guess = "wrong";


            } else {
                System.out.println("congradulations");
                guess = "right";

            }
            String answer;
            System.out.println("Do you want to play again?");
            answer = keyboard.nextLine();
                do {
                    if (answer.equalsIgnoreCase("yes")) {
                        answer = "yes";
                    } else {
                        answer.equals("no");
                    }
                }while (guess.equals("wrong"));
        }while (answer != "yes");
    }
}