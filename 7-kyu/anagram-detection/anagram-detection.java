import java.util.*;
​
public class Kata {
  public static boolean isAnagram(String a, String b) {
        String[] s1 = Arrays.stream(a.toLowerCase().split("")).sorted().toArray(String[]::new);
        String[] s2 = Arrays.stream(b.toLowerCase().split("")).sorted().toArray(String[]::new);
        
        return Arrays.equals(s1, s2);
  }
}