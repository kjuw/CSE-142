import java.util.Scanner;

public class Gradanator {
   private static void printScore(int score, int max, int weight, double weightedScore) {      
      System.out.println("Total points = " + score + " / " + max);
      System.out.printf("Weighted score = %.1f / " + weight + "\n", weightedScore);
   }
   
   private static void printOverallScore(double overallPercentage) {
      System.out.printf("Overall percentage = %.1f\n", overallPercentage);
      System.out.print("Your grade will be at least: ");
      if (overallPercentage >= 85) {
         System.out.println("3.0");
         System.out.println("Good job! You are on the path to success!");
      } else if (overallPercentage >= 75) {
         System.out.println("2.0");
         System.out.println("Sometimes you have to take what you get.");
      } else if (overallPercentage >= 60) {
         System.out.println("0.7");
         System.out.println("Please see an academic advisor.");
      } else {
         System.out.println("0.0");
         System.out.println("You should have withdrawen from the course.");
      }
   }

   private static double getExamScore(String name, Scanner console) {
      double weightedExamScore;
      System.out.println(name + ":");
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Score earned? ");
      int score = console.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? ");
      int shifted = console.nextInt();
      if (shifted == 1) {
         System.out.print("Shift amount? ");
         int shiftAmount = console.nextInt();
         score = Math.min(score + shiftAmount, 100);
      } 
      weightedExamScore = weight * (score/100.0);
      printScore(score, 100, weight, weightedExamScore);
      
      return weightedExamScore;
   }
   
   private static double getHomeworkScore(Scanner console) {
      double homeworkWeightedScore;
      System.out.println("Homework:");
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Number of assignments? ");
      int assignments = console.nextInt();
      int score = 0;
      int max = 0;
      for (int i = 1; i <= assignments; i++) {
         System.out.print("Assignment " + i + " score and max? ");
         score += console.nextInt();
         max += console.nextInt();
      }
      System.out.print("How many sections did you attend? ");
      int sections = console.nextInt();
      int sectionPoints = Math.min(sections * 5 , 30);
      score += sectionPoints;
      max += 30;
      System.out.println("Section points = " + sectionPoints + " / 30");
      homeworkWeightedScore = 1.0 * weight * score / max;
      printScore(score, max, weight, homeworkWeightedScore);
      
      return homeworkWeightedScore;
   }
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("This program reads exam/homework scores");
      System.out.println("and reports your overall course grade.");
      System.out.println();
      double midtermWeightedScore = getExamScore("Midterm", console);
      System.out.println();
      double finalWeightedScore = getExamScore("Final", console);
      System.out.println();
      double homeworkWeightedScore = getHomeworkScore(console);
      System.out.println();
      double overallPercentage = midtermWeightedScore + finalWeightedScore + homeworkWeightedScore;
      printOverallScore(overallPercentage);
   }
}