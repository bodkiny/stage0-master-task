package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int resultAfterDivision = dividend / divider;
            int resultAfterMultiplication = resultAfterDivision * divider;
            String result = resultAfterMultiplication == dividend ? "can be divided completely" : "cannot be divided completely";
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

}
