public class Kata {
​
  public static int[] between(int a, int b) {
        int[] res = new int[b - a + 1];
​
        for (int i = a; i <= b; i++) {
            res[i - a] = i;
        }
​
        return res;
  }
}