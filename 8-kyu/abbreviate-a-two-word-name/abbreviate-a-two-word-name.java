public class AbbreviateTwoWords {
​
  public static String abbrevName(String name) {
        String[] arr = name.split(" ");
        return arr[0].toUpperCase().charAt(0) + "." + arr[1].toUpperCase().charAt(0);
  }
}