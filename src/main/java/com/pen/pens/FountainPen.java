package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.InkFillable;
import com.pen.interfaces.Cover;
import com.pen.models.Ink;
import com.pen.models.Nib;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FountainPen extends Pen implements InkFillable {
    private Ink ink;
    private Nib nib;

    public FountainPen(String brand, String name, Double price, Ink ink, Nib nib, Cover cover) {
        super(brand, name, price, PenType.FOUNTAIN, cover);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("Writing elegantly with Fountain Pen ink...");
    }


    @Override
    public void changeInk(Ink ink) {
        this.ink = ink;
        System.out.println("Fountain pen ink reservoir refilled.");
    }


    @Override
    public Ink getInk() {
        return this.ink;
    }
}