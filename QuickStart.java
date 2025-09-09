/*
 * Dylan Brown
 * Programming: For fun
 * September 7th - September 2025
 */
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class QuickStart {
    public static void main(String[] args) throws Exception{
        //Objects from implementation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //variables
        String playAgain = "y";
        //Dialogue:
        System.out.println("Welcome to my guessing game.");
        System.out.println("Each round, you must guess a number in between the range given.");
        System.out.println("Now try guessing numbers from 1-10.");
        System.out.println("You have 3 attempts. GO ON NOW. GUESS!");
        //
        while(playAgain.equalsIgnoreCase("y")){
            int guess = 0;
            int answer = random.nextInt(10) + 1;
            boolean correctGuess = false;
            for(int attempts = 3; attempts > 0; attempts--){
                try{
                    System.out.println("Your guess: ");
                    guess = scanner.nextInt();
                    scanner.nextLine();
                    //checks if guess is correct or not
                    if(guess == answer){
                        System.out.println("That is Correct. Congratulations!!!");
                        correctGuess = true;
                        break; // exits the for loop
                    }//ends if statement
                    else if(guess > answer){
                        System.out.println("Try a smaller number");
                    }//ends if statement
                    else{
                        System.out.println("Try a larger number.");
                    }//ends else if statement
                    //if the the remaining number of attempts is equal to 0
                    if(attempts > 1){
                        System.out.println("You have " + (attempts - 1) + " attempts remaining.");
                    }//ends if statement
                }//ends try method
                 catch (InputMismatchException e){
                System.out.println("Invalid data type. Please try again.");
                scanner.nextLine();
                }//ends catch method
            }//ends for loop
            if(!correctGuess){
                System.out.println("Nice try. The correct answer was " + answer);
            }//ends if statement
            do{
                System.out.println("Play again? (Y/N)");
                playAgain = scanner.nextLine();
            }while(!playAgain.equalsIgnoreCase("y") && 
            !playAgain.equalsIgnoreCase("n"));
            //ends do method
            //System.out.println("Would you like to play again?(Y/N)");
            //playAgain = scanner.nextLine();
        }//ends while loop
        System.out.println("Okay. Thank you for playing!!!");
        scanner.close();
    }//ends main method
}//ends quickStart class
