import java.util.*;
​
public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(a -> a * 2).toArray();
  }
}