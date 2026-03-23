package com.pen.pens.nonrefillable;

import com.pen.interfaces.InkFillable;
import com.pen.models.Ink;
import com.pen.models.Nib;
import com.pen.models.PenType;
import com.pen.pens.Pen;
import com.pen.strategies.WritingStrategy;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class NonRefillablePen extends Pen implements InkFillable {

    @Setter
    private Ink ink;
    private Nib nib;

    public NonRefillablePen(String brand, String name, PenType type, Double price,
            WritingStrategy writingStrategy, Ink ink, Nib nib) {
        super(brand, name, type, price, writingStrategy);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void changeInk(Ink ink) {
        this.ink = ink;
    }
}
