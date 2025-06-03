import java.util.*;
​
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String[] s = (s1 + s2).split("");
        return String.join("", Arrays.stream(s).distinct().sorted().toList());
    }
}