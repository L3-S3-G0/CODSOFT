import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int guess;
        int score = 0;
        int games = 1;
        int attempt = 5;
        int num = 44;
        String play;

        System.out.println("Let's play a number game!");
        System.out.println("You have 5 attempts to guess the number.");
        System.out.println("Guess a number between 1 and 100: ");

        
        guess = inn.nextInt();
        attempt--;
        
        while(true){
           if( guess == num){
             System.out.println("Congratulations. You have guessed correctly\nWould you like to play again? (Yes or No)");
             score++;
             play = inn.next().toLowerCase();
             
             if (play.equals("yes")){
               System.out.println("Great!!!\nGuess a number between 1 and 100.");
             guess = inn.nextInt();
             games++;
             attempt = 5;
             }
             
             else{
                break;
             }
             
           }
           
           else if (guess > num){
             attempt--;
             System.out.println("Your guess is too big.");
             System.out.println("Guess a number between 1 and 100: ");
             guess = inn.nextInt();
           }
           else{
             attempt--;
             System.out.println("Your guess is too small.");
             System.out.println("Guess a number between 1 and 100: ");
             guess = inn.nextInt();

           }
           
           if (attempt == 0){
             System.out.println("You have run out of attempts.\nWould you like to play again? (Yes or No)");
             play = inn.next();
             play.toLowerCase(); 
             
             if (play.equals("yes")){
               System.out.println("Great!!!\nGuess a number between 1 and 100.");
             guess = inn.nextInt();
             games++;
             attempt = 5;
             }
             
             else{
                break;
             } 
          }
        }
        System.out.println("Here is your score board\nGames: " + games + " game\\s played\nWins: "+ score + " game\\s won!\n GAME OVER!!!");   
    }
}