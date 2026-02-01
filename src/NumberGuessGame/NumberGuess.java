package NumberGuessGame;
import java.util.Scanner;
import java.util.Random;


public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random a = new Random();
        int secretnumber = a.nextInt(100)+1;
        int guess = 0;
        int attempt = 0;

        System.out.println("//NUMBER GUESSING GAME");
        System.out.println("Guess the correct number");

        while (guess!=secretnumber){
            System.out.println("Enter your guess : ");
            guess = sc.nextInt();
            attempt++;
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                continue;
            }
            if (guess > secretnumber){
                System.out.println("Too high");
            }else if (guess < secretnumber){
                System.out.println("Too low");
            }else {
                System.out.println("Correct guess in " + attempt + " Attempts!");
            }
        }
    }
}
