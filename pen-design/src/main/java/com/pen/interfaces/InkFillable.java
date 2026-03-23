package com.pen.interfaces;

import com.pen.models.Ink;

public interface InkFillable {
    void changeInk(Ink ink);
    Ink getInk();
}
