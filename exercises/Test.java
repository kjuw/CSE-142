import java.util.Scanner;

public class Test {
   public static void main(String args[]) {
   Scanner console = new Scanner(System.in);
   String name;
   
   // your code goes here
   while (true) {
       System.out.print("Type your name: ");
       String line = console.nextLine();
       String[] split = line.split(" ");
       String first = split[0];
       String last = "";
       if (split.length > 1) {
         last = split[1];
       }
       if (first.length() > 0 && last.length() > 0 && first.length() + last.length() > 3) {
           name = last + ", " + first.charAt(0) + ".";
           break;
       }
       System.out.println("Error, must be at least 5 chars with a space.");
   }
   
   
   System.out.println("Your name is: " + name);
   }
}         System.out.print("Input file name: ");
         String fileName = console.next();
         Scanner input = new Scanner(new File(fileName));
         File file = new File("
         
         
         if (file == "tarzan.txt") {
         while (input.hasNextLine()) {
         String line = console.nextLine();
         Scanner word = new Scanner(line);
            while (word.hasNext()) {
            String token = word.next();
               while((token.startsWith("<") && token.endsWith(">"))) { 
                  token = token.substring(1, token.length()-1);
                  token = token.replace("<", "").replace(">", "");
               }
            }
          }
       }