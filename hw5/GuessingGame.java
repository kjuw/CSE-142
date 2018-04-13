import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int countGames = 0;
      int sumGuesses = 0;
      String str = "yes";
      while (str.startsWith("y") || str.startsWith("Y")) {
         //sumGuesses += playOneGame();
         playOneGame();
         System.out.println("Do you want to play again? ");
         str = console.nextLine();

         }
         countGames++;
 
}  
   private static int playOneGame() {
      Random rand = new Random();
      int guess = -1;
      int number = rand.nextInt(100) + 1;
      Scanner console = new Scanner(System.in);
      System.out.println("I'm thinking of a number between 1 and 100 ...");
      int count = 0;
      while (guess != number) {
         System.out.print("Your guess? ");
         guess = console.nextInt();
         if (guess > number) {
            System.out.println("It's lower.");
         } else if (guess < number) {
            System.out.println("It's higher.");
         }
         count++;
      }  
      System.out.println("You got it right in " + count + " guesses!");
      return count;
   }
}
