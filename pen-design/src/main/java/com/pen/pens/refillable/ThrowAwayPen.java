package com.pen.pens.refillable;

import com.pen.models.PenType;
import com.pen.models.Refill;
import com.pen.strategies.RoughWritingStrategy;

public class ThrowAwayPen extends RefillablePen {

    public ThrowAwayPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.THROW_AWAY, price, new RoughWritingStrategy(), refill);
    }

    @Override
    public Boolean canRefill() {
        // ThrowAway pens are never refillable regardless of the refill's own flag
        return false;
    }
}
