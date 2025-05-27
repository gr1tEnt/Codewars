public class StringToNumber {
  public static int stringToNumber(String str) {
    return !str.isEmpty() ? Integer.parseInt(str) : 0;
  }
}