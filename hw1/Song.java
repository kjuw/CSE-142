public class Song {
   public static void fly() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");   
   }
   
   public static void spider() {
      System.out.println("She swallowed the spider to catch the fly,");
      fly();
   }
   
   public static void bird() {
      System.out.println("She swallowed the bird to catch the spider,");
      spider();
   }
   
   public static void cat() {
      System.out.println("She swallowed the cat to catch the bird,");
      bird();
   }
   
   public static void dog() {
      System.out.println("She swallowed the dog to catch the cat,");
      cat();
   }
   
   public static void cow() {
      System.out.println("She swallowed the cow to catch the dog,");
      dog();
   }
   
   public static void main(String[] args) {
      System.out.println("There was an old woman who swallowed a fly.");
      fly();
      System.out.println();
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spider();
      System.out.println();
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      bird();
      System.out.println();
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      cat();
      System.out.println();
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dog();
      System.out.println();
      System.out.println("There was an old woman who swallowed a cow,");
      System.out.println("How could we allow her to sallow a cow.");
      cow();
      System.out.println();
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");  
   }
}