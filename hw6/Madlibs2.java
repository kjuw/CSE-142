import java.io.*;
import java.util.Scanner;

public class Madlibs2 {
   public static void main(String[] args) throws FileNotFoundException {
   System.out.println("Welcome to the game of Mad Libs.");
   System.out.println("I will ask you to provide various words");
   System.out.println("and phrases to fill in a story.");
   System.out.println("The result will be written to an output file.");
   System.out.println();
   Scanner console = new Scanner(System.in);
   System.out.println("(C)reate mad-libs, (V)iew mad-libs, (Q)uit? ");
   String option = console.next();
   while (option.equalsIgnoreCase(C)) {
      System.out.println("Input file name: ");
      String file = console.nextLine();
      if (file == "tarzan.txt") {
        Scanner input = new Scanner(new File("tarzan.txt"));
        while (input.hasNextLine()) {
           String line = input.nextLine();
           Scanner word = new Scanner(line);
           if (word.charAt(0) == '<' && word.charAt(length() - 1) == '>') {
                             
           }
        } 
      }
   }
     
   }
}