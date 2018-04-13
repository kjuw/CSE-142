// Whitaker Brand
// TA: Miya Natsuhara
// CSE142
// Section AB
//
// This program prints out a Diamond shape.
// It is an example of a first-try at producing the output,
// and the subsequent programs improve on it using
// forloops and static methods.

public class Diamond0 {
   public static void main(String[] args) { 
      upTriangle();
      downTriangle();
   }
   
   public static void upTriangle() {
      System.out.println("  /\\");
      System.out.println(" /..\\");
      System.out.println("/....\\");      
   }
   
   public static void downTriangle() {
      System.out.println("\\..../");
      System.out.println(" \\../");
      System.out.println("  \\/");   
   }
}