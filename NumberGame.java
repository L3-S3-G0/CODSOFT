import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int guess;
        int attempt;
        int num = 44;
        boolean state = true;

        System.out.println("Let's play a number game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have 5 attempts to guess the number.");
        
        guess = inn.nextInt();
        
    }

}