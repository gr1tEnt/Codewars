import java.util.*;
​
public class Printer {
    
    public static String printerError(String s) {
        String[] strings = s.split("");
        long res = Arrays.stream(strings).sorted(Collections.reverseOrder()).takeWhile(a -> !Objects.equals(a, "m")).count();
        return (Arrays.asList(strings).contains("m")) ? res + "/" + s.length() : "0/" + s.length();
    }
}