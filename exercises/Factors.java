import java.util.Scanner;

public class Factors {
   public static void main(String[] args) {
   factor3(0);
   factor3(-6);
   factor1(6);
      
   }
   
   public static void factor1(int number) {
      // it should return and do nothing.
      if (number == 0) {
         return;
      }
      if (number < 0) {
         number = number * -1;
      }
      for (int i = 1; i < number; i++) {
         if (number % i == 0) {
            System.out.print(i + ", ");
         }
      }
      System.out.println(number);
   }
   
   public static void factor2(int number) {
      // it should return and do nothing.
      if (number == 0) {
         return;
      }
      if (number < 0) {
         number = number * -1;
      }
      System.out.print("1");
      for (int i = 2; i <= number; i++) {
         if (number % i == 0) {
            System.out.print(", " + i);
         }
      }
      System.out.println();
   }
   
   public static void factor3(int number) {
      // it should return and do nothing.
      if (number == 0) {
         return;
      }
      if (number < 0) {
         number = number * -1;
      }
      int i = 1;
      while (i < number) {
         if (number % i == 0) {
            System.out.print(i + ", ");
         }
         i++;
      }
      System.out.println(number);
   }
   
   public static void factor4(int number) {
      if (number == 0) {
         return;
      }
      if (number < 0) {
         number = number * -1;
      }
      System.out.print("1");
      int i = 2;
      while (i <= number) {
         if (number % i == 0) {
            System.out.print(", " + i);
         }
         i++;
      }
      System.out.println();
   }
}
