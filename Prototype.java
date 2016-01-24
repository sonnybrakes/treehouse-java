import java.io.Console;

public class Prototype {
  public static void main(String[] args) {
    Console console = System.console(); {
    String ageAsString = console.readLine("How old are you?: ");
    int age = Integer.parseInt(ageAsString);
      if (age < 13) {
        // Insert exit code
        console.printf("Sorry you must be at least 13  to use this program.\n");
        System.exit(0);
      }
    String name = console.readLine("Enter a name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");
      if (noun.equalsIgnoreCase("dork") ||
          noun.equalsIgnoreCase("jerk")) {
        console.printf("That language is not allowed.  Exiting \n\n");
        System.exit(0);
      }
    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending in -ing:  ");

      console.printf("Your Treehouse Story:\n---------------------\n");
      console.printf("%s is an %s %s.  ", name, adjective, noun);
      console.printf("He is always %s %s.  \n", adverb, verb);
    }
  }
}
