import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

       //initialized
        String answer;
        Scanner keyboard = new Scanner(System.in);
        int guessedNumber;

        System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");

        do {

            guessedNumber = keyboard.nextInt();

           //logic
            int pickNumber = (int) (Math.random() * 100) + 1;

            do {


            }while (guess);
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

    public static String logic(int guessedNumber,  int pickNumber){

        //return variable
        String numberGuess;

            if (guessedNumber < pickNumber) {
                numberGuess = ("Too low, guess again.");
            }
            else if (guessedNumber > pickNumber) {
                numberGuess = ("Too high, guess again.");
            }
            else {
               numberGuess = ("congratulations!");
                
            }


        return numberGuess;
    }
}