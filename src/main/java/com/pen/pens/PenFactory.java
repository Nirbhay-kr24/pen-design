package com.pen.pens;

import com.pen.enums.*;
import com.pen.models.*;

public class PenFactory {

    public static Pen createPen(PenType type, String brand, String name, Double price) {
        switch (type) {
            case GEL:
                Ink gelInk = new Ink("Blue", brand, InkType.GEL);
                Nib gelNib = new Nib(0.5, NibType.GEL);
                return new GelPen(brand, name, price, new Refill(gelInk, gelNib, true));

            case BALL:
                Ink ballInk = new Ink("Black", brand, InkType.BALL);
                Nib ballNib = new Nib(0.7, NibType.BALL);
                return new BallPen(brand, name, price, new Refill(ballInk, ballNib, true));

            case FOUNTAIN:
                Ink fInk = new Ink("Blue", brand, InkType.FOUNTAIN);
                Nib fNib = new Nib(1.0, NibType.FOUNTAIN);
                return new FountainPen(brand, name, price, fInk, fNib);

            case MARKER:
                Ink mInk = new Ink("Black", brand, InkType.FOUNTAIN);
                Nib mNib = new Nib(2.0, NibType.FOUNTAIN);
                return new MarkerPen(brand, name, price, mInk, mNib);

            default:
                throw new IllegalArgumentException("Unknown Pen Type");
        }
    }
}