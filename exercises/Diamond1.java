// Whitaker Brand
// TA: Miya Natsuhara
// CSE142
// Section AB
//
// This program prints out a Diamond shape.
// It is improved over Diamond0, but still
// needs some work.
public class Diamond1 {
   public static void main(String[] args) {
      upTriangle();
      downTriangle();
   }
   
   public static void upTriangle() {
      //System.out.println("  /\\");   // i = 1
      //System.out.println(" /..\\");  // i = 2
      //System.out.println("/....\\"); // i = 3
      
      for (int i = 1; i <= 3; i++) {
         //System.out.println("Hello! i = " + i);
         
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
   
   public static void downTriangle() {
      System.out.println("\\..../");
      System.out.println(" \\../");
      System.out.println("  \\/");      
   }
}