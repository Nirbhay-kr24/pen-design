package com.pen.pens;

import com.pen.covers.CapCover;
import com.pen.covers.ClickCover;
import com.pen.enums.*;
import com.pen.models.*;

public class PenFactory {

    public static Pen createPen(PenType type, String brand, String name, Double price) {
        switch (type) {
            case GEL:
                Ink gelInk = new Ink("Blue", brand, InkType.GEL);
                Nib gelNib = new Nib(0.5, NibType.GEL);
                Refill gelRefill = new Refill(gelInk, gelNib, true);
                return new GelPen(brand, name, price, gelRefill, new ClickCover());

            case BALL:
                Ink ballInk = new Ink("Black", brand, InkType.BALL);
                Nib ballNib = new Nib(0.7, NibType.BALL);
                Refill ballRefill = new Refill(ballInk, ballNib, true);
                return new BallPen(brand, name, price, ballRefill, new CapCover());

            case FOUNTAIN:
                Ink fInk = new Ink("Blue", brand, InkType.FOUNTAIN);
                Nib fNib = new Nib(1.0, NibType.FOUNTAIN);
                return new FountainPen(brand, name, price, fInk, fNib, new CapCover());

            case MARKER:
                Ink mInk = new Ink("Black", brand, InkType.FOUNTAIN);
                Nib mNib = new Nib(2.0, NibType.FOUNTAIN);
                return new MarkerPen(brand, name, price, mInk, mNib, new CapCover());

            default:
                throw new IllegalArgumentException("Unknown Pen Type: " + type);
        }
    }
}