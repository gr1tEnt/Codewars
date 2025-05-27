public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    // so damn funny method
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/") & v2 != 0) {
            return v1 / v2;
        } else {
            return 0;
    }
  }
}