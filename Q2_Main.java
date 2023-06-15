package Assign;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        findPerfectNumbers(1, n, result);
        return result;
    }

    public void findPerfectNumbers(int start, int end, ArrayList<Integer> result) {
        if (start <= end) {
            if (isPerfect(start, start - 1, 0)) {
                result.add(start);
            }
            findPerfectNumbers(start + 1, end, result);
        }
    }

    public boolean isPerfect(int num, int divisor, int sum) {
        if (divisor == 0) {
            return sum == num;
        }
        if (num % divisor == 0) {
            sum += divisor;
        }
        return isPerfect(num, divisor - 1, sum);
    }
}


public class Q2_Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.perfect(100));
        System.out.println(s.perfect(1000));
        System.out.println(s.perfect(6));
    }
}