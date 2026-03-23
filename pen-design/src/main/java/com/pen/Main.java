package com.pen;

import com.pen.models.*;
import com.pen.pens.nonrefillable.FountainPen;
import com.pen.pens.nonrefillable.MarkerPen;
import com.pen.pens.refillable.BallPen;
import com.pen.pens.refillable.GelPen;
import com.pen.pens.refillable.ThrowAwayPen;

public class Main {

    public static void main(String[] args) {


        Ink gelInk = new Ink("Blue", "Pilot", InkType.GEL);
        Nib gelNib = new Nib(0.5, NibType.GEL);
        Refill gelRefill = new Refill(gelInk, gelNib, true);
        GelPen gelPen = new GelPen("Pilot", "G2", 120.0, gelRefill);

        gelPen.write();                          // Writing smoothly
        System.out.println("Can refill: " + gelPen.canRefill());

        Ink newGelInk = new Ink("Red", "Pilot", InkType.GEL);
        Nib newGelNib = new Nib(0.5, NibType.GEL);
        gelPen.changeRefill(new Refill(newGelInk, newGelNib, true));
        System.out.println("Gel pen ink colour after refill: "
                + gelPen.getRefill().getInk().getColour());

        System.out.println();


        Ink ballInk = new Ink("Black", "Reynolds", InkType.BALL);
        Nib ballNib = new Nib(0.7, NibType.BALL);
        Refill ballRefill = new Refill(ballInk, ballNib, true);
        BallPen ballPen = new BallPen("Reynolds", "045", 20.0, ballRefill);

        ballPen.write();                         // Writing roughly
        System.out.println("Can refill: " + ballPen.canRefill());

        System.out.println();


        Ink throwAwayInk = new Ink("Blue", "Cello", InkType.BALL);
        Nib throwAwayNib = new Nib(0.7, NibType.BALL);
        Refill throwAwayRefill = new Refill(throwAwayInk, throwAwayNib, false);
        ThrowAwayPen throwAwayPen = new ThrowAwayPen("Cello", "Gripper", 5.0, throwAwayRefill);

        throwAwayPen.write();                    // Writing roughly
        System.out.println("Can refill: " + throwAwayPen.canRefill());  // false

        System.out.println();


        Ink fountainInk = new Ink("Green", "Waterman", InkType.FOUNTAIN);
        Nib fountainNib = new Nib(1.0, NibType.FOUNTAIN);
        FountainPen fountainPen = new FountainPen("Waterman", "Expert", 2500.0, fountainInk, fountainNib);

        fountainPen.write();                     // Writing smoothly
        fountainPen.changeInk(new Ink("Purple", "Waterman", InkType.FOUNTAIN));
        System.out.println("Fountain pen ink colour after change: "
                + fountainPen.getInk().getColour());

        System.out.println();


        Ink markerInk = new Ink("Red", "Staedtler", InkType.FOUNTAIN);
        Nib markerNib = new Nib(2.0, NibType.FOUNTAIN);
        MarkerPen markerPen = new MarkerPen("Staedtler", "Triplus", 80.0, markerInk, markerNib);

        markerPen.write();                       // Writing with Marker
    }
}
