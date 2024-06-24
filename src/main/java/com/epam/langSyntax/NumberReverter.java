package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        int revertedNumber = Integer.parseInt(sb.reverse().toString());
        System.out.println(revertedNumber);
    }

}
