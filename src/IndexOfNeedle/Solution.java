package IndexOfNeedle;

public class Solution {
  public static void main(String[] args) {
    int result = solve("sadbutsad", "sad");
    System.out.println(result);
  }

  public static int solve(String haystack, String needle) {
    if (haystack.length() == 0) return -1;

    int left = 0;

    for (int right = needle.length(); right <= haystack.length(); right++) {
      boolean equals = haystack.substring(left, right).equals(needle);
      if (equals) return left;
      left++;
    }

    return -1;
  }
}
