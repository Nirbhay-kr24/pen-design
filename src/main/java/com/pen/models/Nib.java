package com.pen.models;

import com.pen.enums.NibType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Nib {
    private double radius;
    private NibType type;
}