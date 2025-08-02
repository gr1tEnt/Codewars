import java.util.*;
​
public class Kata {
  public static int sum(int[] numbers) {
        if (numbers == null || Arrays.stream(numbers).anyMatch(Objects::isNull) || numbers.length < 2) {
            return 0;
        }
        return Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
​
  }
}