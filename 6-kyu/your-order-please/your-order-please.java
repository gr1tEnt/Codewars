import java.util.*;
​
public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
​
        String[] wordsArr = words.split(" ");
​
        String[] resArray = new String[wordsArr.length];
​
        for (String s : wordsArr) {
            String[] ch = Arrays.stream(s.split("")).sorted().toArray(String[]::new);
            for (int j = 0; j < ch.length; j++) {
                int indexForOrder = Integer.parseInt(ch[0]);
                resArray[indexForOrder - 1] = s;
            }
        }
        return String.join(" ", resArray);
    }
}