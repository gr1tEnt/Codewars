import java.util.*;
​
public class Kata{
  public static int[] capitals(String s){
    String[] splittedString = s.split("");
        List<Integer> indexes = new ArrayList<>();
​
        for (int i = 0; i < splittedString.length; i++) {
            if (splittedString[i].equals(splittedString[i].toUpperCase()) & !s.isEmpty()) {
                indexes.add(i);
            }
        }
        return indexes.stream().mapToInt(Integer::intValue).toArray();
  }
}