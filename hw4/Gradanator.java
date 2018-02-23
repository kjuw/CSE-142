import java.util.Scanner;

public class Gradanator {
   public static void main(String[] args) {
      int max;
      int weight;
      int score;
      int shifted;
      int shiftAmount;
      int assignments;
      int sections;
      Scanner console = new Scanner(System.in);
      System.out.println("This program reads exam/homework scores");
      System.out.println("and reports your overall course grade.");
      System.out.println();
      System.out.println("Midterm:");
      System.out.print("Weight (0-100)? ");
      weight = console.nextInt();
      System.out.print("Score earned? ");
      score = console.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? ");
      shifted = console.nextInt();
      if (shifted == 1) {
         System.out.print("Shift amount? ");
         shiftAmount = console.nextInt();
         score = Math.min(score + shiftAmount, 100);
      } 
      System.out.println("Total points = " + score + " / 100");
      double midtermWeightedScore = weight * (score/100.0);
      System.out.printf("Weighted score = %.1f / " + weight + "\n", midtermWeightedScore);
      System.out.println();
      System.out.println("Final:");
      System.out.print("Weight (0-100)? ");
      weight = console.nextInt();
      System.out.print("Score earned? ");
      score = console.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? "); 
      shifted = console.nextInt();
      if (shifted == 1) {
         System.out.print("Shift amount? ");
         shiftAmount = console.nextInt();
         score = Math.min(score + shiftAmount, 100);
      }
      System.out.println("Total points = " + score + " / " + 100);
      double finalWeightedScore = weight * score / 100.0;
      System.out.printf("Weighted score = %.1f / " + weight + "\n", finalWeightedScore);
      System.out.println();
      System.out.println("Homework:");
      System.out.print("Weight (0-100)? ");
      weight = console.nextInt();
      System.out.print("Number of assignments? ");
      assignments = console.nextInt();
      score = 0;
      max = 0;
      for (int i = 1; i <= assignments; i++) {
         System.out.print("Assignment " + i + " score and max? ");
         score += console.nextInt();
         max += console.nextInt();
      }
      System.out.print("How many sections did you attend? ");
      sections = console.nextInt();
      int sectionPoints = Math.min(sections * 5 , 30);
      score += sectionPoints;
      max += 30;
      System.out.println("Section points = " + sectionPoints + " / 30");
      System.out.println("Total points = " + score + " / " + max);
      double homeworkWeightedScore = 1.0 * weight * score / max;
      System.out.printf("Weighted score = %.1f / " + weight + "\n", homeworkWeightedScore);
      System.out.println();
      double overallPercentage = midtermWeightedScore + finalWeightedScore + homeworkWeightedScore;
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
}