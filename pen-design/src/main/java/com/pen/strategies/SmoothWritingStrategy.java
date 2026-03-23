package com.pen.strategies;

public class SmoothWritingStrategy implements WritingStrategy {

    @Override
    public void write() {
        System.out.println("Writing smoothly");
    }
}
