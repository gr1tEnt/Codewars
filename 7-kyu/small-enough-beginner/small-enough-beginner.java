import java.util.*;
​
public class Kata {
  public static boolean smallEnough(int[] a, int limit) {
    return Arrays.stream(a).filter(b -> b <= limit).count() == a.length;
  }
}