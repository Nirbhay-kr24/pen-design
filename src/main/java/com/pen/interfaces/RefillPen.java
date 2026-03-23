package com.pen.interfaces;

import com.pen.models.Refill;

public interface RefillPen {

    void refill(Refill refill);

    Boolean canRefill();

    Refill getRefill();
}