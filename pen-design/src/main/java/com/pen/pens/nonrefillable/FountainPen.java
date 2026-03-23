package com.pen.pens.nonrefillable;

import com.pen.models.Ink;
import com.pen.models.Nib;
import com.pen.models.PenType;
import com.pen.strategies.SmoothWritingStrategy;

public class FountainPen extends NonRefillablePen {

    public FountainPen(String brand, String name, Double price, Ink ink, Nib nib) {
        super(brand, name, PenType.FOUNTAIN, price, new SmoothWritingStrategy(), ink, nib);
    }
}
