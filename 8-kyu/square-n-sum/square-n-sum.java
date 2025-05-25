import java.util.Arrays;
​
public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(y -> (int) Math.pow(y, 2)).sum();
    }
 }