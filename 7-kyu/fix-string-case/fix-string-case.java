public class Solution {
    public static String solve(final String str) {
        char[] chars = str.toCharArray();
        int uppers = 0;
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                uppers++;
            }
        }
        return uppers > chars.length / 2 ? str.toUpperCase() : str.toLowerCase();
    }
}