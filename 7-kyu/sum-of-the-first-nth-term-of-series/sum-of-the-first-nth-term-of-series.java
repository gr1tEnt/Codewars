public class NthSeries {
  public static String seriesSum(int n) {
    double sum = 0;
        double divisor = 1;
​
        for (int i = 0; i < n; i++) {
            sum += 1 / divisor;
            divisor += 3;
        }
​
        return String.format("%.2f", sum);
  }
}