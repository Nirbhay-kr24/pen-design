package com.pen.models;

import com.pen.enums.InkType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ink {
    private String colour;
    private String brand;
    private InkType type;
}