import java.util.*;
​
public class Kata {
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}