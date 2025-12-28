public class TenMinWalk {
  public static boolean isValid(char[] walk) {
        int x = 0, y = 0;
​
        if (walk.length == 10) {
​
            for (char c : walk) {
                switch (c) {
                    case 'n': y++; break;
                    case 's': y--; break;
                    case 'e': x++; break;
                    case 'w': x--; break;
                }
            }
            return x == 0 && y == 0;
        } else {
            return false;
        }
    }
}