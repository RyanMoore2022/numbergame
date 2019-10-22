import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        boolean guess;
        String answer;
        int pickNumber;
        int guessedNumber;

        System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");

            guess = false;
            pickNumber = (int) (Math.random() * 100) + 1;
            System.out.println(pickNumber);
            Scanner keyboard = new Scanner(System.in);
            do {
                    //logic
                    guessedNumber = keyboard.nextInt();

                    if (guessedNumber < pickNumber) {
                        System.out.println("Too low, guess again.");
                    } else if (guessedNumber > pickNumber) {
                        System.out.println("Too high, guess again.");
                    } else {
                        System.out.println("congratulations!");
                        guess = true;
                    }
                } while (!guess);

                //game loop
               do {
                   System.out.println("Do you want to play again?");
                   answer = keyboard.next();
                   if (answer.equalsIgnoreCase("yes")){
                       answer = "yes";
                   }
                   else(answer = "no")
               }while();

        }
    }