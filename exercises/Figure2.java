// Whitaker Brand
// CSE142
// Section: AF
// TA: Miya Natsuhara
// 
// Prints out two diamonds and one X
// 
// This program has improved the factoring somewhat, adding
// structure to the program in main, and also capturing some
// of the redudancy by putting the diamond code into a static
// method.
public class Figure2 {
   public static void main(String[] args) {
      printDiamond();
      System.out.println();
      printDiamond();
      System.out.println();
      printX();
   }

   // prints out an diamond shape in text
   public static void printDiamond() {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");   
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");   
   }
   
   // prints out an X shape in text
   public static void printX() {
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");   
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");   
   }
}
