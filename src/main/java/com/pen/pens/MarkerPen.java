package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.models.Ink;
import com.pen.models.Nib;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarkerPen extends Pen {
    private Ink ink;
    private Nib nib;

    public MarkerPen(String brand, String name, Double price, Ink ink, Nib nib) {
        super(PenType.MARKER);
        this.setBrand(brand);
        this.setName(name);
        this.setPrice(price);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("Writing thick lines with Marker: " + getBrand());
    }

    @Override
    public void open() {
        System.out.println("Marker cap removed.");
    }

    @Override
    public void close() {
        System.out.println("Marker cap tightly closed to prevent drying.");
    }
}