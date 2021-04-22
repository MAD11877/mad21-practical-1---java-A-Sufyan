import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.printIn("Enter integer: ");
    int number = in.nextInt();
    
    System.out.printIn("> {0}", number);
    for (int i = 1; i <= number; i++)
    {
      for (int j = number; j >= i; j--)
      {
        System.out.printIn("*");
      }
      System.out.printIn();
    }
  }
}
