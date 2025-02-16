package DuplicatesFromSortedArray;

public class Solution {
  public static void main(String[] args) {
    
  }

  public static int solve(int[] numbers) {
    if (numbers.length == 0) return 0;
    int inserted = 1;

    for (int index = 1; index < numbers.length; index++) {
      if (numbers[index] != numbers[index - 1]) {
        numbers[inserted] = numbers[index];
        inserted++;
      }
    }

    return inserted;
  }
}
