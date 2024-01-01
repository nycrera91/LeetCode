package com.nycrera.fizzbuzz;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = "";

            if (divisibleBy3) {
                currStr = "Fizz";
            }

            if (divisibleBy5) {
                currStr += "Buzz";
            }

            if (currStr.isEmpty()) {
                currStr = String.valueOf(i);
            }

            answer.add(currStr);
        }

        return answer;
    }
}
