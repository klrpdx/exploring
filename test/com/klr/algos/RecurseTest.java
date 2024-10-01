package com.klr.algos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecurseTest {

    @Test
    void sum() {
        Integer[] nums = {1, 2, 3, 4, 5};
        Recurse recurse = new Recurse();
        int expected = 15;
        assertEquals(expected, recurse.sum(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void sumEmptyArray() {
        Recurse recurse = new Recurse();
        int expected = 0;
        assertEquals(expected, recurse.sum(new ArrayList<>(List.of())));
    }

}