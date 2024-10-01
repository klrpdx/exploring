package com.klr.algos;

import java.util.List;

public class Recurse {
    public int sum(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        return nums.remove(nums.size() - 1) + sum(nums);
    }

    public int gcd(int width, int height) {

        if (width < 0 || height < 0) {
            return 0;
        }
        if (width == 0) {
            return height;
        }
        if (height == 0) {
            return width;
        }

        int divisor = height;
        int dividend = width;
        if (width < height) {
            divisor = width;
            dividend = height;
        }

        int remainder = dividend % divisor;
        if (remainder == 0) {
            return divisor;
        }
        return gcd(divisor,remainder);
    }
}
