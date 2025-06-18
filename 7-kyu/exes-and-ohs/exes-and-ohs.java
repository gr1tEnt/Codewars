import java.util.*;
​
public class XO {
  
  public static boolean getXO (String str) {
    String[] strings = str.toLowerCase().split("");
        return Arrays.stream(strings)
                .filter(s -> s.equals("x"))
                .count() == Arrays.stream(strings)
                .filter(s -> s.equals("o"))
                .count();
  }
}