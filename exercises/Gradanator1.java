import java.util.Scanner;

public class Gradanator1 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("The programs reads exam/homework scores");
      System.out.println("and reports your overall course grade.");
      System.out.println();
      double weightedMidtermScore = getExamScore("Midterm", console);
      System.out.println();
      double weightedFinalScore = getExamScore("Final", console);
      System.out.println();
      double weightedHomeworkScore = getHomeworkScore(console);
      double overallPercentage = weightedMidtermScore + weightedFinalScore + weightedHomeworkScore;
      printOverallPercentage(overallPercentage);
   }
   
   private static int getExamScore(
   
}