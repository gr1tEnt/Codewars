import java.util.*;
​
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return (Arrays.stream(classPoints).average().getAsDouble() < yourPoints);
  }
}