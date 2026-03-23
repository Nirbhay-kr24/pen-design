package com.pen.pens;

import com.pen.interfaces.*;
import com.pen.enums.PenType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Pen implements Writable {
    private String brand;
    private String name;
    private Double price;
    private PenType type;
    private Cover cover;

    public Pen(String brand, String name, Double price, PenType type, Cover cover) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.type = type;
        this.cover = cover;
    }

    public void start() {
        cover.start();
    }

    public abstract void write();

    public void close() {
        cover.close();
    }
}