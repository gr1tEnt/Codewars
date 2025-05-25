public class Kata {
  public static String highAndLow(String numbers) {
        String[] strings = numbers.split(" ");
        int max = Integer.parseInt(strings[0]);
        int min = Integer.parseInt(strings[0]);
​
        for (String num : strings) {
            int currentInt = Integer.parseInt(num);
​
            if (currentInt > max) {
                max = currentInt;
            }
​
            if (currentInt < min) {
                min = currentInt;
            }
        }
        return max + " " + min;
  }
}