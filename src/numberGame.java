import java.util.Scanner;

public class numberGame {
    public static void main(String[] args){

    System.out.println("Hello, welcome to the number guessing game. You must find the correct number between 1 and 100.");
        int pickNumber;
        pickNumber = (int)(Math.random()*100)+1;
     int guessedNumber;
     Scanner keyboard = new Scanner(System.in);
     guessedNumber = keyboard.nextInt();




        //logic
        do{
            if (guessedNumber < pickNumber){
                System.out.println("Too low, guess again.");
            }

            else if (guessedNumber > pickNumber){
                System.out.println("Too high, guess again.");
            }

            else if (guessedNumber == pickNumber){
                System.out.println("Congratulations");
            }


        }while((guessedNumber == pickNumber));


    }
















}
