package com.example.demo;

import java.util.Arrays;

public class Calculator {

    public int add(int... args) {
        return Arrays.stream(args).sum();
    }
}
