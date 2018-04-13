import java.util.Scanner;

public class Madlibs1 {
public static void main(String[] args) {
System.out.println("Welcome to the game of Mad Libs.");
System.out.println("I will ask you to provide various words");
System.out.println("and phrases to fill in a story.");
System.out.println("The result will be written to an output file.");

Scanner console = new Scanner(System.in);



}


String lineSum = "";
while (s.hasNextLine()) {
   String line = s.nextLine();
   String wordSum = "";
   Scanner lineScanner = new lineScanner(line);
      while (lineScanner.hasNext()) {
         String token = lineScanner.nextLine();
            if (token.charAt(0) == '<' && token.charAt(token.length() - 1) == '>') {
               String token = token.substring(1, token.length() - 1);
               System.out.print("Please type an " + token + " ");
               String word = console.nextLine()
               wordSum += word + " ";
            } else {
               lineSum += token + " ";
            }
      }
}