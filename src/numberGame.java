import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

       //initialized
        int guessedNumber;
        int pickNumber;
        boolean guess;
        String answer;
        String numberGuess;
        pickNumber = (int) (Math.random() * 100) + 1;
        Scanner keyboard = new Scanner(System.in);
        guess = true;

        System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");

        System.out.println(pickNumber);
        guessedNumber= keyboard.nextInt();

        do {

           //logic
            System.out.println(logic());

            //game loop
            System.out.println("Do you want to play again?");
            answer = keyboard.next();
            if (answer.equalsIgnoreCase("yes")) {
                answer = "yes";
            } else {
                answer = "no";
            }
        } while (answer.equals("yes"));
    }
    //logic method
    public static String logic(){

        do {
            if (guessedNumber < pickNumber) {
                numberGuess = ("Too low, guess again.");
            }
            else if (guessedNumber > pickNumber) {
                numberGuess = ("Too high, guess again.");
            }
            else {
               numberGuess = ("congratulations!");
                guess = false;
            }
        } while (guess);
        return numberGuess;
    }
}
