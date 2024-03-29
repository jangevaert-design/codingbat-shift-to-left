package edu.cnm.deepdive;

/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */

import java.util.Arrays;

public class CodingBatShiftToLeft {

  public static void main(String[] args) {
    System.out.println("Given the array [6, 2, 5, 3],the outcome will be "
        + Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})) + ".");
    System.out.println("Given the array [1, 2],the outcome will be "
        + Arrays.toString(shiftLeft(new int[]{1, 2})) + ".");
    System.out.println("Given the array [1],the outcome will be "
        + Arrays.toString(shiftLeft(new int[]{1})) + ".");
  }

  public static int[] shiftLeft(int[] nums) {

    int temp = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      temp = nums[i];
      nums[i] = nums [i + 1];
      nums[i + 1] = temp;
    }

    return nums;
  }


}
