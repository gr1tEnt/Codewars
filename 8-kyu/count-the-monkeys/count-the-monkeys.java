public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        int[] res = new int[n];
        for (int i = 1; i <= n; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}