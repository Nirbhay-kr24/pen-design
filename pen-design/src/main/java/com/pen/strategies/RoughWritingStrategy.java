package com.pen.strategies;

public class RoughWritingStrategy implements WritingStrategy {

    @Override
    public void write() {
        System.out.println("Writing roughly");
    }
}
