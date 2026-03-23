package com.pen.pens.refillable;

import com.pen.interfaces.RefillPen;
import com.pen.models.PenType;
import com.pen.models.Refill;
import com.pen.pens.Pen;
import com.pen.strategies.WritingStrategy;

import lombok.Getter;

@Getter
public abstract class RefillablePen extends Pen implements RefillPen {

    private Refill refill;

    public RefillablePen(String brand, String name, PenType type, Double price,
            WritingStrategy writingStrategy, Refill refill) {
        super(brand, name, type, price, writingStrategy);
        this.refill = refill;
    }

    @Override
    public void changeRefill(Refill refill) {
        if (canRefill()) {
            this.refill = refill;
        }
    }
}
