import java.io.Console;

public class Prototype {
  public static void main(String[] args) {
    Console console = System.console();
    String ageAsString = console.readLine("How old are you?: ");
    int age = Integer.parseInt(ageAsString);
    if (age < 13) {
      // Insert exit code
      console.printf("Sorry you must be at least 13  to use this program.\n");
      System.exit(0);
    }
  }
}
