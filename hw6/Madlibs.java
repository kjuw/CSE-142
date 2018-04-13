import java.util.Scanner;

public class Madlibs {
   public static void main(String[] args) {
      System.out.println("Welcome to the games of Mad libs.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill the story.");
      System.out.println("The result will be written to an output.");
      System.out.println();
      
      Scanner console = new Scanner(System.in);
      System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      String option = console.nextLine();
      while (option != options.equalsIgnoreCase("Q"))
      if (option.equalsIgnoreCase("C")) {
         createMabLib();
      }
      else if (option.equalsIgnoreCase("V")) {
         viewMabLib();
      }
      else if (options.equalsIgnoreCase("Q") {
         
      }
      else {
         System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      }

   }
   
   private static void createMabLib() {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file name: ");
      Scanner console = new Scanner(new File("tarzan.txt"));
      
   }
   
}