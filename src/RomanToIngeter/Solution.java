package RomanToIngeter;

import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    Integer number = solve("MCMXCIV");
    System.out.println(number);
  }

  public static Integer solve(String roman) {
    HashMap<Character, Integer> romans = new HashMap<>();

    romans.put('I', 1);
    romans.put('V', 5);
    romans.put('X', 10);
    romans.put('L', 50);
    romans.put('C', 100);
    romans.put('D', 500);
    romans.put('M', 1000);

    Integer result = 0;
    Integer length = roman.length();

    for (int index = 0; index < length; index++) {
      int current = romans.get(roman.charAt(index));
      
      int next = index + 1;

      if (next < length && current < romans.get(roman.charAt(next))) {
        result -= current;
      } else {
        result += current;
      }
    }

    return result;
  }
}
