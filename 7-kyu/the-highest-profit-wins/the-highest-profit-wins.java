import java.util.*;
​
class MinMax {
    public static int[] minMax(int[] arr) {
      return new int[]{
                Arrays.stream(arr).min().getAsInt(),
                Arrays.stream(arr).max().getAsInt()
        };
    }
}