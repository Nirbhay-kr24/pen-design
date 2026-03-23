package com.pen.covers;

import com.pen.interfaces.Cover;

public class ClickCover implements Cover {
    @Override
    public void start() { System.out.println("Click! Pen is ready."); }
    @Override
    public void close() { System.out.println("Click! Pen is retracted."); }
}