package com.pen;

import com.pen.enums.PenType;
import com.pen.pens.Pen;
import com.pen.pens.PenFactory;

public class Main {
    public static void main(String[] args) {

        Pen myGelPen = PenFactory.createPen(PenType.GEL, "Pilot", "G2", 120.0);
        Pen myBallPen = PenFactory.createPen(PenType.BALL, "Reynolds", "045", 20.0);
        Pen myFountain = PenFactory.createPen(PenType.FOUNTAIN, "Waterman", "Expert", 2500.0);
        Pen myMarker = PenFactory.createPen(PenType.MARKER, "Uniball", "Posca", 80.0);


        myGelPen.write();
        myBallPen.write();
        myFountain.write();
        myMarker.write();
    }
}