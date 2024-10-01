package com.klr.algos;

import java.util.List;

public class Recurse {
    public int sum(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        return nums.remove(nums.size() - 1) + sum(nums);
    }
}
