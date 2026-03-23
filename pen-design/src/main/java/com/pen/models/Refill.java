package com.pen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Refill {
    private Ink ink;
    private Nib nib;
    private Boolean refillable;
}
