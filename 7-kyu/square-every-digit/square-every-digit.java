public class SquareDigit {
​
  public int squareDigits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = String.valueOf(n);
        for (char num : s.toCharArray()) {
            int digit = Character.getNumericValue(num);
​
            int squareDigit = (int) Math.pow(digit, 2);
​
            stringBuilder.append(squareDigit);
        }
        return Integer.parseInt(String.valueOf(stringBuilder));
​
  }
}