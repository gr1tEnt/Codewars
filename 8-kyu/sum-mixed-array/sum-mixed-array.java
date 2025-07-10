import java.util.List;
​
public class MixedSum {
​
  public int sum(List<?> mixed) { 
    return mixed.stream().mapToInt(num -> Integer.parseInt(String.valueOf(num))).sum();
  }
}