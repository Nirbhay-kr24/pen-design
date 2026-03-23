package com.pen.covers;
import com.pen.interfaces.Cover;

public class CapCover implements Cover {
    @Override
    public void start() { System.out.println("Removing the cap..."); }
    @Override
    public void close() { System.out.println("Putting the cap back on."); }
}