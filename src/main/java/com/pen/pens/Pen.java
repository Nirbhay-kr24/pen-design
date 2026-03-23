package com.pen.pens;

import com.pen.interfaces.Writable;
import com.pen.enums.PenType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pen implements Writable {
    private String brand;
    private String name;
    private PenType type;
    private Double price;

    public Pen(PenType type) {
        this.type = type;
    }


    public abstract void open();
    public abstract void close();


    @Override
    public abstract void write();
}