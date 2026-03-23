package com.pen.pens;

import com.pen.interfaces.Writable;
import com.pen.models.PenType;
import com.pen.strategies.WritingStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Pen implements Writable {

    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private WritingStrategy writingStrategy;

    @Override
    public void write() {
        writingStrategy.write();
    }
}
