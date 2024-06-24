package com.epam.OOP;

public class Bird extends Animal {

    private static final String ADDITIONAL_BIRD_DESCRIPTION = " Moreover, it has 2 wings and can fly.";

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ADDITIONAL_BIRD_DESCRIPTION;
    }
}
