// Whitaker Brand
// TA: Amelia Schull
// Section: BB
// 
// This program demonstrates some simple usages of variables, storing three different types: 
// int, double, and String.
//
// A note about the "duplicated" expression:
// It looks a little redundant to have both the math version of the expression, (int x = ...)
// and the String (text) version, (String expression = ...)
// but it turns out that eliminating this specific redundancy would be a somewhat substantial challenge.

public class VariableExample {
   public static void main(String[] args) {
      // integers   0, 1, 2, 67, 1999, -17, -12312348
      // whole numbers, including 0 and negative numbers
      // java type is int
      int x = 4 + 3 * 8 / 2 - 13;
      int y = 5;      
      int z = x + y;

      // String (of characters): plain ol' text, letters, numbers, characters in a sequence
      // java type is String
      String expression = "4 + 3 * 8 / 2 - 13";
      String name = "Whitaker";
    
      // real numbers, floating point numbers:  4.0, 3.14159, -1.9, 100000.7, 1.0
      // (double means: double-precision floating point number)
      // java type is double (or float, but prefer double over float)
      double grade = 4.0;
      double weight = 72.5748; 

      // Some output to show that we can use variables in String concatenation:
      System.out.println("Second favorite movie: Hogfather");
      System.out.println("We calculated x with the following expression: " + expression);
      System.out.println("And the resulting value of x is: " + x);
      System.out.println("y = " + y);
      System.out.println(3 + 2 + 1 + "4");
      System.out.println("z = " + z);
   }
}
