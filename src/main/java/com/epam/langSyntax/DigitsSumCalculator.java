package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;

        number = number > 0 ? number : number * -1;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        new DigitsSumCalculator().calculateSum(-450);
    }

}
