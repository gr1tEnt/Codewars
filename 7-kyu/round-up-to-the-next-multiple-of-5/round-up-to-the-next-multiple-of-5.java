package com.codewars.hwtdstrngls;
​
public class RoundToTheNextMultipleOf5 {
​
  public static int roundToNext5(int number) {
    if (number % 5 != 0) {
            while (number % 5 != 0) {
                number++;
            }
        }
        return number;
  }
}
​