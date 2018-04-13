// Whitaker Brand
// TA: Miya Natsuhara
// CSE142
// Section AB
//
// This program prints out a Diamond shape.
// It is improved over Diamond2, but still
// hasn't implemented the class constant yet.
public class Diamond3 {
   public static void main(String[] args) {
      upTriangle();
      downTriangle();
   }
   
   // prints out an upwards facing triangle
   public static void upTriangle() {
      // Careful, this code is overcommented:
      // all of the code that is commented out should be
      // deleted (but I think it is helpful for you to see it)
      // and there are more in-line comments than necessary
      // It's good to write pseudocode to get started,
      // but most of the comments inside this method
      // could/should be deleted.
      
      //System.out.println("  /\\");   // i = 1
      //System.out.println(" /..\\");  // i = 2
      //System.out.println("/....\\"); // i = 3
      
      for (int i = 1; i <= 3; i++) {
         // print out some spaces
         for (int spaces = 1; spaces <= 3 - i; spaces++) {
            System.out.print(" ");
         }
         
         // print out some slashes
         System.out.print("/");
         
         // print out some periods
         for (int periods = 1; periods <= 2 * i - 2; periods++) {
            System.out.print(".");
         }
         
         // print out some backslashes
         System.out.println("\\");
         // end the line
         //System.out.println();
      }
   }
   
   // prints a downwards-pointing triangle
   public static void downTriangle() {
      // Original printlns:
      //System.out.println("\\..../");  i = 1
      //System.out.println(" \\../");   i = 2
      //System.out.println("  \\/");    i = 3      
      
      // Note: We don't need to space things out so much,
      // and this code is over commented. The following
      // is spaced well, and isn't overcommented like
      // the up-triangle method.
      for (int i = 1; i <= 3; i++) {
         for (int spaces = 1; spaces <= i - 1; spaces++) {
            System.out.print(" ");
         }
         System.out.print("\\");
         for (int periods = 1; periods <= 6 - 2 * i; periods++) {
            System.out.print(".");
         }
         System.out.println("/");
      }
   }
}