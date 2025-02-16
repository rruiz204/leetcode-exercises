package SearchInsertPosition;

public class Solution {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4 };
    int result = solve(numbers, 5);
    System.out.println(result);
  }

  public static int solve(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    // binary search

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (numbers[mid] == target) {
        return mid;
      } else if (numbers[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return left;
  }
}
