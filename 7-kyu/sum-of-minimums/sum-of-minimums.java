import java.util.*;
​
public class Kata {
  public static int sumOfMinimums(int[][] arr) {   
  int res = 0;
​
        for (int[] i : arr) {
          res += Arrays.stream(i).min().getAsInt();
      }
    return res;
  }
}