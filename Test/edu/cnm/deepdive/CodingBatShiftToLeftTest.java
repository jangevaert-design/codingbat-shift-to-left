package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatShiftToLeft.shiftLeft;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatShiftToLeftTest {

  private int[][] shiftParams = {
      {6, 2, 5, 3},
      {1, 2},
      {1},
      {},
      {1, 1, 2, 2, 4},
      {1, 1, 1},
      {1, 2, 3}
  };

  private int[][] shiftExpected = {
      {2, 5, 3, 6},
      {2, 1},
      {1},
      {},
      {1, 2, 2, 4, 1},
      {1, 1, 1},
      {2, 3, 1}
  };

  @Test
  void shiftTest() {
    for (int i = 0; i < shiftParams.length; i++) {
      String actual = Arrays.toString(shiftLeft(shiftParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(shiftExpected[i]));
    }
  }

}