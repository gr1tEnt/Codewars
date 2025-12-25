import java.util.stream.*;
import java.util.*;
​
public class Solution{
  public static String doubleChar(String s){
    return Arrays.stream(s.split("")).map(n -> n.repeat(2)).collect(Collectors.joining());
  }
}