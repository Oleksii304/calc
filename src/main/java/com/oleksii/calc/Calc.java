package com.oleksii.calc;

import org.springframework.stereotype.Service;

@Service
public class Calc {

    int sum(final int a, final int b) {
        return a + b;
    }

}
