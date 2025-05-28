import java.util.*;
​
public class Kata {
  public static String[] capMe(String[] strings) {
    return strings.length > 0 ? Arrays.stream(strings)
                .map(a -> {
                    if (a == null || a.isEmpty()) {
                        return a;
                    }
                    return Character.toUpperCase(a.charAt(0)) + a.toLowerCase().substring(1);
                })
                .toArray(String[]::new) : strings;
  }
}