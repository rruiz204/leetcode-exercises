package LengthOfTheLastWord;

public class Solution {
  public static void main(String[] args) {

  }

  public static int solve(String phrase) {
    int length = 0;
    int index = phrase.length() - 1;

    while (index >= 0 && phrase.charAt(index) == ' ') {
      index--;
    }
    while (index >= 0 && phrase.charAt(index) != ' ') {
      length++;
      index--;
    }

    return length;
  }
}
