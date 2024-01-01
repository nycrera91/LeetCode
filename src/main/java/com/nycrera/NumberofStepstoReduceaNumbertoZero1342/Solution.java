package com.nycrera.NumberofStepstoReduceaNumbertoZero1342;

public class Solution {

    public int numberOfSteps(int num) {

        int step = 0;

        while (num >= 1) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            step++;

        }

        return step;

    }

}

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
