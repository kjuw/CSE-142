import java.util.Scanner;

public class ScannerExample {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Type your name: ");
      String first = console.next();
      String last = console.next();
      if ((first.length() + last.length()) > 5) {
         String finalFirst = first.substring(0, 1);
         System.out.println("Your name is: " + last + ", " + finalFirst + ".");
      } else {
         System.out.println("Error, must be at least 5 chars with a space.");
      }   
   }
}