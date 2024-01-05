package dev.cryss.math;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysCompareTest {

    //test[System Under Test]_[Condition or State change]_[Expected Results]
    @DisplayName ("Test Comparing Arrays")
    @Test
    void testArrays_When_ElementsAreTheSame_ShouldBeEquals() {
        int[] numbers = {25, 8, 21};
        int [] expectedArray = {8, 21, 25};

        Arrays.sort (numbers);

        assertArrayEquals (expectedArray, numbers);
    }

    @DisplayName ("Test Comparing Arrays")
    @Test
   // @Timeout (1)
    @Timeout (value=15, unit = TimeUnit.MILLISECONDS)
    void testArraysSortPerformance() {
        int[] numbers = {25, 8, 21};
        for (int i =0; i< 10000000; i++){
            numbers[0] = i;
            Arrays.sort (numbers);
        }
    }

}
