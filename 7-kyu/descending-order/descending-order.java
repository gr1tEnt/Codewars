import java.util.*;
​
public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] strings = String.valueOf(num).split("");
    Arrays.sort(strings, Comparator.reverseOrder());
    return Integer.parseInt(String.join("", strings));
  }
}