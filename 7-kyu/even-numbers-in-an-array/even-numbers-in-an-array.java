import java.util.*;
​
public class Kata{
  
  public static int[] evenNumbers(int[] arr, int n){
    int[] evenNumbers = Arrays.stream(arr).filter(a -> a % 2 == 0).toArray();
    return Arrays.stream(evenNumbers).skip(Arrays.stream(evenNumbers).count() - n).toArray();
  }
  
}