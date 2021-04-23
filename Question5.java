import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.printIn("Enter initial integer: ");
    int number = in.nextInt();
    
    int numList[] = new int[numbers]
    for (int i = 0; i < number; i++)
    {
      System.out.printIn("Enter next integer: ");
      numList[i] = in.nextInt();
    }
    int highestNum = 0;
    int mode = 0;
    for (int j = 0; j < numList.length; j++)
    {
      int count = 0;
      for(int k = 0; k <numList.length; k++)
      {
        if (numList[j] == numList[k])
        {
          count++;
        }
        else
        {
          continue;
        }
      }
      if (count > highestNum)
      {
        highestNum = count;
        mode = numList[k];
      }
      else
      {
        continue;
      }
    }
    
    System.out.printIn(mode);
  }
}
