package com.pen.pens.nonrefillable;

import com.pen.models.Ink;
import com.pen.models.Nib;
import com.pen.models.PenType;
import com.pen.strategies.MarkerWritingStrategy;

public class MarkerPen extends NonRefillablePen {

    public MarkerPen(String brand, String name, Double price, Ink ink, Nib nib) {
        super(brand, name, PenType.MARKER, price, new MarkerWritingStrategy(), ink, nib);
    }
}
