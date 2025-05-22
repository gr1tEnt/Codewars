public class RemoveChars {
    public static String remove(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length() - 1);
        return String.valueOf(builder);
    }
}
​