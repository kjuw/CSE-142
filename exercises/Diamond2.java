// Whitaker Brand
// TA: Miya Natsuhara
// 10/4/2017
// CSE142
// Section AB
//
// This program prints out a Diamond shape.
// It is a work-in-progress that produces the output.
// Both classes got through the top half of the figure:
// The bottom half of the figure has been added.
//
// It is far from perfect -- it lacks any static 
// methods, or structure, and it needs some 
// improvements before we're happy with it.
public class Diamond2 {
   public static void main(String[] args) {
      drawTopHalf();
      drawBottomHalf();   
   }
   
   public static void drawBottomHalf() {
//\..../
// \../
//  \/
      for (int i = 1; i <= 3; i++) {
         // print out one line
         // print out some spaces
         for (int spaces = 1; spaces <= i - 1; spaces++) {
            System.out.print(" ");
         }
         
         // print out a backslash
         System.out.print("\\");
         
         // print out some periods
         // 1 -- 4
         // 2 -- 2
         // 3 -- 0
         for (int periods = 1; periods <= 6 - (2 * i); periods++) {
            System.out.print(".");
         }
         
         // print out a slash
         System.out.println("/");
      }
   }
   
   
   public static void drawTopHalf() {
      // This first outer forloop produces the top half of figure
      // 1  /\
      // 2 /..\
      // 3/....\
      // i represents the line number
      for (int i = 1; i <= 3; i++) {
         // print spaces
         // 3 - i is the pattern we figured out in the loop table
         for (int spaces = 1; spaces <= 3 - i; spaces++) {
            System.out.print(" ");
         }
         
         // print /
         System.out.print("/");
      
         // print .
         // 2 * i - 2 is a pattern we figured out in the loop table
         for (int periods = 1; periods <= 2 * i - 2; periods++) {
            System.out.print(".");
         }
         
         // print \\
         System.out.println("\\");
      }
      // print the second half      
   }
}