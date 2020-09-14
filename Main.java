import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for all 4 numbers and allows input
    System.out.println("Please enter in the x coordinate of the first point");
    double x1 = input.nextDouble();
    System.out.println("Please enter in the y coordinate of the first point");
    double y1 = input.nextDouble();
    System.out.println("Please enter in the x coordinate of the second point");
    double x2 = input.nextDouble();
    System.out.println("Please enter in the y coordinate of the second point");
    double y2 = input.nextDouble();

    //calculates the slope and prints to user
    double y = y2 - y1;
    double x = x2 - x1;
    double slope = y / x;
    System.out.println("The slope of your line would be " + slope + ".");

  }
}
