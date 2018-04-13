import java.util.Scanner;
import java.util.io.*;

public class AllMe {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      welcome();
      System.out.println();
      options(console);
      
   }
   
   public static void welcome() {
      System.out.println("Welcome to the game of Mad Libs.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill in a story.");
      System.out.println("The result will be written to an output file.");
   
   }
   
   public static void options(Scanner console) {
      System.out.print("(C)reate mad-libs, (V)iew mad-libs, (Q)uit? ");
      String answer = console.next();
      File f = new File("tarzan.txt");
      
      if (f.exits()) {
         System.out.println(f);
      }
   }
}