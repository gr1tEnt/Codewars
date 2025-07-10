import java.util.*;
​
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count = 0;
​
        List<String> chars = new ArrayList<>(Arrays.stream(text.toLowerCase()
                        .split(""))
                .sorted()
                .toList());
​
        for (int i = 0; i < chars.size() - 1; i++) {
            if (chars.get(i).equals(chars.get(i + 1))) {
                count++;
​
                String duplicated = chars.get(i);
​
                while (i < chars.size() - 1 && chars.get(i + 1).equals(duplicated)) {
                    i++;
                }
            }
        }
        return count;
    }
}