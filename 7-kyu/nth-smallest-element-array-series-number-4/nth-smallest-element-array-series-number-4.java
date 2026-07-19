import java.util.*;
​
public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().limit(n).max().getAsInt();
    }
}