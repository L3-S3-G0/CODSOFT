import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int guess;
        int score = 0;
        int games = 1;
        int attempt = 5;
        int num = 44;
        boolean state = true;
        String play;

        System.out.println("Let's play a number game!");
        System.out.println("You have 5 attempts to guess the number.");
        System.out.println("Guess a number between 1 and 100: ");

        
        guess = inn.nextInt();
        
        while(state){
           if( guess == num){
             System.out.println("Congratulations. You have guessed correctly");
             score++;
           }
           else if (guess > num){
             attempt--;
             System.out.println("Your guess is too big.");
             System.out.println("Guess a number between 1 and 100: ");
           }
           else{
             attempt--;
             System.out.println("Your guess is too small.");
             System.out.println("Guess a number between 1 and 100: ");

           }
           
           if (attempt == 0){
             System.out.println("You have run out of attempts.\nWould you like to play again? (Yes or No)");
             play = inn.nextLine().toLowerCase();
             
             if (play.equals("no")){state = false; break;}
             System.out.println("Guess a number between 1 and 100.");
       
        }   
    }
}