// Whitaker Brand
// CSE142
// Section: AF
// TA: Miya Natsuhara
// 
// Prints out two diamonds and one X
// 
// This program has the best version of factoring.
// The main method reads like a table of contents,
// and we don't have any duplicated lines of code
// in the program.
//
// Note that calling a method twice is not "duplicated"
// code -- it's the only way (that we know so far) to
// do the same thing twice. We factor code into static
// methods so that we don't have to write out all of 
// the details twice.
public class Figure3 {
   public static void main(String[] args) {
      printDiamond();
      System.out.println();
      printDiamond();
      System.out.println();
      printX();
   }

   // prints out an diamond shape in text
   public static void printDiamond() {
      upTriangle();
      downTriangle();
   }
   
   // prints out an X shape in text
   public static void printX() {
      downTriangle();
      upTriangle();
   }

   // prints out an upwards-pointing triangle in text
   public static void upTriangle() {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");   
   }

   // prints out an downwards-pointing triangle in text
   public static void upTriangle() {
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");   
   }
}
