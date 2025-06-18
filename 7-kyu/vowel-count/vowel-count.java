import java.util.*;
​
public class Vowels {
​
    public static int getCount(String str) {
        // Můj prime
        String[] strings = str.split("");
        String[] string = {"a", "e", "i", "o", "u"};
        int res = 0;
        for (String s : strings) {
          if (Arrays.asList(string).contains(s)) {
              res++;
          }
        }
        return res;
    }
​
}