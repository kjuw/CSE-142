import java.util.Scanner;

public class Madlibs {
   public static void main(String[] args) {
   System.out.println("Welcome to the game of Mad Libs.");
   System.out.println("I will ask you to provide various words");
   System.out.println("and phrases to fill in a story.");
   System.out.println("The result will be written to an output file.");
   System.out.println();
   Scanner console = new Scanner(System.in);
   System.out.println("(C)reate mad-libs, (V)iew mad-libs, (Q)uit? ");
   String option = console.nextLine();
   if (option.charAt(0) == 'C') {
      System.out.println("Input file name: ");
      Scanner input = new Scanner(new File("tarzan.txt"));
      if (input != tarzan.txt) {
         System.out.println("Try again: ");
      }
   }
     
   }
}