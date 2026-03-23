package com.pen.pens.refillable;

import com.pen.models.PenType;
import com.pen.models.Refill;
import com.pen.strategies.SmoothWritingStrategy;

public class GelPen extends RefillablePen {

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price, new SmoothWritingStrategy(), refill);
    }

    @Override
    public Boolean canRefill() {
        return getRefill().getRefillable();
    }
}
