import java.util.*;
​
public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(Boolean.TRUE::equals).count();
    }
}