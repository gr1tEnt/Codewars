import java.util.List;
​
public class BinaryArrayToNumber {
​
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int res = 0;
        int multiply = 1;
​
        for (int i = 0; i < binary.size(); i++) {
            res += binary.get(binary.size() - i - 1) * multiply;
            multiply *= 2;
        }
        return res;
    }
}