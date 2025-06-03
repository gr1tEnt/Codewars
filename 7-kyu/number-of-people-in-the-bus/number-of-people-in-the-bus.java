import java.util.ArrayList;
​
class Metro {
​
  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
  }
}