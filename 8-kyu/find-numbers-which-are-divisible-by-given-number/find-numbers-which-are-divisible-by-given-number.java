import java.util.Arrays;
​
public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
   return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
  }
}