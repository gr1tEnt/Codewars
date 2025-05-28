import java.util.*;
​
public class Kata {
    public static int findShort(String s) {
        String[] strings = s.split(" ");
​
        return Arrays.stream(strings).map(String::length).min(Integer::compare).get();
    }
}