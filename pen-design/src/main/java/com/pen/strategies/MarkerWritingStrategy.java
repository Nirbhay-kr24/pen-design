package com.pen.strategies;

public class MarkerWritingStrategy implements WritingStrategy {

    @Override
    public void write() {
        System.out.println("Writing with Marker");
    }
}
