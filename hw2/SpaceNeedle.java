public class SpaceNeedle {
   static final int SIZE = 4;
   
   public static void main(String[] args) {
       pole();
      top();
      bottom();
      pole();
      column();
      top();  
   }
   
   public static void repeat(String s, int times) {
      for (int i = 1; i <= times; i++) {
         System.out.print(s);
      }
   }
   
   public static void pole() {
      int spaces = 3 * SIZE;
      for (int i = 0; i < SIZE; i++) {
         repeat(" ", spaces);
         System.out.println("||");
      }
   }
   
   public static void top() {
      for (int i = 0; i < SIZE; i++) {
         int spaces = -3 * i + 3 * (SIZE - 1);
         int colons = 3 * i;
         
         repeat(" ", spaces);
         System.out.print("__/");
         repeat(":", colons);
         System.out.print("||");
         repeat(":", colons);
         System.out.println("\\__");   
      }
      
      int quotes = 6 * SIZE;
      
      System.out.print("|");
      repeat("\"", quotes);
      System.out.println("|");
      
   }
   
   public static void bottom() {
      for (int i = 0; i < SIZE; i++) {
         int hats = -2 * i + 3 * SIZE - 1;
         int spaces = 2 * i;
         
         repeat(" ", spaces);
         System.out.print("\\_");
         repeat("/\\", hats);
         System.out.println("_/"); 
      }
   }
   
   public static void column() {
      for (int i = 0; i < SIZE * SIZE; i++){
         int percents = SIZE - 2;
         int spaces = 3 * SIZE - percents - 1;
         
         repeat(" ", spaces);
         System.out.print("|");
         repeat("%", percents);
         System.out.print("||");
         repeat("%", percents);
         System.out.println("|");
      }      
   } 
}