package com.pen.pens.refillable;

import com.pen.models.PenType;
import com.pen.models.Refill;
import com.pen.strategies.RoughWritingStrategy;

public class BallPen extends RefillablePen {

    public BallPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.BALL, price, new RoughWritingStrategy(), refill);
    }

    @Override
    public Boolean canRefill() {
        return getRefill().getRefillable();
    }
}
