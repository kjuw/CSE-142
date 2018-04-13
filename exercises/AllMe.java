import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

public class AllMe {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      Scanner input = new Scanner(new File("tarzan.txt"));
      welcome();
      System.out.println();
      options(console, input);
      
   }
   
   public static void welcome() {
      System.out.println("Welcome to the game of Mad Libs.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill in a story.");
      System.out.println("The result will be written to an output file.");
   
   }
   
   public static void options(Scanner console, Scanner input) {
      System.out.print("(C)reate mad-libs, (V)iew mad-libs, (Q)uit? ");
      String answer = console.next();
      if (answer.startsWith("C") || answer.startsWith("c")) {
         madLibs(console, input);
      } else if (answer.startsWith("V") || answer.startsWith("v")) {
         viewMadLib();
      } else if (answer.startsWith("Q") || answer.startsWith("q")) {
         System.exit(0);
      }
 
   }
   
   public static void madLibs(Scanner console, Scanner input) {
      while (input.hasNextLine()) {
         String line = console.nextLine();
         Scanner word = new Scanner(line);
            while (word.hasNext()) {
               String token = word.next();
                  while((token.startsWith("<") && token.endsWith(">"))) { 
                     token = token.substring(1, token.length()-1);
                  }
            }
      }                  
   }  
   
   public static void viewMadLib() {
      System.out.println("Move on");
   }
}