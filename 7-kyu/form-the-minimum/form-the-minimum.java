import java.util.*;
import java.util.stream.Collectors;
​
public class Minimum{
​
  public static int minValue(int[] values){
  
    return Integer.parseInt(Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
  }
​
}