  public class Sum {
    // goofy ahh method
     public int GetSum(int a, int b) { 
        int res = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                res += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                res += i;
            }
        }
        return res;
     }
  }