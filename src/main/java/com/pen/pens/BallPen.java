package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.RefillPen;
import com.pen.models.Refill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BallPen extends Pen implements RefillPen {
    private Refill refill;

    public BallPen(String brand, String name, Double price, Refill refill) {
        // Calling the base Pen constructor
        super(PenType.BALL);
        this.setBrand(brand);
        this.setName(name);
        this.setPrice(price);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing with Ball Pen: " + getBrand() + " " + getName());
    }

    @Override
    public void open() {
        System.out.println("Ball pen cap clicked/removed.");
    }

    @Override
    public void close() {
        System.out.println("Ball pen closed.");
    }

    // Implementing behavior from RefillPen interface
    @Override
    public void changeRefill(Refill newRefill) {
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