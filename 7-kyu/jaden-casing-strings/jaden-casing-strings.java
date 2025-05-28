import java.util.*;
import java.util.stream.Stream;
​
public class JadenCase {
  
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            String[] words = phrase.split(" ");
​
            Stream<String> strings = Arrays.stream(words).map(j -> j.replaceAll("^.", String.valueOf(j.toUpperCase().charAt(0))));
            return String.join(" ", strings.toList());
        }
    }
​
}