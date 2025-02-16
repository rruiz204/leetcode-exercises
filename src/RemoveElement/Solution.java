package RemoveElement;

public class Solution {
  public static void main(String[] args) {
    
  }

  public static int solve(int[] numbers, int value) {
    int writeIndex = 0;

    for (int readIndex = 0; readIndex < numbers.length; readIndex++) {
      if (numbers[readIndex] != value) {
        numbers[writeIndex] = numbers[readIndex];
        writeIndex++;
      }
    }

    return writeIndex;
  }
}
