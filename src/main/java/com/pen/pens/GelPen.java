package com.pen.pens;

import com.pen.enums.PenType;
import com.pen.interfaces.RefillPen;
import com.pen.models.Refill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GelPen extends Pen implements RefillPen {
    private Refill refill;

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(PenType.GEL);
        this.setBrand(brand);
        this.setName(name);
        this.setPrice(price);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with Gel ink...");
    }

    @Override
    public void open() {
        System.out.println("Gel pen cap opened.");
    }

    @Override
    public void close() {
        System.out.println("Gel pen cap closed.");
    }

    @Override
    public void changeRefill(Refill refill) {
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
}