import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> input = new ArrayList<String>();

    String word = "";
    while (!word.equals("STOP"))
    {
      System.out.println("Please enter words, enter STOP to stop the loop.");
      word = sc.nextLine();
      input.add(word);
    }
    System.out.println("Enter the letter to search for");
    String worder = sc.nextLine();
    System.out.println("Search for: " + countSecondInitial(input, worder));
    ArrayList<String> input2 = new ArrayList<String>();
    String worder2 = "";
    while(!worder2.equals("STOP")) {
      System.out.println("Please enter words again, enter STOP to stop the loop.");
      worder2 = sc.nextLine();
      input2.add(worder2);
    }
    System.out.println("Enter the word to search for");
    String target = sc.nextLine();
    System.out.println("Search for: " + searchSecond(input2, target));
  }

  /** Returns the number of Strings in the ArrayList that has the letter
   * as the second letter in that word.
   * Precondition: The arr is not null, and is not empty.
   * Precondition: The letter is exactly one letter.
   */
  public static int countSecondInitial(ArrayList<String> arr, String letter)
  {
    int counter = 0;
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i).substring(1, 2).equals(letter)) {
          counter++;
        }
    }
    return counter;
  }

  /** Returns the index of the second occurrence of target within the ArrayList
   * If the target is not found, or is only found once, then -1 is returned.
   * Precondition: Neither arr nor target are null.  The arr is non-empty.
   */
  public static int searchSecond(final ArrayList<String> arr, String target)
  {
    int counter = 0;
    int appearance = 0;
    for(int i = 0; i < arr.size(); i++) {
        String element = arr.get(i);
        if(element.equals(target)) {
            appearance++;
        }
        if(appearance > 1) {
          return i;
        }
    }
    return -1;
  }
}
