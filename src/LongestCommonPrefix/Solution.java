package src.LongestCommonPrefix;

public class Solution {
  public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    String common = solve(strs);
    System.out.println(common);
  }

  public static String solve(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String prefix = strs[0];

    for (int index = 1; index < strs.length; index++) {
      while (strs[index].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);

        if (prefix.isEmpty()) return "";
      }
    }

    return prefix;
  }
}
