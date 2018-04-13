import java.util.Scanner;

public class PrintNumbers {
   public static void main(String[] args) {
      int number = 1;
      while (number < 200) {
         System.out.print(number + " ");
         number = number * 2;
      }
   }
}