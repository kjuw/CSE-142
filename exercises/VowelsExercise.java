import java.util.Scanner;

public class VowelsExercise {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String word = console.nextLine();
      System.out.println("There are " + vowels(word) + " number of vowels in this word.");
   }
   
   public static int vowels(String word) {
   word = word.toLowerCase();
   int count = 0;
   int length = word.length();
   for (int i = 0; i < length; i++) {
      char c = word.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
         count++;
      }
   }
   return count;
}
}
 