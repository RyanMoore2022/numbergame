import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");
        int pickNumber;
        pickNumber = (int) (Math.random() * 100) + 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(pickNumber);
        int guessedNumber;


        //game loop
        do{



            String answer;
            System.out.println("Do you want to play again?");
            answer = keyboard.nextLine();


            if (answer.equalsIgnoreCase("yes")) {
                answer = "yes";
            }
            else { answer.equals("no"){
            }
        }while(answer != "yes");

/*

            //logic
            do {

                guessedNumber = keyboard.nextInt();


                if (guessedNumber < pickNumber) {
                    System.out.println("Too low, guess again.");

                } else if (guessedNumber > pickNumber) {
                    System.out.println("Too high, guess again.");

                } else {
                    System.out.println("Congratulations");
                    System.out.println("Do you want to play again?");
                    keyboard.nextInt();

                }



            } while (guessedNumber != pickNumber);


*/




        }

















}
