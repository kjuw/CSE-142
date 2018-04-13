public class TimesTable {
   public static void main(String[] args) {
   printTimesTable3(-1);
   printTimesTable3(0);
   printTimesTable3(100);
   printTimesTable3(1);
   printTimesTable3(99);
   
   }
   
   public static void printTimesTable1() {
      System.out.println("_| 01 02 03 04 05 06 07 08 09");
      for (int i = 1; i <= 10; i++) {
         System.out.printf("%02d", i);
         for (int j = 1; j < 10; j++) {
            System.out.printf(" %02d", i * j);
         } // end nested for loop
         System.out.println();
      } // end outer for loop
   }
   
   public static void printTimesTable2() {
      System.out.println("_| 01 02 03 04 05 06 07 08 09");
      int i = 1;
      while (i <= 10) {
         System.out.printf("%02d", i);
         int j = 1;
         while (j < 10) {
            System.out.printf(" %02d", i * j);
            j++;
         } // end nested while loop
         System.out.println();
         i++;
      } // end outer while loop
   }
   
   public static void printTimesTable3(int n) {
      if (n >= 100 || n <= 0) {
         return;
      }
      System.out.println("__| 001 002 003 004 005 006 007 008 009 010");
      for (int i = 1; i <= n; i++) {
         System.out.printf("%03d", i);
         for (int j = 1; j <= 10; j++) {
            System.out.printf(" %03d", i * j);
         } // end nested for loop
         System.out.println();
      } // end outer for loop
   }
   
   public static void printTimesTable4() {
      System.out.println("__| 001 002 003 004 005 006 007 008 009 010");
      int i = 1;
      while (i <= 10) {
         System.out.printf("%03d", i);
         int j = 1;
         while (j <= 10) {
            System.out.printf(" %03d", i * j);
            j++;
         } // end nested while loop
         System.out.println();
         i++;
      } // end outer while loop
   }
   
}