import java.util.*;
​
class Kata{
  public static long sumTwoSmallestNumbers(long[] numbers) {
    return Arrays.stream(numbers).sorted().limit(2).sum();
  }             
}