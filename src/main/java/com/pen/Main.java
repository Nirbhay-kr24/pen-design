package com.pen;

import com.pen.enums.PenType;
import com.pen.pens.Pen;
import com.pen.pens.PenFactory;
import com.pen.interfaces.RefillPen;
import com.pen.models.Refill;
import com.pen.models.Ink;
import com.pen.models.Nib;
import com.pen.enums.InkType;
import com.pen.enums.NibType;

public class Main {
    public static void main(String[] args) {


        Pen myGelPen = PenFactory.createPen(PenType.GEL, "Pilot", "G2", 120.0);
        Pen myFountain = PenFactory.createPen(PenType.FOUNTAIN, "Waterman", "Expert", 2500.0);

        System.out.println("--- Testing Gel Pen Lifecycle ---");

        myGelPen.start();


        myGelPen.write();


        if (myGelPen instanceof RefillPen refillable) {
            if (refillable.canRefill()) {
                System.out.println("Refilling the Gel Pen...");
                Ink newInk = new Ink("Red", "Pilot", InkType.GEL);
                Nib newNib = new Nib(0.5, NibType.GEL);
                refillable.refill(new Refill(newInk, newNib, true));
            }
        }


        myGelPen.close();

        System.out.println("\n--- Testing Fountain Pen Lifecycle ---");
        myFountain.start();
        myFountain.write();

        myFountain.close();
    }
}