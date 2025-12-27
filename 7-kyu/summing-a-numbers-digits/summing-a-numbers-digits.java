public class Kata{
    public static int sumDigits(int number) {
        String[] ints = String.valueOf(number).split("");
        int res = 0;
        for (String anInt : ints) {
            if (anInt.equalsIgnoreCase("-")) {
                continue;
            } else {
                res += Integer.parseInt(anInt);
            }
        }
        return res;
    }
}