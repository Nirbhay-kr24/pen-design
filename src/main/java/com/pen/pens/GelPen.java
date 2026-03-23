package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.RefillPen;
import com.pen.interfaces.Cover; // Added
import com.pen.models.Refill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GelPen extends Pen implements RefillPen {
    private Refill refill;

    public GelPen(String brand, String name, Double price, Refill refill, Cover cover) {
        super(brand, name, price, PenType.GEL, cover);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with Gel ink...");
    }

    @Override
    public void refill(Refill refill) {
        if (this.canRefill()) {
            this.refill = refill;
            System.out.println("Gel refill replaced successfully.");
        } else {
            System.out.println("This gel pen is not refillable.");
        }
    }

    @Override
    public Boolean canRefill() {
        return refill.isRefillable();
    }

    @Override
    public Refill getRefill() {
        return this.refill;
    }
}