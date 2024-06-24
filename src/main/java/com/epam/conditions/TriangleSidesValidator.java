package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private boolean isValidTriangle(double firstSide, double secondSide, double thirdSide) {
        return isSumOfTwoSidesGreaterThanThird(firstSide, secondSide, thirdSide) &&
                isSumOfTwoSidesGreaterThanThird(secondSide, thirdSide, firstSide) &&
                isSumOfTwoSidesGreaterThanThird(thirdSide, firstSide, secondSide);
    }

    private boolean isSumOfTwoSidesGreaterThanThird(double side1, double side2, double side3) {
        return side1 + side2 > side3;
    }

}
