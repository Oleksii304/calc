package com.oleksii.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @Autowired
    private Calc calc;

    @RequestMapping("/sum")
    String sum(final @RequestParam("a") Integer a, final @RequestParam("b") Integer b) {
        return String.valueOf(calc.sum(a, b));
    }

}
