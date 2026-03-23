package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.RefillPen;
import com.pen.interfaces.Cover; // Added
import com.pen.models.Refill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BallPen extends Pen implements RefillPen {
    private Refill refill;

    // Updated Constructor to include the Cover strategy
    public BallPen(String brand, String name, Double price, Refill refill, Cover cover) {
        // Pass everything to the super constructor for a cleaner look
        super(brand, name, price, PenType.BALL, cover);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing with Ball Pen: " + getBrand() + " " + getName());
    }

    @Override
    public void refill(Refill newRefill) {
        if (this.canRefill()) {
            this.refill = newRefill;
            System.out.println("Refill changed successfully for Ball Pen.");
        } else {
            System.out.println("Error: This Ball Pen is a Use-and-Throw model.");
        }
    }

    @Override
    public Boolean canRefill() {
        return refill.isRefillable();
    }
}