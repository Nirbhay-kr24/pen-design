package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.Cover;
import com.pen.models.Ink;
import com.pen.models.Nib;

public class MarkerPen extends Pen {
    private Ink ink;
    private Nib nib;

    public MarkerPen(String brand, String name, Double price, Ink ink, Nib nib, Cover cover) {
        super(brand, name, price, PenType.MARKER, cover);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() { System.out.println("Writing thick lines with Marker."); }
}