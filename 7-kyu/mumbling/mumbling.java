public class Accumul {
    public static String accum(String s) {
        String[] strings = s.split("");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase() + strings[i].repeat(i).toLowerCase();
        }
        return String.join("-", strings);
    }
}