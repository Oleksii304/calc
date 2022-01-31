package com.oleksii.calc;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calc {

    @Cacheable("sum")
    public int sum(final int a, final int b) {

        try {
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }

        return a + b;
    }

}
